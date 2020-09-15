import java.util.Scanner;
/**
 * 
 * @todo 1997年7月月历
 * @author Jaden
 * @date 2019年11月25日,上午10:17:28
 * @copyright Jaden
 */
public class printCalendar {

	public static void main(String[] args) {
		//已知7月1日为星期二
		int dayofMonth = 31;
		//打印星期
		System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期日");
		System.out.print("\t");
		//判断何时添加/t与/n
		for(int i = 1;i <= dayofMonth;i++) {
			System.out.print(i);
			if((i+1)%7 == 0) {
				System.out.print("\n");
			}
			else{
				System.out.print("\t");
			}
		}
	}

}
