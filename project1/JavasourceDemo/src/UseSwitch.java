import java.util.Scanner;
/**
 * 
 * @todo try switch 可以使用字符型、整型和浮点
 * @author Jaden
 * @date 2019年11月22日,上午9:13:23
 * @copyright Jaden
 */
//目前只实现了1，3
public class UseSwitch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = -1; //保存用户的选择
		System.out.println("1、登陆游戏");
		System.out.println("2、退出游戏");
		choice = input.nextInt();
		if(choice == 1) {
			System.out.println("1.c");
			System.out.println("2.vv");
			System.out.println("3.43");
			System.out.println("4.adf");
			System.out.println("5.asf");
			System.out.println("6.gg");
			System.out.println("请输入选择：");
			choice = input.nextInt();
			switch (choice) {
			case 1:
				
				break;
			case 2:
				break ;
			case 3:
				System.out.println("welcome!");
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;

			default:
				System.out.println("Ilegal input!");
				System.exit(0); // 退出。可以不用break
				
			}
		}
		else if(choice == 2) {
			
		}
		else {
			System.out.println("输入错误，游戏退出");
		}
	}
	
}
