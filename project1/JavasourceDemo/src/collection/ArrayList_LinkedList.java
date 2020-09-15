package collection;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_LinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ArrayList��ʱ"+CostTime(new ArrayList<>()));
		System.out.println("LinkedList��ʱ"+CostTime(new LinkedList<>()));
		

	}
	//�������ַ�����ʱ
	public static long CostTime(List<Object> list) {
		Object obj = new Object();
		final int N = 150000;
		long startTime = System.currentTimeMillis();
		//ÿ�ζ���0��λ�����һ��Ԫ�أ�arraylist������
		for(int i =0; i<N; i++) {
			list.add(0,obj);
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

}
