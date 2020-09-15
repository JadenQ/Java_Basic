
public class ForceTransferType {
	public static void main(String[] args) {
		double num=90;   //8
		long LongNum=21334234222l;
		//int num1 = num;  //4 大内存类型=》小内存类型 需要强制转换
		//short<int<long<float<double
		int num1 = (int)num;
		int num2 = 5/2; //2
		double num3 = 5/2; //2 先计算整型除法
		double num4 = 5/2d; // 先转换类型
		//取模时结果的符号与第一个操作数一致
		System.out.println(num2);
		//三元操作符：
		int result = num1 > num2 ? 90:80;
		System.out.println(result);
	}
}
