import java.util.Scanner;

public class Class2_UseCircle {
	public static void main(String[] args) {
//		Class2_Circle circle = new Class2_Circle();
//		circle.inputR();
//		circle.showP();
//		circle.showA();
		//���Դ�������Ҳ���Բ���
//		Class2_Circle  circle = new Class2_Circle(25);
//		circle.showA();
		Scanner input = new Scanner(System.in);
		
		Class3_Circle circle2 = new Class3_Circle(3);
		circle2.show();
		
		System.out.println("input the radius");
		double radius = input.nextDouble();
		Class3_Circle circle3 = new Class3_Circle(radius);
		circle3.show();
		
	}
}
