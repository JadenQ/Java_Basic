import java.util.Scanner;
/**
 * 
 * @todo 我的计算器
 * @author Jaden
 * @date 2019年11月24日,下午1:54:23
 * @copyright Jaden
 */
public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String op = ""; // 运算符初值为空字符串
		double num1,num2,result; //参与计算
		String flag = "";   //用户选择是否继续
		
		do {
			System.out.println("输入两个操作数：(空格隔开)");
			num1 = input.nextDouble();
			num2 = input.nextDouble();
			System.out.println("输入运算符：");
			op = input.next(); // 不能用nextline,会把空格收入
			switch(op) {
			case "+":
				result = num1+num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if(num2==0) {System.out.println("除数不能为0"); result = 0;}
				else {result = num1 / num2;}
				break;
			case "%":
				result = num1 % num2;
				break;
			default:
				System.out.println("未知运算符，失败");
				result = 0;
				break;
			}
			System.out.printf("%.2f %s %.2f = %.2f",num1,op,num2,result);
			System.out.println("\n\n是否继续进行计算？(y/n)");
			flag = input.next(); //使用nextline会让程序结束
		}
		while("y".equalsIgnoreCase(flag));
		
	}
}
