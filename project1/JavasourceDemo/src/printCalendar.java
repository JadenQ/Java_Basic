import java.util.Scanner;
/**
 * 
 * @todo 1997��7������
 * @author Jaden
 * @date 2019��11��25��,����10:17:28
 * @copyright Jaden
 */
public class printCalendar {

	public static void main(String[] args) {
		//��֪7��1��Ϊ���ڶ�
		int dayofMonth = 31;
		//��ӡ����
		System.out.println("����һ\t���ڶ�\t������\t������\t������\t������\t������");
		System.out.print("\t");
		//�жϺ�ʱ���/t��/n
		for(int i = 1;i <= dayofMonth;i++) {
			System.out.print(i);
			if((i+1)%7 == 0) {
				System.out.print("\n");
			}
			else{
				System.out.print("\t");
			}
		}
	}

}
