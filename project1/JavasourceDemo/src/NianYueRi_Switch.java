import java.util.Scanner;
/**
 * 
 * @todo 简单日历
 * @author Jaden
 * @date 2019年11月22日,上午9:30:53
 * @copyright Jaden
 */
public class NianYueRi_Switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1.定义变量:年、月、天
		int year = -1, month= -1, dayofMonth = -1;
		System.out.print("年份：");
		year = input.nextInt();
		System.out.println("月份：");
		month = input.nextInt();
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dayofMonth = 31;
			break;
		case 4:
		case 6:
		case 11:
			dayofMonth = 30;
			break;
		case 2:
			dayofMonth = 28;
			break;
		default:
			System.err.println("只能输入1-12的整型数字");
			System.exit(0);
		}
		//2.根据月份计算当月天数
		//3.如输入为闰年，月份天数+1
		boolean isRunyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);                  //定义一个判断项
		if(isRunyear) {
			dayofMonth++;
		}
		System.out.println(year+"年"+month+"月共有"+dayofMonth+"天。");
	}
}
