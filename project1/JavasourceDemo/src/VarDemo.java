/**
 * 
 * @todo 定义变量并打印结果
 * @author Jaden
 * @date 2019年11月17日,上午9:54:54
 * @copyright Jaden
 */
public class VarDemo {
	public static void main(String[] args) {
		String brand = "华硕ASUS"; //品牌
		String type = "GTX 1080"; //型号
		int hz = 1569;
		float length = 29.8f; //默认小数is double
		float width = 13.4f;
		double height = 5.25;
		//integer的最大值最小值
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		//取整错误
		System.out.println(1.0-0.9);
		//冗余变量：对内存的浪费
		System.out.println("品牌："+brand);
		System.out.println("型号："+type);
		System.out.println("核心频率："+hz+"Mhz");
		System.out.println("长宽高："+length+"\t"+width+"\t"+height);
		System.out.println("_______分隔符_______");
		System.out.println("商品名称\t单价\t数量\t备注");
		String name1= "巧克力";
		double price1 = 30.9; //单价
		int count1 = 10;	//数量
		String remark1 = "此刻仅丝滑"; //备注
		System.out.printf("%s\t%.2f\t%d\t%s",name1,price1,count1,remark1);
		System.out.println("\n"+name1+"\t"+price1+"\t"+count1+"\t"+remark1);
		//字符串构建
		 String str= String.format("%f",price1);
		 System.out.println(str);
		System.err.println("I'm error!");
	}
}
//变量的命名
