import java.util.Collections;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String str1 = "a"; String str2 = "b"; String str3 = str1 + str2;
		 * 
		 * //�ײ�ʵ�֣� String str4 = new
		 * StringBuffer(String.valueOf(str1)).append(str2).toString();
		 */
		
		StringBuffer strBuffer1 = new StringBuffer("hello");
		StringBuffer strBuffer2 = new StringBuffer("hello");
		StringBuffer strBuffer3 = new StringBuffer("hello");
		//false
		System.out.println(strBuffer1.equals(strBuffer2));
		//true
		System.out.println(strBuffer1.toString().equals(strBuffer2.toString()));
		
		System.out.println(strBuffer1.reverse()); //��ת�ַ���
		strBuffer1.insert(3, "abd"); //��ĳһ���±괦����ĳԪ��
		System.out.println(strBuffer1);
		
		strBuffer2.delete(2,4); //����ҿ�
		strBuffer2.replace(2, 3, "l");
		strBuffer3.setCharAt(1, 'k'); //����ĳһ��λ���ַ�wei...
		System.out.println(strBuffer2);
		System.out.println(strBuffer3);
		strBuffer1.setLength(0); //ֱ�����
		
		strBuffer3.trimToSize(); //���ռ����õ�ĳһ����
		
		final int N = 80000;
		
		long startTime = System.currentTimeMillis();
		String str = "*";
		for(int i = 0; i < N ; i++) {
			str += "*";
		}
		long endTime = System.currentTimeMillis();
		System.out.println("+=��ʱ��"+(endTime-startTime)+"ms");
		
		//ʹ��string buffer����ƴ��
		startTime = System.currentTimeMillis();
		StringBuffer str1 = new StringBuffer("*");

		for(int i = 0; i < N ; i++) {
			str1.append("*");
		}
		endTime = System.currentTimeMillis();
		System.out.println("buffer��ʱ��"+(endTime-startTime)+"ms");
		
		//ʹ��string builder
		startTime = System.currentTimeMillis();
		StringBuilder str2 = new StringBuilder("*");

		for(int i = 0; i < N ; i++) {
			str2.append("*");
		}
		endTime = System.currentTimeMillis();
		System.out.println("builder��ʱ��"+(endTime-startTime)+"ms");
		
		
	}

}
