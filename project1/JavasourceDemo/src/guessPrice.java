import java.util.Scanner;
/**
 * 
 * @todo һ�β��и�һ�Ƚ���2-3�β��С�����
 * @author Jaden
 * @date 2019��11��25��,����11:07:30
 * @copyright Jaden
 */
public class guessPrice {

	public static void main(String[] args) {
		//�û�Ҫ�µ�����
		int guessPrice = -1;
		//�û��µĴ���
		//����õ�һ��1000��9000������
		final int price = (((int)(Math.random()*1000))  % 9 + 1) * 1000; //�����޸�final
		int count = 0; 			//�û��µĴ���
		for(int i = 0; i < 5; i++) {
			System.out.println("������������Ʒ�ĵ��ۣ���"+ ++count +"�Ρ�");
			guessPrice = new Scanner(System.in).nextInt();//�û��²�ĵ���
			if(guessPrice == price && count == 1) {
				System.out.println("һ�Ƚ���");
				break;
			}
			else if(guessPrice == price && count <= 3) {
				System.out.println("���Ƚ���");
				break;
			}
			else if(guessPrice == price && count <= 5) {
				System.out.println("���Ƚ���");
				break;
			}
			else {
				if(i<4) {System.out.println("������");}
				else {System.out.println("ʧ�ܣ�");}
				}
		}
		

	}

}
