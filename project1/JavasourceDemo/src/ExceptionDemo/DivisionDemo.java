package ExceptionDemo;

public class DivisionDemo {
	
	/**
	 * ���������ַ����ֵĳ���
	 * @param strnum1
	 * @param strnum2
	 */
	//ArithmeticException,NumberFormatException
	public static void division(String strnum1, String strnum2) throws ArithmeticException,NumberFormatException{
		int num1 = Integer.parseInt(strnum1); //parseIntʵ�����׳���һ��numberFormatException,��Ϊ��죬���Կ���ֱ�ӵ���
		int num2 = Integer.parseInt(strnum2);
		int result = num1 / num2;
		System.out.println("result = " + result);
	}
	
	public static void main(String[] args) {
		//prefer: �������ķ���throw���쳣��������쳣��������ʱһ��Ҫ��try-catch����
		//������main��������Ҳ�׳�ͬ��һ��������try-catch
		try {
			division("123","aba");
		} catch (ArithmeticException|NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("������������");
	}

}
