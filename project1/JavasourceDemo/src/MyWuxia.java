import java.util.Scanner;

/**
 * 
 * @todo �ҵ��������� ģ������ѡ����
 * @author Jaden
 * @date 2019��11��24��,����1:40:41
 * @copyright Jaden
 */
public class MyWuxia {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String answer = "y";
		String name = null;
		do {
			System.out.println("welcome to �������磬�����ְ�");
			name = input.nextLine();
			System.out.println("ͷ�Σ������뽭����"+name);
			System.out.println("����������֣���y/n��"+name);
			answer = input.nextLine();
		}
		while(!answer.contentEquals("y"));
		// ���Դ�Сд����while(answer.equalsIgnoreCase("y"));
		// ���y�ǳ��� ,�Ƚϣ� while("y".equalsIgnoreCase(answer))
		
		System.out.printf("[%s]��������\n",name);
		
		input.close();
	}
}
