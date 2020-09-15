import java.util.Scanner;
public class Class2_Circle {
	
	//圆的半径
	public double radius;
	public double perimeter; //周长
	public double area; //面积
	
	//几种重载
	public Class2_Circle() {
		inputR();
	}
	
	public Class2_Circle(double radius1) {
		if(radius1 > 0) {
			radius = radius1;
		}
		else {
			inputR();
		}
		
	}
	
	/**
	 * 输入半径
	 */
	public void inputR() {
		Scanner input = new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		radius = input.nextDouble();
		input.close();
	}
	
	/**
	 * 输出周长
	 */
	public void showP() {
		if(radius <= 0) {
			inputR(); //未输入时，方法中初始值为0.0
		}
		perimeter = 2 * Math.PI * radius;
		System.out.println("周长："+ perimeter);
	}
	
	/**
	 * 输出面积
	 */
	public void showA() {
		if(radius <= 0) {
			inputR(); //未输入时，方法中初始值为0.0
		}
		area = Math.PI * Math.pow(radius,2);
		System.out.println("面积："+area);
		
	}
	
}
