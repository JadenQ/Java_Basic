import java.util.Scanner;
/**
 * 
 * @todo ������
 * @author Jaden
 * @date 2019��11��22��,����9:30:53
 * @copyright Jaden
 */
public class NianYueRi_Switch {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//1.�������:�ꡢ�¡���
		int year = -1, month= -1, dayofMonth = -1;
		System.out.print("��ݣ�");
		year = input.nextInt();
		System.out.println("�·ݣ�");
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
			System.err.println("ֻ������1-12����������");
			System.exit(0);
		}
		//2.�����·ݼ��㵱������
		//3.������Ϊ���꣬�·�����+1
		boolean isRunyear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);                  //����һ���ж���
		if(isRunyear) {
			dayofMonth++;
		}
		System.out.println(year+"��"+month+"�¹���"+dayofMonth+"�졣");
	}
}
