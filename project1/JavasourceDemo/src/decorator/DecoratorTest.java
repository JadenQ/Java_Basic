package decorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
/**
 * 使用场合：1.需要在不影响其他对象的情况下，以动态透明的方式为对象添加功能
 * 2.不适合使用继承，但又想进行方法的扩展时
 * @todo TODO
 * @author Jaden
 * @date 2020年2月7日,下午9:29:26
 * @copyright Jaden
 */
public class DecoratorTest {

	public static void main(String[] args) throws FileNotFoundException {
		// 创建要被装饰的原始对象
		Component component = new TrueComponent();
		//为原始对象透明的增加功能
		//Decorator decoratorA = new ComponentImp(component);
		ComponentImp componentA = new ComponentImp(component);
		componentA.read();
		ComponentImp2 componentB = new ComponentImp2(component);
		componentB.read();
		
		InputStream inputstream = new FileInputStream("");
		//使用带缓存的流对象，装饰输入流对象: 是一个已经写好了的装饰器，只了解使用就可以了
		BufferedInputStream bInStream = new BufferedInputStream(inputstream);
		
	}

}
