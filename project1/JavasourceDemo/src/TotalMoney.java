import java.util.Scanner;
/**
 * 
 * @todo ������������ٸ�С��500����
 * @author Jaden
 * @date 2019��11��26��,����9:52:38
 * @copyright Jaden
 */
public class TotalMoney {

	public static void main(String[] args) {
		// ѭ������5����ҵ����ѣ�ͳ������С��500���������
		// ������Ѵ��ڵ���500��������С��500��������+1
		//1.ѭ��¼��
		//2.¼����ж��Ƿ�С��500
		//3.�ۼ�С��500�Ĵ���
		int count=0;
		Scanner input = new Scanner(System.in);
		double money = 499;
		for (int i =0; i<5;i++) {
			System.out.println("�����" +(i+1)+"����ҵĽ�");
			money = input.nextDouble();
			
			if(money>=500) {
				continue;
			//count++;          //��һ�䲻�ᱻ����
			}
		}
	}

}
