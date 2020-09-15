package decorator;
/**
 * 抽象的组件类，定义组件具有的基本方法
 * inputstream,outputstream,reader,writter等
 * 
 * @todo TODO
 * @author Jaden
 * @date 2020年2月7日,下午8:49:46
 * @copyright Jaden
 */
public abstract class Component {
/**
 * 假设组件中定义了一个通用的read读取方法，要求子类实现
 */
	public abstract void read();
}
