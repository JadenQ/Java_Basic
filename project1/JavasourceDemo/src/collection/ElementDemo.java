package collection;

public class ElementDemo<E> {
	
	Object[] objs = new Object[999];
	
	public static void main(String[] args) {

	//不适用泛型,在elementDemo后面空
//		objs[0] = 1024;
//		objs[1] = "abc";
//		objs[2] = 19.9;
//		objs[3] = new Student();
//		
//		//从对象数组中取出对象进行操作
//		Integer value1 = (Integer)objs[0];
//		String value2 = (String)objs[1]; //需要提前知道objs中数据的类型，写错的话没有报错
//		//填错或出现类型转换异常：属于运行时异常，无法在编译器里发现，有可能造成程序的未知错误或者崩溃
//		System.out.println(value1);
//		System.out.println(value2);
		
	//使用泛型 elementDemo后面加,<E>
		//暂时规定E为integer
		ElementDemo<Integer> demo = new ElementDemo<Integer>();
		demo.add(2);
		
		ElementDemo<String> demo1 = new ElementDemo<String>();
	}
	
	/**
	 * 象数组中添加给定类型的元素-泛型
	 * @param e
	 */
	public void add(E e) {
		//代码省略
	}
}

class Student{}