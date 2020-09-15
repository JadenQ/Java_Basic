package ExceptionDemo;

public class Uncheck {
	public static void main(String[] args) {
		//都是runtimeError的子类
		//相对简单，可以用判断语句省略
//		null pointer exception		
//		String value = null;
//		System.out.println(value.toString());
//		//一个对象只实例了空指针：免检
//		
//		//number format exception
//		String strValue = "123a";
//		int value1 = Integer.parseInt(strValue);
//		System.out.println(value1);
		
		//类型转换出现异常：不能将person转为student类型
		//classcastException
		Person p = new Person();
		Student stu = (Student)p;								
	}
}
class Person{}
class Student extends Person{}