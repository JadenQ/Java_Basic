package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class collectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� List<String> list1 = new List(); 
		//ֻ����List��һ������ȥʵ����������arraylist
		//��̬�����п���������ݣ�����Ϊ�����л��棬��default capacity
		//�������鳤�ȣ�ʵͨ���޸�capacityֵʵ�ֵ�
		List<String> list1 = new ArrayList<>();
		list1.add("�ܲ�");
		list1.add("�ܳ�");
		list1.add("��ֲ");
		list1.add("����");
		list1.add("����");
		System.out.println(list1);
		list1.add(1,"������");
		System.out.println(list1);
		list1.set(1, "���Ƴ�");
		System.out.println(list1);
		
		List<String> list2 = new ArrayList<>();
		list2.add("�����");
		list2.add("�ŷ���");
		
		list1.addAll(list2);
		System.out.println(list1);
		
		System.out.println("���ϵı���");
		//1.list�ı���
		for(int i = 0; i < list1.size(); i++ ) {
			System.out.print(list1.get(i)+",");
		}
		System.out.println();
		//2.ʹ��foreach����
		for(String str : list1) {
			System.out.print(str+",");
		}
		System.out.println();
		//3.ʹ�õ���������
		Iterator<String> it = list1.iterator();
		//ʹ�õ������ķ�����ԱȽϹ̶�
		while(it.hasNext()) {
			System.out.print(it.next()+",");
		}
		System.out.println();
		//4.ʹ��ListIterator����������
		ListIterator<String> listIt = list1.listIterator();
		while(listIt.hasNext()) {
			System.out.print(listIt.next()+",");
		}
		System.out.println();
		//ʹ��ListIterator�봫ͳ������������
		//1.listIterator��֪���������ʣ�Ҳ������ǰ����
		//2.ListIterator�����޸ļ����е�Ԫ�� �ȿ��Է���Ҳ�����޸�
		System.out.println("ʹ��ListIterator �Ӻ���ǰ��������Ԫ�أ�����");
		
		//����,�൱����list1.size()����ָ�뵽�����
		ListIterator<String> listIt2 = list1.listIterator(list1.size());
		while(listIt2.hasPrevious()) {
			System.out.print(listIt2.previous()+",");
		}
		System.out.println("\n");
		//3����ʾָ������ڵ�����λ����
		ListIterator<String> listIt3 = list1.listIterator(3);
		if(listIt3.hasPrevious()) {
			listIt3.previous();
			listIt3.set("������"); //ʹ�õ������޸�Ԫ��
		}
		System.out.println(list1);
	
		
		//ɾ��1
		System.out.println("ɾ���±�Ϊ4��Ԫ��");
		list1.remove("��ֲ");
		System.out.println(list1);
		
		//sublist
		System.out.println("sublist(3,5):"+list1.subList(3, 5));
		
	}
	
	
	
	
	//Ϊʲôʹ�õ������� �ڴ���������ʱ�������ʹ�õ�������Ҫд��ܶ����ϸ��
//	public void show(List<Student> stuList) {}
//	public void show(List<Teacher> teaList) {}
	//ʹ�õ�����:����Ҫ֪����ʲô���͵ļ���
	/**
	 * �ڱ�������ʱ���������κ�ĳһ�����ʵ��
	 * @param it
	 */
	public void show(Iterator<? extends Employee> it) {
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
	
}

class Employee{}
