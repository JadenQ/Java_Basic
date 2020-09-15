import java.util.Scanner;
/**
 * 
 * @todo contribution 如果个人贡献度遇到复制就退出
 * @author Jaden
 * @date 2019年11月25日,上午10:59:04
 * @copyright Jaden
 */
public class IndividualContri {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int exp = 0;
		int sum = 0;
		for(;;) {
			System.out.println("请输入本次贡献度");
			exp = new Scanner(System.in).nextInt();
			if(exp < 0) {
				System.out.println("个人贡献度不能为负数，强制退出！");
				break; //break 不是退出if，而是退出最近的一层循环，可以点击查看
			}
		sum += exp;
		}
		System.out.println("您的总贡献度为："+sum);
	}

}
