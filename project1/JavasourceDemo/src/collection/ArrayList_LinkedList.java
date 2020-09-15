package collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ArrayList用时"+CostTime(new ArrayList<>()));
		System.out.println("LinkedList用时"+CostTime(new LinkedList<>()));
		

	}
	//测试两种方法用时
	public static long CostTime(List<Object> list) {
		Object obj = new Object();
		final int N = 150000;
		long startTime = System.currentTimeMillis();
		//每次都向【0】位置添加一个元素：arraylist并不利
		for(int i =0; i<N; i++) {
			list.add(0,obj);
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

}
