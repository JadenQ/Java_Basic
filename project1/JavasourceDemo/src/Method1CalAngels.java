
public class Method1CalAngels {

	public static void main(String[] args) {
		// 1.����������������
		int x1 = 90, y1 =100;
		int x2 = 205,y2 = 85;
		int x3 = 310,y3 = 240;
		// 2.���ù�ʽ���������߳�
		double a = Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2));
		double b = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));
		double c = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		// 3.���ñ߳��󻡶�
		double radA = Math.acos((a*a-b*b-c*c)/(-2*b*c));
		double radB = Math.acos((b*b-c*c-a*a)/(-2*a*c));
		double radC = Math.acos((c*c-b*b-a*a)/(-2*b*a));
		
		// 4.����->��
		double DegA = Math.toDegrees(radA);
		double DegB = Math.toDegrees(radB);
		double DegC = Math.toDegrees(radC);
		System.out.println(radA);

	}

}
