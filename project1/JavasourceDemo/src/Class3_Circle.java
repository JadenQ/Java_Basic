//ʹ�÷�װprivate
public class Class3_Circle {
	//��װ���������
	private double radius; //�뾶
	private double perimeter; //zhouchang
	private double area; //square
	
	//���ι���
	public Class3_Circle(double radius) {
		this.setRadius(radius); //ʹ�÷�װ�ķ����������
	}

	//Ĭ�Ϲ���
	public Class3_Circle() {}
	
	//ʹ��radius�ɶ�
	public double getR() {
		return radius;
	}

	public void show() {
		System.out.println("�ܳ���"+this.getPerimeter());
		System.out.println("�����"+this.getArea());
		
	}
	//ʹ��radius��д
	public void setRadius(double radius) {
		//�Է�װ������radius���м򵥵���֤
		if(radius <= 0) {
			radius = 1;
		}
		else {
			this.radius = radius;
			//�Ⱥ��ұ߱�ʾ���洫��İ뾶����߱�ʾ�����е�radius
		}
		
	}
	//ѡ�����Ժ�ʹ���Ҽ�-source-getters and setters�Զ�����
	public double getPerimeter() {
		perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	public double getArea() {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
}
