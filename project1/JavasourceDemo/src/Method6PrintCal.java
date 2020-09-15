import java.util.Scanner;
/**
 * 
 * @todo ʹ�÷���ʵ�������Ĵ�ӡ
 * @author Jaden
 * @date 2019��12��6��,����9:50:44
 * @copyright Jaden
 */
public class Method6PrintCal {
	public static int year = Integer.MIN_VALUE; //�û���������
	public static int month = Integer.MIN_VALUE; //�û�������·�
	public static int[] dayOfMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public static void main(String[] args) {
		PrintCalendar(); //���÷�����ӡ

	}
	/**
	 * ��ӡ�����ĺ��ķ���
	 */
	public static void PrintCalendar() {
		// 1.���û�������ݺ��·�
		InputYearMonth();
		//2.����1900-1-1���û�������ݵ���������ĳ���µ���������2017-7������7��1��
		int sum = getSumdayOfYears(); //1900��year�������
		sum += getSumDayOfMonth(); // ��һ��1-1����month��1-1ǰһ�������
		//3.��ӡ��ݺ��·ݣ�Ӣ�ģ�
		//4.��ӡ�·ݵı��⣨���ڣ�
		PrintMonthTitle();
		//5.����ĳ��1�����ڼ�����ӡ��������
		PrintCalendarContent(sum % 7); //��Ϊsumλ
		
	}
	
	/**
	 * ���ݵ���1�������ڼ�����ӡ����������
	 * @param WdayOfFirst ����1�������ڼ�
	 */
	private static void PrintCalendarContent(int WdayOfFirst) {
		
			//WdayOfFirst0-6 ģ7�ľ��棬��һ��
			int sepCount = 0; 
			//sepCount��¼��Ҫ\t������:Ѱ�ҵ�һ�е�����
			if(WdayOfFirst == 0) { //1��������
				sepCount = 6;
			}
			else {sepCount = WdayOfFirst - 1;}
		for(int i = 0; i < sepCount; i++) {
			System.out.print("\t");
		}
		for(int i = 0; i < dayOfMonth[month -1]; i++) {
			System.out.print(i + 1);
			//�ж��ǲ���Ӧ�û���
			if((WdayOfFirst + i) % 7 == 0) {
				System.out.println(); //�������һ����7������������
			}
			else {System.out.print("\t");}
			
		}
	}
	
	/**
	 * 
	 * @param years �Ѿ���һ����̬���������Բ�д�ڷ����������棬Ҳ����д
	 * @return ���شӸ��������ڵ�1900-1-1֮�������
	 */
	private static int getSumdayOfYears() {   
		//��Ҫ�û��Ƿ��Ѿ���ȷ�������
		if(year == Integer.MIN_VALUE || year < 1900 || month < 1 || month >12) {
			System.out.println("��������ȷ�����£�");
			InputYearMonth();
		}
		int sum = 0;
		for(int i = 1900; i < year; i++) {
			sum += 365; 
			if(isLeapYear(i)) { //���������366��
				sum++;
			}			
		}
		return sum;
	}
	
	/**
	 * ��ӡ�����Ŀ�ͷ
	 */
	private static void PrintMonthTitle() {
		String[] monthNames = {"һ��","����","����","����","����","����","����","����","����","ʮ��","ʮһ��","ʮ����"};
		System.out.println(year + "��\t" + monthNames[month-1] +"\t");
		String[] weekdays = {"������","������","ˮ����","ľ����","������","������","������"};
		for(int i = 0; i < weekdays.length; i++) {
			System.out.print(weekdays[i] + "\t");
		}
		System.out.println();
	}
	
	/**
	 * 
	 * @param year �жϵ����
	 * @return ������ͷ�����ֵ
	 */
	private static boolean isLeapYear(int year) {
		return year % 400 == 0 || year % 4 ==0 && year % 100 !=0;
	}
	
	/**
	 * 1.�������������
	 */
	private static void InputYearMonth() {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input year");
		year = input.nextInt();
		System.out.println("input month:");
		month = input.nextInt();
		input.close();
		input = null; //������һ�ռ�
	}
	/**
	 * �õ���year��1��1�ţ���year��month-1�µ����һ���������
	 * @return ����
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
