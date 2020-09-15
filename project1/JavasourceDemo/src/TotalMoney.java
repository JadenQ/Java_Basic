import java.util.Scanner;
/**
 * 
 * @todo 消费情况，多少个小于500消费
 * @author Jaden
 * @date 2019年11月26日,上午9:52:38
 * @copyright Jaden
 */
public class TotalMoney {

	public static void main(String[] args) {
		// 循环输入5个玩家的消费，统计消费小于500的玩家数量
		// 如果消费大于等于500，跳过，小于500，计数器+1
		//1.循环录入
		//2.录入后判断是否小于500
		//3.累加小于500的次数
		int count=0;
		Scanner input = new Scanner(System.in);
		double money = 499;
		for (int i =0; i<5;i++) {
			System.out.println("输入第" +(i+1)+"个玩家的金额：");
			money = input.nextDouble();
			
			if(money>=500) {
				continue;
			//count++;          //这一句不会被调用
			}
		}
	}

}
