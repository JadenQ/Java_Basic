import java.util.Scanner;

/**
 * 
 * @todo ֮���ٿ�����ô������
 * @author Jaden
 * @date 2019��11��24��,����11:01:13
 * @copyright Jaden
 */
public class KingofFightiWithoutMusic {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//��������
		
		
		//�������
		//�õ�a-b֮�����ֵ����Ҫģ ��b-a+1���� + a
		//(int)(Math.random()*10000) % 10 + 5 ��5-14��
		//Ŀ�꣺
		//1.��˫��ѡ�����֣����û�ѡ��
		System.out.println("�������û�����");
		String Username = input.next();
		String comName = "����";
		System.out.println(Username + "VS" + comName);
		
		//2.��ʼ��˫�������ݣ�100default��
		int hp1 = 100, hp2 = 100;   //hp1���û���hp2�ǵ��Դ���
		int attack1 = 0, attack2 = 0;
		while(hp1>0 && hp2>0) {
			attack1 = (int)(Math.random()*1000) % 13 + 5;
			attack2 = (int)(Math.random()*998) % 10 + 5;
			
			//����ȹ���
			hp2 -= attack1;
			System.out.println(comName+"�ܵ�"+attack1+"�㹥��,"+"ʣ��Ѫ��Ϊ"+hp2);
			hp1 -= attack2;
			System.out.println(Username+"�ܵ�"+attack2+"�㹥��,"+"ʣ��Ѫ��Ϊ"+hp1);
			
 		}
		System.out.println("KO!");
		if(hp1 > hp2) {
			System.out.println("You win!");
		}
		else {
			System.out.println("You lose!");
		}
		
		
		//3.ʹ��ѭ��ģ���ս���� ���Լ���һЩ���ء�����
		//4.��ӡ���ս��
		
		
	}
}
