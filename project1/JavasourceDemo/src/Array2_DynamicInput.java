import java.util.Scanner;
/**
 * 
 * @todo ��̬��ֵ��¼��ɼ�����ƽ���ɼ�
 * @author Jaden
 * @date 2019��11��26��,����10:55:42
 * @copyright Jaden
 */
public class Array2_DynamicInput {

	public static void main(String[] args) {
		// ��̬¼��
		Scanner input = new Scanner(System.in);
		final int N = 5;   //�����ñ�����ʾһ������ĳ��ȡ�
		double[] scores = new double[N];
		double sum = 0 , avg;
		for(int i = 0; i < scores.length; i++) {
			System.out.print("������� "+(i+1)+"λͬѧ�ĳɼ���");
			scores[i] = input.nextDouble();
		}
		
		//��ӡ
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.printf("%dλ���۳ɼ���%.2f",scores.length,sum/scores.length);
	}

}
