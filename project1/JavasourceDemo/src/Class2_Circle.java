import java.util.Scanner;
public class Class2_Circle {
	
	//Բ�İ뾶
	public double radius;
	public double perimeter; //�ܳ�
	public double area; //���
	
	//��������
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
	 * ����뾶
	 */
	public void inputR() {
		Scanner input = new Scanner(System.in);
		System.out.println("������Բ�İ뾶��");
		radius = input.nextDouble();
		input.close();
	}
	
	/**
	 * ����ܳ�
	 */
	public void showP() {
		if(radius <= 0) {
			inputR(); //δ����ʱ�������г�ʼֵΪ0.0
		}
		perimeter = 2 * Math.PI * radius;
		System.out.println("�ܳ���"+ perimeter);
	}
	
	/**
	 * ������
	 */
	public void showA() {
		if(radius <= 0) {
			inputR(); //δ����ʱ�������г�ʼֵΪ0.0
		}
		area = Math.PI * Math.pow(radius,2);
		System.out.println("�����"+area);
		
	}
	
}
