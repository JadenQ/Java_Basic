package map;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
/**
 * 三中图的基本用法
 * @param args
 */
public class Map_Demo {


	public static void main(String[] args) {
		//Map的基本用法();

		//统计java源文件中每个关键字出现的次数
		统计关键字出现的次数();

	}
	
	public static void 统计关键字出现的次数() {
		final String fileName = "src/lyrics/ReplaceChords.java";
		//定义关键字数组
		final String keywords = "package,import,public,class,void,static,final,new,while,if,catch";
		//1.获得java源文件中的字符串 行的集合:stringBuffer
		List<String> contentList = ReadSourceFile(fileName);
		Set<String> keywordsSet = new HashSet<>(); //可以不用set类型
		//数组-》关键字集合  不必要
		keywordsSet.addAll(Arrays.asList(keywords.split(",")));
		//简单做法：String[] keywordsArray = keywords.split(",");
    	for(String str : contentList) {
			System.out.println(str);
		}
		//2.遍历关键字集合，统计每一个关键字在源文件字符串中出现的次数——将关键字与对应次数以
		//键值的方式存放在Map集合里
    	Map<String, Integer> keywordMap = new HashMap<>();
    	for(String keyword : keywordsSet) { //外循环遍历关键字集合
    		keyword = keyword.trim();  //去掉空格
    		for(String line : contentList) { //内循环 每个关键字都遍历源码的所有行
    			//统计每一行中keywords出现的次数
    			int count = countKWinLine(line,keyword);
    			if(count == 0) continue;
    			//count放入map
    			if(keywordMap.containsKey(keyword)) { //如果关键字出现过
    				int oldCount = keywordMap.get(keyword).intValue(); //取出旧的关键字的数量
    				keywordMap.put(keyword, new Integer(count + oldCount));
    			}
    			else keywordMap.put(keyword,count); //关键字第一次出现
    		}
    	}
		//3.遍历Map集合（一关键字出现的次数排序）
    	for(Entry<String, Integer> entry : keywordMap.entrySet()) {
    		System.out.println(entry.getKey() + "\t" + entry.getValue());
    	}
    	//排序显示
    	System.out.println("____________sorting..._____________");
//    	compare = new MyTreeComparator(keywordsMap)
    	Map<String, Integer> treeMap = new TreeMap<>(new MyTreeComp2(keywordMap));
    	treeMap.putAll(keywordMap);
    	for(Entry<String, Integer> entry:treeMap.entrySet()) {
    		System.out.println(entry.getKey()+"\t"+entry.getValue());
    	}
    	

	}
	
	private static int countKWinLine(String line, String keyword) {
		if(null == line || line.length() == 0) return 0;
		//其他逻辑判断：比如跳过注释行
		if(line.startsWith("/*") || line.startsWith("*") || line.startsWith("*/") ||line.startsWith("//")) {
			return 0;
		}
		int count = 0;
		String strLine = new String(line);
		int index = -1;
		while((index = strLine.indexOf(keyword))!=-1) {
			count++;
			strLine = strLine.substring(index + keyword.length() + 1);
		}
		
		return count;
	}
	
	
	/**
	 * 以字符串返回，读取的传入路径的java源文件
	 * @param fileName
	 * @return
	 */
	private static List<String> ReadSourceFile(String fileName) {
		List<String> contentList = new ArrayList<>();
		try(
			FileReader freader = new FileReader(fileName);
			BufferedReader bfreader = new BufferedReader(freader);) 
		{
			String line = null;
			while((line = bfreader.readLine()) != null) {
				if(line.trim().length() == 1) continue;
				contentList.add(line.trim());
				}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return contentList;
	}

	
	public static void Map的基本用法() {
		//hashMap
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Monkey-Luffy",18);
		hashMap.put("Nami",21);
		hashMap.put("Sanji",22);
		hashMap.put("Nico Robin",15);
		hashMap.put("Rorona Zoro",28);
		//hashmap牺牲了顺序，不按照输入顺序
		System.out.println("hashMap:"+ hashMap);
		
		//LinkedHashMap
		Map<String, Integer> LinkedhashMap = new LinkedHashMap<>();
		LinkedhashMap.put("Monkey-Luffy",18);
		LinkedhashMap.put("Nami",21);
		LinkedhashMap.put("Sanji",22);
		LinkedhashMap.put("Nico Robin",15);
		LinkedhashMap.put("Rorona Zoro",28);
		//按照输入顺序
		System.out.println("linkedhashmao" + LinkedhashMap);
		
		//TreeMap-original
		Map<String, Integer> TreeMap = new TreeMap<>();
		TreeMap.put("Monkey-Luffy",18);
		TreeMap.put("Nami",21);
		TreeMap.put("Sanji",22);
		TreeMap.put("Nico Robin",15);
		TreeMap.put("Rorona Zoro",28);
		//按照键的顺序进行排序：可以排序
		System.out.println("TREEMAP1" + TreeMap);
		
		//TreeMap-selfDefined1 反向按照key名称排序
		Map<String, Integer> TreeMap2 = new TreeMap<>(new MyTreeComp());
		TreeMap2.put("Monkey-Luffy",18);
		TreeMap2.put("Nami",21);
		TreeMap2.put("Sanji",22);
		TreeMap2.put("Nico Robin",15);
		TreeMap2.put("Rorona Zoro",28);
		//按照键的顺序进行排序：可以排序
		System.out.println("TREEMAP2" + TreeMap2);
	
		//TreeMap-selfDefined21 反向按照key名称排序
		Map<String, Integer> TreeMap3 = new TreeMap<>(new MyTreeComp2(LinkedhashMap));
		TreeMap3.put("Monkey-Luffy",18);
		TreeMap3.put("Nami",21);
		TreeMap3.put("Sanji",22);
		TreeMap3.put("Nico Robin",15);
		TreeMap3.put("Rorona Zoro",28);
		//按照键的顺序进行排序：可以排序
		System.out.println("TreeMap3:" + TreeMap3);
		
	//对于其他map，可以使用
		//treeMap.putAll(hashMap); //排序
	}
	
}

//写一个自定义的比较器
/**
 * 默认情况下map的比较器只能对key进行排序： 与原版treeMap排序相反
 * @todo TODO
 * @author Jaden
 * @date 2020年3月4日,上午11:28:10
 * @copyright Jaden
 */
class MyTreeComp implements Comparator<String>{
	@Override
	public int compare(String k1, String k2) {
		if(k1.compareTo(k2) > 0) return -1;
		if(k1.compareTo(k2) < 0) return 1;
		return 0;
	}
}

/**
 * 根据值比较：需要自定义属性
 * @todo TODO
 * @author Jaden
 * @date 2020年3月4日,上午11:34:45
 * @copyright Jaden
 */
class MyTreeComp2 implements Comparator<String>{
	//需要传入一个map
	private Map<String, Integer> map;
	
	//构造方法
	public MyTreeComp2(Map<String, Integer> map) {
		this.map = map;
	}
	
	//利用value比较:年龄顺序
	@Override
	public int compare(String k1, String k2) {
		if(map.get(k1).intValue() > map.get(k2).intValue()) {return 1;}
		if(map.get(k1).intValue() < map.get(k2).intValue()) {return -1;}
		return 0;
	}
}
