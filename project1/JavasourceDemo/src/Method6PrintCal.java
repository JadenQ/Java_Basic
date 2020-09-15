import java.util.Scanner;
/**
 * 
 * @todo 使用方法实现月历的打印
 * @author Jaden
 * @date 2019年12月6日,上午9:50:44
 * @copyright Jaden
 */
public class Method6PrintCal {
	public static int year = Integer.MIN_VALUE; //用户输入的年份
	public static int month = Integer.MIN_VALUE; //用户输入的月份
	public static int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static void main(String[] args) {
		PrintCalendar(); //调用方法打印

	}
	/**
	 * 打印阅历的核心方法
	 */
	public static void PrintCalendar() {
		// 1.让用户输入年份和月份
		InputYearMonth();
		//2.计算1900-1-1到用户输入年份的总天数：某个月的月历，如2017-7即计算7月1日
		int sum = getSumdayOfYears(); //1900到year年的天数
		sum += getSumDayOfMonth(); // 这一年1-1到这month月1-1前一天的天数
		//3.打印年份和月份（英文）
		//4.打印月份的标题（星期）
		PrintMonthTitle();
		//5.根据某月1日星期几，打印月历内容
		PrintCalendarContent(sum % 7); //因为sum位
		
	}
	
	/**
	 * 根据当月1号是星期几，打印日历的内容
	 * @param WdayOfFirst 当月1号是星期几
	 */
	private static void PrintCalendarContent(int WdayOfFirst) {
		
			//WdayOfFirst0-6 模7的局面，第一行
			int sepCount = 0; 
			//sepCount记录需要\t的数量:寻找第一行的余量
			if(WdayOfFirst == 0) { //1号是周日
				sepCount = 6;
			}
			else {sepCount = WdayOfFirst - 1;}
		for(int i = 0; i < sepCount; i++) {
			System.out.print("\t");
		}
		for(int i = 0; i < dayOfMonth[month -1]; i++) {
			System.out.print(i + 1);
			//判断是不是应该换行
			if((WdayOfFirst + i) % 7 == 0) {
				System.out.println(); //如果在这一天是7的整除，换行
			}
			else {System.out.print("\t");}
			
		}
	}
	
	/**
	 * 
	 * @param years 已经是一个静态变量，可以不写在方法定义里面，也可以写
	 * @return 返回从给定的日期到1900-1-1之间的天数
	 */
	private static int getSumdayOfYears() {   
		//需要用户是否已经正确输入年份
		if(year == Integer.MIN_VALUE || year < 1900 || month < 1 || month >12) {
			System.out.println("请输入正确的年月！");
			InputYearMonth();
		}
		int sum = 0;
		for(int i = 1900; i < year; i++) {
			sum += 365; 
			if(isLeapYear(i)) { //如果是闰年366天
				sum++;
			}			
		}
		return sum;
	}
	
	/**
	 * 打印日历的开头
	 */
	private static void PrintMonthTitle() {
		String[] monthNames = {"一月","二月","三月","四月","五月","六月","七月","八月","九月","十月","十一月","十二月"};
		System.out.println(year + "年\t" + monthNames[month-1] +"\t");
		String[] weekdays = {"月曜日","火曜日","水曜日","木曜日","金曜日","土曜日","日曜日"};
		for(int i = 0; i < weekdays.length; i++) {
			System.out.print(weekdays[i] + "\t");
		}
		System.out.println();
	}
	
	/**
	 * 
	 * @param year 判断的年份
	 * @return 是闰年就返回真值
	 */
	private static boolean isLeapYear(int year) {
		return year % 400 == 0 || year % 4 ==0 && year % 100 !=0;
	}
	
	/**
	 * 1.接受输入的年月
	 */
	private static void InputYearMonth() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input year");
		year = input.nextInt();
		System.out.println("input month:");
		month = input.nextInt();
		input.close();
		input = null; //丢弃这一空间
	}
	/**
	 * 得到第year年1月1号，到year年month-1月的最后一天的总天数
	 * @return 天数
	 */
	private static int getSumDayOfMonth() {
		int sum = 0;
		for(int i = 0; i< month; i++) {
			sum += dayOfMonth[i];
		}
		if(isLeapYear(year) && month >= 3) {
			sum++;
		}
		return sum;
	}

}
