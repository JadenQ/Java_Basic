import java.util.Scanner;
/**
 * 
 * @todo ����ÿһλ����֮��
 * @author Jaden
 * @date 2019��11��22��,����10:06:34
 * @copyright Jaden
 */
public class calSum {

	public static void main(String[] args) {
		//1.�õ�Ҫ�������������
		Scanner input = new Scanner(System.in);
		int num = input.nextInt(); //Ҫ����������
		//2.��������
		int sum = 0;
		//3.ѭ�����������ۼӺ�
		while(num > 0) {
			sum += num % 10;  //ȡλ
			num /= 10;   //ȥλ
		}
		//4.��ӡ���
		System.out.println("ÿλ���ֺͣ�"+sum);

	}

}
