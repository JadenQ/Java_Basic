package decorator;
/**
 * 装饰器的实现类A
 * @todo TODO
 * @author Jaden
 * @date 2020年2月7日,下午8:58:43
 * @copyright Jaden
 */
public class ComponentImp extends Decorator{
	//传递两个组件进来构造方法
	public ComponentImp(Component component) {
		super(component);
	}
	
	@Override
	//在这里对read方法进行扩展
	public void read() {
		this.extendsReadA();
		super.read();
		this.extendsReadB();
	}
	
	private void extendsReadA() {
		System.out.println("自定义方法A");
	}
	
	private void extendsReadB() {
		System.out.println("自定义方法B");
	}
	
}
