import java.util.Scanner;

public class Method2WeekDay {

	public static void main(String[] args) {
		// 根据星期得到输出
		System.out.print("请输入星期");
		int dayOfWeek = new Scanner(System.in).nextInt();
		ShowWeekDayByC(dayOfWeek-1);
		ShowWeekDayByE(dayOfWeek-1);
		ShowWeekDayByJ(dayOfWeek-1);
	}
	/**
	 * 
	 * @param 验证输入是否合法，仅在范围内调用，使用private
	 * @return
	 */
	private static boolean isRight(int dayOfWeek) {
		if(dayOfWeek < 1 || dayOfWeek >7) {
			//System.out.println("必须输入1-7之间的数字");
			return false;
		}
		else {return true;}
	}
	
	/**
	 * 
	 * @param 用中文的方式打印星期几 dayOfWeek:1-7的整型数字，用来表示星期
	 */
	//暂时不需要返回值，可以写void返回空值
	public static void ShowWeekDayByC(int dayOfWeek) {
		if(!isRight(dayOfWeek)) {
			System.out.println("必须输入1-7之间的数字");
			return;
		}
		String[] weekdays = {"星期一","星期二","星期三","星期四","星期五","星期六","星期日"};
		System.out.println(weekdays[dayOfWeek]);
	}
	//不可以公共调用
	static void ShowWeekDayByJ(int dayOfWeek) {
		if(!isRight(dayOfWeek)) {
			System.out.println("必须输入1-7之间的数字");
			return;
		}
		String[] weekdays = {"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
		System.out.println(weekdays[dayOfWeek]);
	}
	
	//不加static无法调用
	static void ShowWeekDayByE(int dayOfWeek) {
		if(!isRight(dayOfWeek)) {
			System.out.println("必须输入1-7之间的数字");
			return;
		}//可以提前退出
		String[] weekdays = {"Monday","Tuesday","Wendsday","Thursday","Friday","Saturday","Sunday"};
		System.out.println(weekdays[dayOfWeek]);
	}
	
	
	
}
