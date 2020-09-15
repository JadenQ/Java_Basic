import java.util.Scanner;
/**
 * 
 * @todo 输入三次密码自动退出
 * @author Jaden
 * @date 2019年11月22日,上午10:21:20
 * @copyright Jaden
 */

public class PasswordDemo {

	public static void main(String[] args) {
		String password = null; //密码初始化，可以用 " "，没有指向任何值
		String userName = ""; //空字符串：用户名
		Scanner input = new Scanner(System.in);
		//可以通过设置常量的方法设置密码：
		final String PASSWORD = "123456";
		System.out.println("请设置密码：");
		String realPassword = input.next();	
		//1.循环结构
		int i = 0;
		while(i < 3) {
			System.out.println("请输入密码:");
			password = input.next();
			
			//字符串判断：
			//if(password.equals(realPassword)) {
			if(!realPassword.equals(password)){ //防止空值不报错
				System.err.println("Wrong Password! You have "+ (2-i) + " times to try.");
				if(i == 2) {System.err.println("已经错误三次，强制退出"); System.exit(0);}
				
			}
			else {
				i = 5; //可以退出循环 
				System.out.println("密码正确！");
				break;
			}
			i++;
		}

		
		//2.考虑循环次数
		//3.输入验证用户名和密码

	}

}
