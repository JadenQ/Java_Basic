import java.util.Scanner;
/**
 * 
 * @todo contribution ������˹��׶��������ƾ��˳�
 * @author Jaden
 * @date 2019��11��25��,����10:59:04
 * @copyright Jaden
 */
public class IndividualContri {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int exp = 0;
		int sum = 0;
		for(;;) {
			System.out.println("�����뱾�ι��׶�");
			exp = new Scanner(System.in).nextInt();
			if(exp < 0) {
				System.out.println("���˹��׶Ȳ���Ϊ������ǿ���˳���");
				break; //break �����˳�if�������˳������һ��ѭ�������Ե���鿴
			}
		sum += exp;
		}
		System.out.println("�����ܹ��׶�Ϊ��"+sum);
	}

}
