
public class Method1CalAngels {

	public static void main(String[] args) {
		// 1.设置三个顶点坐标
		int x1 = 90, y1 =100;
		int x2 = 205,y2 = 85;
		int x3 = 310,y3 = 240;
		// 2.套用公式计算三条边长
		double a = Math.sqrt(Math.pow(x2-x3, 2) + Math.pow(y2-y3, 2));
		double b = Math.sqrt(Math.pow(x1-x3, 2) + Math.pow(y1-y3, 2));
		double c = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
		// 3.利用边长求弧度
		double radA = Math.acos((a*a-b*b-c*c)/(-2*b*c));
		double radB = Math.acos((b*b-c*c-a*a)/(-2*a*c));
		double radC = Math.acos((c*c-b*b-a*a)/(-2*b*a));
		
		// 4.弧度->度
		double DegA = Math.toDegrees(radA);
		double DegB = Math.toDegrees(radB);
		double DegC = Math.toDegrees(radC);
		System.out.println(radA);

	}

}
