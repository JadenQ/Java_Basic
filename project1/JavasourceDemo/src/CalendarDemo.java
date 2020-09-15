import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 演示日历类的常用方法
 * @todo TODO
 * @author Jaden
 * @date 2020年1月5日,上午10:14:48
 * @copyright Jaden
 */
public class CalendarDemo {

	public static void main(String[] args) throws ParseException {
		//because Calendar.getInstance() return an object of calendar..
		//calendar是一个抽象类，所以不能new
		Calendar cal = Calendar.getInstance();
		//查看所属类class/父类superclass
		System.out.println(cal.getClass().getSuperclass());
		//使用日历打印当前时间
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; //0表示1月
		int day = cal.get(Calendar.DATE); 
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		//利用string里的format,利用format分别从cal对象中中提取数据
		System.out.println("now is :");
		String strTime = String.format("%d-%02d-%02d\t%d:%d:%d",
				year,month,day,hour,min,second);
		System.out.println(strTime);
		
		//为日历对象设定时间：直接打印date对象
		cal.set(2012,5,12,14,28,4);
		Date date = cal.getTime();
		System.out.println(date);
		
		//日期格式化类:自己设定一种格式，date->str
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDate = format.format(date);
		System.out.println(strDate);
		
		//str->date:按照固定的format
		Date newDate = format.parse("2022-12-31 23:33:22");
		System.out.println(newDate);
		
		
		//计算相差的天数
		//没有办法实例一个新的calendar类，但其子类不是抽象的，用gregorian
		GregorianCalendar cal2 = new GregorianCalendar(2019,3,1);
		//可以直接：
		//Calendar cal2 = new GregorianCalendar(2019,3,1);
		long diff = cal.getTimeInMillis() - cal2.getTimeInMillis();
		int diffDays = (int) diff / 60 / 60 / 24;
		System.out.println("相差" + diffDays + "天");
		
		//日期的加减
		cal.add(Calendar.YEAR,3);
		System.out.println(cal.get(Calendar.YEAR)); 
	}

}
