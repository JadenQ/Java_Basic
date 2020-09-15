import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * ��ʾ������ĳ��÷���
 * @todo TODO
 * @author Jaden
 * @date 2020��1��5��,����10:14:48
 * @copyright Jaden
 */
public class CalendarDemo {

	public static void main(String[] args) throws ParseException {
		//because Calendar.getInstance() return an object of calendar..
		//calendar��һ�������࣬���Բ���new
		Calendar cal = Calendar.getInstance();
		//�鿴������class/����superclass
		System.out.println(cal.getClass().getSuperclass());
		//ʹ��������ӡ��ǰʱ��
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1; //0��ʾ1��
		int day = cal.get(Calendar.DATE); 
		int hour = cal.get(Calendar.HOUR);
		int min = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		//����string���format,����format�ֱ��cal����������ȡ����
		System.out.println("now is :");
		String strTime = String.format("%d-%02d-%02d\t%d:%d:%d",
				year,month,day,hour,min,second);
		System.out.println(strTime);
		
		//Ϊ���������趨ʱ�䣺ֱ�Ӵ�ӡdate����
		cal.set(2012,5,12,14,28,4);
		Date date = cal.getTime();
		System.out.println(date);
		
		//���ڸ�ʽ����:�Լ��趨һ�ָ�ʽ��date->str
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String strDate = format.format(date);
		System.out.println(strDate);
		
		//str->date:���չ̶���format
		Date newDate = format.parse("2022-12-31 23:33:22");
		System.out.println(newDate);
		
		
		//������������
		//û�а취ʵ��һ���µ�calendar�࣬�������಻�ǳ���ģ���gregorian
		GregorianCalendar cal2 = new GregorianCalendar(2019,3,1);
		//����ֱ�ӣ�
		//Calendar cal2 = new GregorianCalendar(2019,3,1);
		long diff = cal.getTimeInMillis() - cal2.getTimeInMillis();
		int diffDays = (int) diff / 60 / 60 / 24;
		System.out.println("���" + diffDays + "��");
		
		//���ڵļӼ�
		cal.add(Calendar.YEAR,3);
		System.out.println(cal.get(Calendar.YEAR)); 
	}

}
