import java.util.Scanner;
/**
 * 
 * @todo 计算每一位数字之和
 * @author Jaden
 * @date 2019年11月22日,上午10:06:34
 * @copyright Jaden
 */
public class calSum {

	public static void main(String[] args) {
		//1.得到要计算的整型数字
		Scanner input = new Scanner(System.in);
		int num = input.nextInt(); //要分析的数字
		//2.声明变量
		int sum = 0;
		//3.循环操作计算累加和
		while(num > 0) {
			sum += num % 10;  //取位
			num /= 10;   //去位
		}
		//4.打印结果
		System.out.println("每位数字和："+sum);

	}

}
