import java.util.Scanner;

public class Pmain {

	public static void main(String[] args) {
		// TODO ÓÃ»§×¢²á
		Scanner input = new Scanner(System.in);
//		String userName = input.next();
		System.out.print("input ur password:");
		
		String password = input.next();
		System.out.println(PstringUtil.validPassword(password));
//		System.out.print("ur email address:");
//		String email = input.next();

	}

}
