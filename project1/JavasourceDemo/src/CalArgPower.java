import java.util.Scanner;
/**
 * 
 * @todo ����ƽ��ս����
 * @author Jaden
 * @date 2019��11��25��,����10:11:36
 * @copyright Jaden
 */
public class CalArgPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int power = 0;
		int sum = 0;
		double avg = 0;
		for(int i = 0;i < 3;i++) {
			System.out.println("�������"+(i+1)+"λ���ս������");
			power = input.nextInt();
			sum += power;
		}
		avg = sum / 3.0;
		System.out.printf("avg:%.2f",avg);
	}

}
