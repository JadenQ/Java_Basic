import java.util.Scanner;

/**
 * 
 * @todo ���׵�����
 * @author Jaden
 * @date 2019��11��17��,����9:29:27
 * @copyright Jaden
 */
public class GarrenDemo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("����ֵ��*****");
		System.out.println("��������***");
		System.out.println("�����˺���****");
		double attack = 57.88;
		double attackGrowth = 4.5;
		//input attack and Growth
		System.out.print("�˺���");
		attack = input.nextDouble();
		System.out.print("�˺�����ֵ��");
		attackGrowth = input.nextDouble();
		
		System.out.printf("\n�˺���%.2f(%.2f)\n",attack,attackGrowth);
		String line1 = String.format("\n�˺���%.2f(+%.2f)=%.1f",attack,attackGrowth,attack+attackGrowth);
		System.out.println(line1);
	}
	
}
