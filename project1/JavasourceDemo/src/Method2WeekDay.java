import java.util.Scanner;

public class Method2WeekDay {

	public static void main(String[] args) {
		// �������ڵõ����
		System.out.print("����������");
		int dayOfWeek = new Scanner(System.in).nextInt();
		ShowWeekDayByC(dayOfWeek-1);
		ShowWeekDayByE(dayOfWeek-1);
		ShowWeekDayByJ(dayOfWeek-1);
	}
	/**
	 * 
	 * @param ��֤�����Ƿ�Ϸ������ڷ�Χ�ڵ��ã�ʹ��private
	 * @return
	 */
	private static boolean isRight(int dayOfWeek) {
		if(dayOfWeek < 1 || dayOfWeek >7) {
			//System.out.println("��������1-7֮�������");
			return false;
		}
		else {return true;}
	}
	
	/**
	 * 
	 * @param �����ĵķ�ʽ��ӡ���ڼ� dayOfWeek:1-7���������֣�������ʾ����
	 */
	//��ʱ����Ҫ����ֵ������дvoid���ؿ�ֵ
	public static void ShowWeekDayByC(int dayOfWeek) {
		if(!isRight(dayOfWeek)) {
			System.out.println("��������1-7֮�������");
			return;
		}
		String[] weekdays = {"����һ","���ڶ�","������","������","������","������","������"};
		System.out.println(weekdays[dayOfWeek]);
	}
	//�����Թ�������
	static void ShowWeekDayByJ(int dayOfWeek) {
		if(!isRight(dayOfWeek)) {
			System.out.println("��������1-7֮�������");
			return;
		}
		String[] weekdays = {"������","������","ˮ����","ľ����","������","������","������"};
		System.out.println(weekdays[dayOfWeek]);
	}
	
	//����static�޷�����
	static void ShowWeekDayByE(int dayOfWeek) {
		if(!isRight(dayOfWeek)) {
			System.out.println("��������1-7֮�������");
			return;
		}//������ǰ�˳�
		String[] weekdays = {"Monday","Tuesday","Wendsday","Thursday","Friday","Saturday","Sunday"};
		System.out.println(weekdays[dayOfWeek]);
	}
	
	
	
}
