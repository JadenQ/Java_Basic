package collection;

public class ElementDemo<E> {
	
	Object[] objs = new Object[999];
	
	public static void main(String[] args) {

	//�����÷���,��elementDemo�����
//		objs[0] = 1024;
//		objs[1] = "abc";
//		objs[2] = 19.9;
//		objs[3] = new Student();
//		
//		//�Ӷ���������ȡ��������в���
//		Integer value1 = (Integer)objs[0];
//		String value2 = (String)objs[1]; //��Ҫ��ǰ֪��objs�����ݵ����ͣ�д��Ļ�û�б���
//		//�����������ת���쳣����������ʱ�쳣���޷��ڱ������﷢�֣��п�����ɳ����δ֪������߱���
//		System.out.println(value1);
//		System.out.println(value2);
		
	//ʹ�÷��� elementDemo�����,<E>
		//��ʱ�涨EΪinteger
		ElementDemo<Integer> demo = new ElementDemo<Integer>();
		demo.add(2);
		
		ElementDemo<String> demo1 = new ElementDemo<String>();
	}
	
	/**
	 * ����������Ӹ������͵�Ԫ��-����
	 * @param e
	 */
	public void add(E e) {
		//����ʡ��
	}
}

class Student{}