import java.util.Scanner;
/**
 * 
 * @todo ��Ǯ����Ǯ
 * @author Jaden
 * @date 2019��11��20��,����10:28:40
 * @copyright Jaden
 */
public class SmallChanges {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("����Ǯ������");
		double money = input.nextDouble();
		
		//������Ԫ����
		int yuan = (int)money;
		int numOfshiyuan = yuan/10;
		int numOfWuyuan = yuan % 10 / 5;
		int numOfYiyuan = yuan % 10 - 5;//Ӧ����If���Ľ�
		//����ǲ���
		int jiao = ((int)(money*10)) % 10;
		int numOfWujiao = jiao / 5; //1��ֽ��
		int numOfYijiao = jiao - 5; //5��ֽ��
		
		//prinT
		System.out.println("10Բֽ��������"+numOfshiyuan);
		System.out.println("5Բֽ��������"+numOfWuyuan);
		System.out.println("1Բֽ��������"+numOfYiyuan);
		System.out.println("5��ֽ��������"+numOfWujiao);
		System.out.println("1��ֽ��������"+numOfYijiao);
	}
}
