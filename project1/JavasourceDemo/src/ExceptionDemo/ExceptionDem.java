package ExceptionDemo;

import com.sun.jdi.Value;

public class ExceptionDem {
	//1.�����쳣declare exception
	// method() throws Exception1,... ���ø÷���Ҫ������Щ�쳣
	
	/**
	 * �����������
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int division(int num1,int num2) {
		System.out.println("����ǰ��");
		int result = Integer.MAX_VALUE;
		try {
			 result = num1 / num2;
		}
		catch(Exception e){
			System.err.println("�쳣��Ϣ"+e.getMessage()); //��־��¼
		}
		
		System.out.println("�����");//����try/catchδִ�д˾�
		return result;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = division(5,0);
		System.out.println("result:"+result);
		

	}

}
