import java.util.Scanner;
/**
 * 
 * @todo 根据内力值打印角色的能力描述
 * @author Jaden
 * @date 2019年11月21日,下午9:32:55
 * @copyright Jaden
 */
public class MyJianghu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String info = null;
		System.out.print("输入角色的内力值");
		int power = input.nextInt();
		if(power>=0 && power <= 1000) {
			info = "不堪一击"; 
		}
		else if(power<3000) {
			info = "不足为虑";
		}
		System.out.println("你真的是"+info);
	
	}
}
