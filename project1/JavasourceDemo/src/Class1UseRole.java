
public class Class1UseRole {
	public static void main(String[] args) {
		//使用构造方法之后：
		Class1Role role3 = new Class1Role("hoho", 45, "监察科");
		role3.show();
		
		
		
		//代码解释：左侧表示在栈空间里声明了role1,
		//右侧表示在堆空间里分配了空间，赋值回给role1，实际上在调用默认的构造方法
		//不使用构造方法时：默认一个没有输入的构造
		
		
		/**	Class1Role role1 = new Class1Role();
		//声明了一个Role类型的变量，叫做role1
		Class1Role role2 = null;  //左侧
		role2 = new Class1Role(); //右侧
		
		//使用
		role1.name = "劳拉";
		role1.level = 25;
		role1.job = "stkle";
		role1.doSkill();
		
		role2.name = "孙悟空";
		role2.level = 522;
		role2.job = "god";
		role2.doSkill();
		role2.show();
		**/
		
		
	}
}
