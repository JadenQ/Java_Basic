package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo_Old {

	public static void main(String[] args) {
		// Vector��Java1.0�ʹ����ˣ�arraylistjava1.2�Ŵ���
		//Vector ��ʹ�ó�����javame��һЩС�汾����ʹ�ã�arraylist������
		//java1.2֮ǰ��vector�ṩ�˿ɱ��С����
		//swing����ģ�Ͷ�ʹ����vector
		//�����arraylist��vector�еķ����������߳�ͬ����Ч�ʱ�arraylist��
		//Ĭ��capacity������Ϊһ��
		Vector<String> vec = new Vector<>(); //�չ���
		//synchronize:�߳�ͬ��  ������ͬһʱ��ʹ��
		
		vec.add("�����˲�");
		//���:
		vec.add("aaa"); //����boolean
		vec.addElement("aaa"); //void  
		
		System.out.println("size"+vec.size());
		System.out.println("size"+vec.capacity());
		vec.trimToSize();
		
		//ö��:���ڵĵ�����
		Enumeration<String> vecEnum = vec.elements();
		while(vecEnum.hasMoreElements()){
		    System.out.print(vecEnum.nextElement()+",");
		}
		System.out.println();
		//lamda���ʽ
		vec.forEach(str->System.out.print(str+","));
		//��ѯԪ��
		System.out.println("��һ��Ԫ��"+vec.firstElement());
		System.out.println("�±�Ϊ2��Ԫ��"+vec.elementAt(2)+"\t"+vec.get(2));
	}

}
