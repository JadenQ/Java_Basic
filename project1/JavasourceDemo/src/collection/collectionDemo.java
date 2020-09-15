package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class collectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//错误： List<String> list1 = new List(); 
		//只能用List的一个子类去实例化，比如arraylist
		//动态数组中可以添加数据，是因为其中有缓存，即default capacity
		//增加数组长度，实通过修改capacity值实现的
		List<String> list1 = new ArrayList<>();
		list1.add("曹操");
		list1.add("曹冲");
		list1.add("曹植");
		list1.add("曹陪");
		list1.add("曹仁");
		System.out.println(list1);
		list1.add(1,"刘玄德");
		System.out.println(list1);
		list1.set(1, "关云长");
		System.out.println(list1);
		
		List<String> list2 = new ArrayList<>();
		list2.add("张翼德");
		list2.add("张飞龙");
		
		list1.addAll(list2);
		System.out.println(list1);
		
		System.out.println("集合的遍历");
		//1.list的遍历
		for(int i = 0; i < list1.size(); i++ ) {
			System.out.print(list1.get(i)+",");
		}
		System.out.println();
		//2.使用foreach遍历
		for(String str : list1) {
			System.out.print(str+",");
		}
		System.out.println();
		//3.使用迭代器遍历
		Iterator<String> it = list1.iterator();
		//使用迭代器的方法相对比较固定
		while(it.hasNext()) {
			System.out.print(it.next()+",");
		}
		System.out.println();
		//4.使用ListIterator迭代器遍历
		ListIterator<String> listIt = list1.listIterator();
		while(listIt.hasNext()) {
			System.out.print(listIt.next()+",");
		}
		System.out.println();
		//使用ListIterator与传统迭代器的区别：
		//1.listIterator不知可以向后访问，也可以向前访问
		//2.ListIterator可以修改集合中的元素 既可以访问也可以修改
		System.out.println("使用ListIterator 从后往前遍历集合元素（逆序）");
		
		//逆序,相当于用list1.size()设置指针到最后面
		ListIterator<String> listIt2 = list1.listIterator(list1.size());
		while(listIt2.hasPrevious()) {
			System.out.print(listIt2.previous()+",");
		}
		System.out.println("\n");
		//3：表示指针放置在第三个位置上
		ListIterator<String> listIt3 = list1.listIterator(3);
		if(listIt3.hasPrevious()) {
			listIt3.previous();
			listIt3.set("赵子龙"); //使用迭代器修改元素
		}
		System.out.println(list1);
	
		
		//删除1
		System.out.println("删除下标为4的元素");
		list1.remove("曹植");
		System.out.println(list1);
		
		//sublist
		System.out.println("sublist(3,5):"+list1.subList(3, 5));
		
	}
	
	
	
	
	//为什么使用迭代器？ 在创建方法的时候：如果不使用迭代器，要写入很多代码细节
//	public void show(List<Student> stuList) {}
//	public void show(List<Teacher> teaList) {}
	//使用迭代器:不需要知道是什么类型的集合
	/**
	 * 在遍历集合时，不依赖任何某一种类的实现
	 * @param it
	 */
	public void show(Iterator<? extends Employee> it) {
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}

class Employee{}
