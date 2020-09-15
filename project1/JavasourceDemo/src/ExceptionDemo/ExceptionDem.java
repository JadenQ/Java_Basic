package ExceptionDemo;

import com.sun.jdi.Value;

public class ExceptionDem {
	//1.声明异常declare exception
	// method() throws Exception1,... 调用该方法要处理这些异常
	
	/**
	 * 两个数字相除
	 * @param num1
	 * @param num2
	 * @return
	 */
	public static int division(int num1,int num2) {
		System.out.println("计算前：");
		int result = Integer.MAX_VALUE;
		try {
			 result = num1 / num2;
		}
		catch(Exception e){
			System.err.println("异常信息"+e.getMessage()); //日志记录
		}
		
		System.out.println("计算后：");//不加try/catch未执行此句
		return result;
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = division(5,0);
		System.out.println("result:"+result);
		

	}

}
