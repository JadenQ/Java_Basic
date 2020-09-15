package decorator;
/**
 * 装饰器父类，用来为基本的组件实现功能扩展
 * 1.component 2.true component 3.decorator
 * @todo TODO
 * @author Jaden
 * @date 2020年2月7日,下午8:54:41
 * @copyright Jaden
 */
public class Decorator extends Component {
	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void read() {
		//component.read真正实现了read功能
		//将请求转发给component对象，转发后可以扩展
		component.read();
	}
}
