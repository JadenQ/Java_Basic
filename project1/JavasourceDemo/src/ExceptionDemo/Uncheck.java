package ExceptionDemo;

public class Uncheck {
	public static void main(String[] args) {
		//����runtimeError������
		//��Լ򵥣��������ж����ʡ��
//		null pointer exception		
//		String value = null;
//		System.out.println(value.toString());
//		//һ������ֻʵ���˿�ָ�룺���
//		
//		//number format exception
//		String strValue = "123a";
//		int value1 = Integer.parseInt(strValue);
//		System.out.println(value1);
		
		//����ת�������쳣�����ܽ�personתΪstudent����
		//classcastException
		Person p = new Person();
		Student stu = (Student)p;								
	}
}
class Person{}
class Student extends Person{}