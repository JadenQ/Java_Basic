import java.util.Scanner;
/**
 * 
 * @todo try switch ����ʹ���ַ��͡����ͺ͸���
 * @author Jaden
 * @date 2019��11��22��,����9:13:23
 * @copyright Jaden
 */
//Ŀǰֻʵ����1��3
public class UseSwitch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice = -1; //�����û���ѡ��
		System.out.println("1����½��Ϸ");
		System.out.println("2���˳���Ϸ");
		choice = input.nextInt();
		if(choice == 1) {
			System.out.println("1.c");
			System.out.println("2.vv");
			System.out.println("3.43");
			System.out.println("4.adf");
			System.out.println("5.asf");
			System.out.println("6.gg");
			System.out.println("������ѡ��");
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
				System.exit(0); // �˳������Բ���break
				
			}
		}
		else if(choice == 2) {
			
		}
		else {
			System.out.println("���������Ϸ�˳�");
		}
	}
	
}
