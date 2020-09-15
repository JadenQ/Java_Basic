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
		System.out.println("ŦԼ֮ǰ�ļ��ϣ�"+citySet.headSet("New York"));
		System.out.println("ŦԼ֮��ļ��ϣ�"+citySet.tailSet("New York"));
		System.out.println("��Ԫ��"+citySet.first());
		//��������ʹ��:���ز�ɾ����һ��Ԫ��
		System.out.println("ɾ����һ��Ԫ�أ�"+citySet.pollFirst());
		citySet.forEach(str -> System.out.println(str+","));
		
	}
	
	public static void HashSetDemo() {
		//set:���� 1.���������ظ���Ԫ�� 2.����  HashSet
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
	 * ����ǰ��˳�����Ҳ��������ʱ���˳��
	 * ����˳����ʵ��˳��һ��
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
