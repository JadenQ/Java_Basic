//使用封装private
public class Class3_Circle {
	//封装下面的属性
	private double radius; //半径
	private double perimeter; //zhouchang
	private double area; //square
	
	//带参构造
	public Class3_Circle(double radius) {
		this.setRadius(radius); //使用封装的方法输入参数
	}

	//默认构造
	public Class3_Circle() {}
	
	//使得radius可读
	public double getR() {
		return radius;
	}

	public void show() {
		System.out.println("周长："+this.getPerimeter());
		System.out.println("面积："+this.getArea());
		
	}
	//使得radius可写
	public void setRadius(double radius) {
		//对封装的属性radius进行简单的验证
		if(radius <= 0) {
			radius = 1;
		}
		else {
			this.radius = radius;
			//等号右边表示外面传入的半径，左边表示函数中的radius
		}
		
	}
	//选中属性后使用右键-source-getters and setters自动生成
	public double getPerimeter() {
		perimeter = 2 * Math.PI * radius;
		return perimeter;
	}

	public double getArea() {
		area = Math.PI * Math.pow(radius, 2);
		return area;
	}
	
}
