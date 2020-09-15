import java.util.Scanner;
/**
 * 
 * @todo 一次猜中给一等奖，2-3次猜中。。。
 * @author Jaden
 * @date 2019年11月25日,上午11:07:30
 * @copyright Jaden
 */
public class guessPrice {

	public static void main(String[] args) {
		//用户要猜的数字
		int guessPrice = -1;
		//用户猜的次数
		//随机得到一个1000到9000的整数
		final int price = (((int)(Math.random()*1000))  % 9 + 1) * 1000; //不可修改final
		int count = 0; 			//用户猜的次数
		for(int i = 0; i < 5; i++) {
			System.out.println("请输入神秘商品的单价：（"+ ++count +"次。");
			guessPrice = new Scanner(System.in).nextInt();//用户猜测的单价
			if(guessPrice == price && count == 1) {
				System.out.println("一等奖！");
				break;
			}
			else if(guessPrice == price && count <= 3) {
				System.out.println("二等奖！");
				break;
			}
			else if(guessPrice == price && count <= 5) {
				System.out.println("三等奖！");
				break;
			}
			else {
				if(i<4) {System.out.println("继续吧");}
				else {System.out.println("失败！");}
				}
		}
		

	}

}
