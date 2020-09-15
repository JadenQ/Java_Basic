package collection_setDemo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		HashSetDemo();
		LinkedHshSetDemo();
		TreeSet();
	}
	
	public static void TreeSet() {
		TreeSet<String> citySet = new TreeSet<>(
			new Comparator<String>() {
				@Override
				public int compare(String o1,String o2) {
					if(o1.compareTo(o2) > 0) return -1;
					if(o1.compareTo(o2) < 0) return 1;
					return 0;
					}	
				}
	);
		citySet.add("London");
		citySet.add("New York");
		citySet.add("Shanghai");
		citySet.add("Hongkong");
		citySet.add("Tokyo");
		System.out.println("----------");
		citySet.forEach(str -> System.out.println(str+","));
		System.out.println("-----find-----");
		System.out.println(citySet.lower("N"));
		System.out.println("纽约之前的集合："+citySet.headSet("New York"));
		System.out.println("纽约之后的集合："+citySet.tailSet("New York"));
		System.out.println("首元素"+citySet.first());
		//当作队列使用:返回并删除第一个元素
		System.out.println("删除第一个元素："+citySet.pollFirst());
		citySet.forEach(str -> System.out.println(str+","));
		
	}
	
	public static void HashSetDemo() {
		//set:规则集 1.不允许有重复的元素 2.无序  HashSet
		Set<String> citySet = new HashSet<>();
		citySet.add("London");
		citySet.add("New York");
		citySet.add("Shanghai");
		citySet.add("Hongkong");
		citySet.add("Tokyo");
		System.out.println("----------");
		citySet.forEach(str -> System.out.println(str+","));
	}
	
	/**
	 * 着重前后顺序，输出也按照输入时候的顺序
	 * 插入顺序与实际顺序一致
	 */
	public static void LinkedHshSetDemo() {
		Set<String> citySet = new LinkedHashSet<>();
		citySet.add("London");
		citySet.add("New York");
		citySet.add("Shanghai");
		citySet.add("Hongkong");
		citySet.add("Tokyo");
		System.out.println("----------");
		citySet.forEach(str -> System.out.println(str+","));
	}
}
