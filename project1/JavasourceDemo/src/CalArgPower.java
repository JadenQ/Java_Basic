import java.util.Scanner;
/**
 * 
 * @todo 计算平均战斗力
 * @author Jaden
 * @date 2019年11月25日,上午10:11:36
 * @copyright Jaden
 */
public class CalArgPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int power = 0;
		int sum = 0;
		double avg = 0;
		for(int i = 0;i < 3;i++) {
			System.out.println("请输入第"+(i+1)+"位玩家战斗力：");
			power = input.nextInt();
			sum += power;
		}
		avg = sum / 3.0;
		System.out.printf("avg:%.2f",avg);
	}

}
