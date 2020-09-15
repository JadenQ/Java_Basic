package interfaceEat;
/**
 * 可食用接口
 * @todo TODO
 * @author Jaden
 * @date 2020年1月7日,上午9:52:38
 * @copyright Jaden
 */
public interface Edible {


		public String name = "define a reign";
		//省略了static,final
		String test();
		//同样，方法也是默认是abstract
		//接口里面也可以写方法实现(java8之后)
		//但是最好写default
		default public void eating() {
			System.out.println("eating1的默认实现");
		}
	}

//两个重名的eating方法在两个接口，如何重写呢？见mouth
interface Edible2 {
	default public void eating() {
		System.out.println("eating2的默认实现");
	}
}

