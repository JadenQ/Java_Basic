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
		//queue.remove(); //��Ԫ�ػᱨ��
		//queue.poll(); //��Ԫ�ز��ᱨ������null
		queue.offer("George Washington");
		queue.offer("John Adams");
		queue.offer("Thomas Jefferson");
		queue.offer("James Madison");
		queue.offer("James Monroe");
		
		System.out.println("���Ӳ�����"+queue.poll()); //���Ӻ�ɾ����һ��Ԫ��
		System.out.println("���Ӳ�����"+queue.peek()); //���Ӻ󣬲�ɾ����һ��Ԫ��
		
		queue.forEach(str -> System.out.println(str));
		
		//���ȶ��� priorityQueue
		//����ʹ��comparable��Ԫ�ص���Ȼ˳��������򣬻���ʹ���Զ����comparator����
		//ӵ����Сֵ��Ԫ�ر�����������ȼ���������ȱ�ɾ��
		queue = new PriorityQueue<String>();
	}

	public static void ArrayDequeDemo() {
		//arrayDeque��������ʵ�ֵ�˫�˶��С�Ĭ�ϵײ�����ĳ���Ϊ16
		//����������Ϊ����ʹ�ã�Ҳ������Ϊջ �� stack���Ƚ������
		//Ԫ�س������ϵ�����ʱ��ϵͳ�ڵײ����·���һ��Object�������洢����
		
		//Queue<String> arrayDeque = new ArrayDeque<>();
		ArrayDeque<String> arrayDeque = new ArrayDeque<>();
		
//		arrayDeque.offer("George Washington");
//		arrayDeque.offer("John Adams");
//		arrayDeque.offer("Thomas Jefferson");
//		arrayDeque.offer("James Madison");
//		arrayDeque.offer("James Monroe");
		
		//���ö��в��룬����ջ����
		System.out.println("��ջ��");
		arrayDeque.push("George Washington");
		arrayDeque.push("John Adams");
		arrayDeque.push("Thomas Jefferson");
		arrayDeque.push("James Madison");
		arrayDeque.push("James Monroe");
		
		arrayDeque.forEach(str -> System.out.println(str));
		
		//������arrayDeque����ջ�ṹʹ�ã���stack�ṹ�ȽϹ��ϣ����� �ϲ�
		//push-��ջ  pop-��ջ   ����ʹ��queue���������
		//�Ƚ����
		System.out.println("��ջ��"+arrayDeque.pop());
		arrayDeque.forEach(str -> System.out.println(str));
		
//		System.out.println("��ջ��");
//	//	arrayDeque.push("ë��");
//		arrayDeque.forEach(str -> System.out.println(str));
		
	}
}
