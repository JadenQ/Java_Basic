package collection_Queue;
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//LinkedListDemo();
		ArrayDequeDemo();
	}
	
	public static void LinkedListDemo() {
		Queue<String> queue = new LinkedList<>();
		//queue.remove(); //无元素会报错
		//queue.poll(); //无元素不会报错，返回null
		queue.offer("George Washington");
		queue.offer("John Adams");
		queue.offer("Thomas Jefferson");
		queue.offer("James Madison");
		queue.offer("James Monroe");
		
		System.out.println("出队操作："+queue.poll()); //出队后，删除第一个元素
		System.out.println("出队操作："+queue.peek()); //出队后，不删除第一个元素
		
		queue.forEach(str -> System.out.println(str));
		
		//优先队列 priorityQueue
		//可以使用comparable以元素的自然顺序进行排序，或者使用自定义的comparator子类
		//拥有最小值的元素被赋予最高优先级，因此最先被删除
		queue = new PriorityQueue<String>();
	}

	public static void ArrayDequeDemo() {
		//arrayDeque基于数组实现的双端队列。默认底层数组的长度为16
		//不仅可以作为队列使用，也可以作为栈 ： stack（先进后出）
		//元素超过集合的容量时，系统在底层重新分配一个Object数组来存储数据
		
		//Queue<String> arrayDeque = new ArrayDeque<>();
		ArrayDeque<String> arrayDeque = new ArrayDeque<>();
		
//		arrayDeque.offer("George Washington");
//		arrayDeque.offer("John Adams");
//		arrayDeque.offer("Thomas Jefferson");
//		arrayDeque.offer("James Madison");
//		arrayDeque.offer("James Monroe");
		
		//不用队列插入，用入栈插入
		System.out.println("入栈：");
		arrayDeque.push("George Washington");
		arrayDeque.push("John Adams");
		arrayDeque.push("Thomas Jefferson");
		arrayDeque.push("James Madison");
		arrayDeque.push("James Monroe");
		
		arrayDeque.forEach(str -> System.out.println(str));
		
		//尽量将arrayDeque当作栈结构使用，但stack结构比较古老，性能 较差
		//push-入栈  pop-出栈   不能使用queue父类对象定义
		//先进后出
		System.out.println("出栈："+arrayDeque.pop());
		arrayDeque.forEach(str -> System.out.println(str));
		
//		System.out.println("入栈：");
//	//	arrayDeque.push("毛泽东");
//		arrayDeque.forEach(str -> System.out.println(str));
		
	}
}
