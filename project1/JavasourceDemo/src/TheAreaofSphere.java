/**
 * 
 * @todo 计算园的面积
 * @author Jaden
 * @date 2019年11月17日,下午4:59:13
 * @copyright Jaden
 */
import java.util.Scanner;


public class TheAreaofSphere {
	public static void main(String[] args) {
		//input:扫描对象
		Scanner inputR = new Scanner(System.in);
		//Scanner Brand = new Scanner(System.in);
		
		//System.out.println("请输入圆的半径：");
		//double radius = inputR.nextDouble(); //输入双浮点
		//System.out.println("请输入品牌1：");
		//String brand1 = Brand.next(); //只读入空格之前的内容
		//System.out.println("请输入品牌2："); 
		//String brand2 = Brand.nextLine();//回车和空格都被读入
		
		//double area = 3.14*radius*radius;
		//System.out.printf("the area is:%.3f\n",area);
		//System.out.println(brand1);
		//System.out.println(brand2);
		//int count = input.nextInt(); // next int,long...
		
		//难点：录入char类型
		System.out.print("sex:");
		char sex = inputR.next().charAt(0);
		System.out.println("sex:"+sex);

	}
}
