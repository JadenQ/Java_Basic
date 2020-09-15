package ExceptionDemo;
import java.util.Scanner;
//输入不匹配异常实例
//用户输入年龄只能是整型数字，并使用异常处理机制捕获处理异常情况
public class inputMismatchDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("输入年龄：");
		int age = -1;
		try {
			age = input.nextInt();
			age = age / 0;
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
		}
		//可以使用多个catch，捕获多种catch
		//或者catch(Exception1|Exception2...)
		catch(Exception e) { //如果catch错误，可能捕获不到
			e.printStackTrace();//堆栈方式打印错误信息。是throw里的方法
			System.err.println(e.getMessage());
		}
		
		//int age = input.nextInt(); //并不安全的异常处理
		System.out.println("输入的年龄为："+age);
		//只有system.exit(0)时候不执行finally
		//在出现错误的时候，利用finally块再执行完毕后强制要求关闭所有打开的资源
		//可以省略catch,但是不会打印异常信息
		//finally里面的代码一定能执行，即使异常类型不匹配
		//finally {
			
	//	}

	}

}
