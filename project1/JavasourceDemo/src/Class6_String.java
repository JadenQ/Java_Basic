
public class Class6_String {

	public static void main(String[] args) {
		String value = "中国人民解放军";
		value += "斯国一";
		value.concat("，牛!");
		value = value.concat("，强！"); //字符串不可变性，没有覆盖原来value的值
		System.out.println(value);
		
		//用不同方式船舰字符串
		String name1 = "xueyuan";
		String name2 = "xueyuan";
		
		//开了新的地址进行存储
		String name3 = new String("xueyuan");
		String name4 = new String("xueyuan");
		
		System.out.println(name1 == name2);
		System.out.println(name3 == name1);
		System.out.println(name3 == name4);
		
		String value1 = "Hello world";
		value1 += "good"; //相当于调用了concat,直接返回一个新的字符串对象空间
		
		String value2 = "Hello worldgood";
		
		System.out.println(value1 == value2);
		System.out.println(value1.equals(value2));
	}

}
