import java.util.Scanner;
/**
 * 
 * @todo Ӳ�������Ƿ�Ϸ���
 * @author Jaden
 * @date 2019��11��20��,����10:53:59
 * @copyright Jaden
 */
public class LegalTitle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("plz input the title.");
		char ch = input.next().charAt(0); //ȡ����һ���ַ�
		if(ch >= 'A'&& ch <= 'z') {
			System.out.println("legal name");
		}
		else {
			System.err.println("ilegal name");
		}
		
	}

	
	
}
