import java.util.Scanner;
/**
 * 
 * @todo ��������ֵ��ӡ��ɫ����������
 * @author Jaden
 * @date 2019��11��21��,����9:32:55
 * @copyright Jaden
 */
public class MyJianghu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String info = null;
		System.out.print("�����ɫ������ֵ");
		int power = input.nextInt();
		if(power>=0 && power <= 1000) {
			info = "����һ��"; 
		}
		else if(power<3000) {
			info = "����Ϊ��";
		}
		System.out.println("�������"+info);
	
	}
}
