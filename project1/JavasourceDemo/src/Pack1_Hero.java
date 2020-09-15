
public class Pack1_Hero {
	String name; //无初值，直接初始一个Null
	public void test1() {
		//如果在方法内命名name，则需要声明一个空字符串
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		new Pack1_Hero().test1();
	}
}
