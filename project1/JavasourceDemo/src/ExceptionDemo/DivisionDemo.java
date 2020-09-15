package ExceptionDemo;

public class DivisionDemo {
	
	/**
	 * 计算两个字符数字的除法
	 * @param strnum1
	 * @param strnum2
	 */
	//ArithmeticException,NumberFormatException
	public static void division(String strnum1, String strnum2) throws ArithmeticException,NumberFormatException{
		int num1 = Integer.parseInt(strnum1); //parseInt实际上抛出了一个numberFormatException,因为免检，所以可以直接调用
		int num2 = Integer.parseInt(strnum2);
		int result = num1 / num2;
		System.out.println("result = " + result);
	}
	
	public static void main(String[] args) {
		//prefer: 如果定义的方法throw了异常（非免检异常），调用时一定要用try-catch处理
		//或者在main函数里面也抛出同样一场，不用try-catch
		try {
			division("123","aba");
		} catch (ArithmeticException|NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("程序正常结束");
	}

}
