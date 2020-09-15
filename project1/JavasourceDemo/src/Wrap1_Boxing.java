
public class Wrap1_Boxing {

	public static void main(String[] args) {

		// TODO 包装类——装箱、拆箱

		Integer num1 = 100; //自动装箱
		//Integer num1 = Integer.valueOf(200);
		Integer num2 = 100;
		System.out.println(num1 == num2);
		//num1,num2在-128到127之间，直接使用已经缓存好的对象
		//即空间是同一个，没有使用新的空间
		Integer num3 = 200; //自动装箱
		//Integer num1 = Integer.valueOf(200);
		Integer num4 = 200;
		System.out.println(num3 == num4);
		//相等返回0，
		System.out.println(num1.compareTo(num2));
		
		
		/*
		 * //double 展示： double num1 = 3.14; //两种装箱的方法
		 * 
		 * @SuppressWarnings("deprecation") Double dNum1 = new Double("3.14"); //Double
		 * dNum1_1 = new Double.valueOf(num1); Double dNum1_2 = 3.13; //自动装箱
		 * 
		 * //拆箱 num1 = dNum1_2.doubleValue(); //取出其中的数值 num1 = dNum1;
		 * //自动拆箱——摆脱了其他属性，只保留值
		 * 
		 * 
		 * System.out.println(num1+"\t"+dNum1);
		 */
	}

}
