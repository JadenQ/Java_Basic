
public class staticDemo {
	
	//单例模式：只能有一个
	private static staticDemo me = null;
	private staticDemo() {
		me = this;
	}
	
	public static staticDemo getInstance() {
		if(me == null) {
			me = new staticDemo();
		}
		return me;
	}
//以上为单例模式实现
	//静态属性/方法是先于类的实例存在的
	public static int static_num = 1;
	//static可以理解为类属性，无论多少个实例，都有记忆
	
	public int normal_num = 1;
	
	//静态方法中只能调用静态属性和方法
	public void test() {
		static_num++;
		normal_num++;
	}

	public static void main(String[] args) {
		
		staticDemo staticDemo1 = new staticDemo();
		staticDemo1.test();
		
		System.out.println(staticDemo1.static_num);
		System.out.println(staticDemo1.normal_num);
		//标准写法：
		System.out.println(staticDemo.static_num);
		System.out.println(staticDemo1.normal_num);

		staticDemo staticDemo2 = new staticDemo();
		staticDemo2.test();
		
		System.out.println(staticDemo2.static_num);
		System.out.println(staticDemo2.normal_num);
		//标准写法：
		System.out.println(staticDemo.static_num);
		System.out.println(staticDemo2.normal_num);
		
		
	}
}
