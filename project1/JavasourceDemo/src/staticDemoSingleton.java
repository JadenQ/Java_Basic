//单例模式测试：无论实例多少次，都是只有一个
public class staticDemoSingleton {
	public static void main(String[] args) {
		staticDemo staticDemo1 = staticDemo.getInstance();
		System.out.println(staticDemo1.normal_num);
		
		staticDemo staticDemo2 = staticDemo.getInstance();
		staticDemo2.normal_num = 1024;
		
		staticDemo staticDemo3 = staticDemo.getInstance();
		System.out.println(staticDemo3.normal_num);
		
		System.out.println(staticDemo2 == staticDemo3);
	}
}
