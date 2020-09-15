/**
 * 
 * @todo 
 *      2015年交易额为800亿元，每年递增25%，哪一年交易额到2000亿?
 * @author Jaden
 * @date 2019年11月22日,上午10:55:06
 * @copyright Jaden
 */
public class AlibabaTrade {

	public static void main(String[] args) {
		//循环变量：
		int year = 2015;
		double money = 800;
		while(money <= 2000) {
			year++;
			money *= 1.25;			
		}
		System.out.println("在第" + year+ "年，交易额达到/超过2000亿元"+"即"+money+"亿元！");
		String str = String.format("%d年，交易额达到了%.2f亿元，超越2000亿元！",year,money);
		System.out.println(str);
	}

}
