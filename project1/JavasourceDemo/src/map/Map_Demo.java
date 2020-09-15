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
 * ����ͼ�Ļ����÷�
 * @param args
 */
public class Map_Demo {


	public static void main(String[] args) {
		//Map�Ļ����÷�();

		//ͳ��javaԴ�ļ���ÿ���ؼ��ֳ��ֵĴ���
		ͳ�ƹؼ��ֳ��ֵĴ���();

	}
	
	public static void ͳ�ƹؼ��ֳ��ֵĴ���() {
		final String fileName = "src/lyrics/ReplaceChords.java";
		//����ؼ�������
		final String keywords = "package,import,public,class,void,static,final,new,while,if,catch";
		//1.���javaԴ�ļ��е��ַ��� �еļ���:stringBuffer
		List<String> contentList = ReadSourceFile(fileName);
		Set<String> keywordsSet = new HashSet<>(); //���Բ���set����
		//����-���ؼ��ּ���  ����Ҫ
		keywordsSet.addAll(Arrays.asList(keywords.split(",")));
		//��������String[] keywordsArray = keywords.split(",");
    	for(String str : contentList) {
			System.out.println(str);
		}
		//2.�����ؼ��ּ��ϣ�ͳ��ÿһ���ؼ�����Դ�ļ��ַ����г��ֵĴ����������ؼ������Ӧ������
		//��ֵ�ķ�ʽ�����Map������
    	Map<String, Integer> keywordMap = new HashMap<>();
    	for(String keyword : keywordsSet) { //��ѭ�������ؼ��ּ���
    		keyword = keyword.trim();  //ȥ���ո�
    		for(String line : contentList) { //��ѭ�� ÿ���ؼ��ֶ�����Դ���������
    			//ͳ��ÿһ����keywords���ֵĴ���
    			int count = countKWinLine(line,keyword);
    			if(count == 0) continue;
    			//count����map
    			if(keywordMap.containsKey(keyword)) { //����ؼ��ֳ��ֹ�
    				int oldCount = keywordMap.get(keyword).intValue(); //ȡ���ɵĹؼ��ֵ�����
    				keywordMap.put(keyword, new Integer(count + oldCount));
    			}
    			else keywordMap.put(keyword,count); //�ؼ��ֵ�һ�γ���
    		}
    	}
		//3.����Map���ϣ�һ�ؼ��ֳ��ֵĴ�������
    	for(Entry<String, Integer> entry : keywordMap.entrySet()) {
    		System.out.println(entry.getKey() + "\t" + entry.getValue());
    	}
    	//������ʾ
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
		//�����߼��жϣ���������ע����
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
	 * ���ַ������أ���ȡ�Ĵ���·����javaԴ�ļ�
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

	
	public static void Map�Ļ����÷�() {
		//hashMap
		Map<String, Integer> hashMap = new HashMap<>();
		hashMap.put("Monkey-Luffy",18);
		hashMap.put("Nami",21);
		hashMap.put("Sanji",22);
		hashMap.put("Nico Robin",15);
		hashMap.put("Rorona Zoro",28);
		//hashmap������˳�򣬲���������˳��
		System.out.println("hashMap:"+ hashMap);
		
		//LinkedHashMap
		Map<String, Integer> LinkedhashMap = new LinkedHashMap<>();
		LinkedhashMap.put("Monkey-Luffy",18);
		LinkedhashMap.put("Nami",21);
		LinkedhashMap.put("Sanji",22);
		LinkedhashMap.put("Nico Robin",15);
		LinkedhashMap.put("Rorona Zoro",28);
		//��������˳��
		System.out.println("linkedhashmao" + LinkedhashMap);
		
		//TreeMap-original
		Map<String, Integer> TreeMap = new TreeMap<>();
		TreeMap.put("Monkey-Luffy",18);
		TreeMap.put("Nami",21);
		TreeMap.put("Sanji",22);
		TreeMap.put("Nico Robin",15);
		TreeMap.put("Rorona Zoro",28);
		//���ռ���˳��������򣺿�������
		System.out.println("TREEMAP1" + TreeMap);
		
		//TreeMap-selfDefined1 ������key��������
		Map<String, Integer> TreeMap2 = new TreeMap<>(new MyTreeComp());
		TreeMap2.put("Monkey-Luffy",18);
		TreeMap2.put("Nami",21);
		TreeMap2.put("Sanji",22);
		TreeMap2.put("Nico Robin",15);
		TreeMap2.put("Rorona Zoro",28);
		//���ռ���˳��������򣺿�������
		System.out.println("TREEMAP2" + TreeMap2);
	
		//TreeMap-selfDefined21 ������key��������
		Map<String, Integer> TreeMap3 = new TreeMap<>(new MyTreeComp2(LinkedhashMap));
		TreeMap3.put("Monkey-Luffy",18);
		TreeMap3.put("Nami",21);
		TreeMap3.put("Sanji",22);
		TreeMap3.put("Nico Robin",15);
		TreeMap3.put("Rorona Zoro",28);
		//���ռ���˳��������򣺿�������
		System.out.println("TreeMap3:" + TreeMap3);
		
	//��������map������ʹ��
		//treeMap.putAll(hashMap); //����
	}
	
}

//дһ���Զ���ıȽ���
/**
 * Ĭ�������map�ıȽ���ֻ�ܶ�key�������� ��ԭ��treeMap�����෴
 * @todo TODO
 * @author Jaden
 * @date 2020��3��4��,����11:28:10
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
 * ����ֵ�Ƚϣ���Ҫ�Զ�������
 * @todo TODO
 * @author Jaden
 * @date 2020��3��4��,����11:34:45
 * @copyright Jaden
 */
class MyTreeComp2 implements Comparator<String>{
	//��Ҫ����һ��map
	private Map<String, Integer> map;
	
	//���췽��
	public MyTreeComp2(Map<String, Integer> map) {
		this.map = map;
	}
	
	//����value�Ƚ�:����˳��
	@Override
	public int compare(String k1, String k2) {
		if(map.get(k1).intValue() > map.get(k2).intValue()) {return 1;}
		if(map.get(k1).intValue() < map.get(k2).intValue()) {return -1;}
		return 0;
	}
}
