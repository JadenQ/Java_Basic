import java.util.Scanner;
/**
 * 
 * @todo 硬盘命名是否合法？
 * @author Jaden
 * @date 2019年11月20日,上午10:53:59
 * @copyright Jaden
 */
public class LegalTitle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("plz input the title.");
		char ch = input.next().charAt(0); //取出第一个字符
		if(ch >= 'A'&& ch <= 'z') {
			System.out.println("legal name");
		}
		else {
			System.err.println("ilegal name");
		}
		
	}

	
	
}
