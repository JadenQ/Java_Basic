package collection;
import java.util.Collection;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class CollectionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intCollection = new ArrayList<>();
		intCollection.add(123);
		intCollection.add(13);
		intCollection.add(13);
		intCollection.add(23);
		intCollection.add(1);
		intCollection.add(3);
		
		//用随机种子随机
		intCollection.forEach(value -> System.out.println(value+","));
		Collections.shuffle(intCollection,new Random(20)); //只有不用父类collection ,用List才可以
		System.out.println("\n乱序后");
		intCollection.forEach(value -> System.out.println(value+","));
		
		Collections.shuffle(intCollection,new Random(20)); //只有不用父类collection ,用List才可以
		System.out.println("\n乱序后");
		intCollection.forEach(value -> System.out.println(value+","));
		
		System.out.println("集合的复制");
		List<Integer> longCol = new ArrayList<>();  //设置空间
		longCol.add(123);
		longCol.add(13);
		longCol.add(103);
		longCol.add(123);
		longCol.add(13);
		longCol.add(103);
		Collections.copy(longCol, intCollection);//长度要相同
		longCol.forEach(value -> System.out.println(value+","));
		
		//有无公共元素
		System.out.println(Collections.disjoint(intCollection, longCol));
		System.out.println("显示集合中指定元素出现的次数："+Collections.frequency(longCol,13));
		
		//补充：使用arrays.asList转换成的list集合中，无法使用add方法（长度固定了）
		//字符串数组-》list
		List<String> strList = Arrays.asList("abc","223","232");
		
	}

}
