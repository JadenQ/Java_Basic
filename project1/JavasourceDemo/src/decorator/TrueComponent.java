package decorator;
/**
 * 真正工作的组件类，基本实现了read方法
 * @todo TODO
 * @author Jaden
 * @date 2020年2月7日,下午8:52:28
 * @copyright Jaden
 */
public class TrueComponent extends Component {

	@Override
	public void read() {
		System.out.println("truecomponents!");
	}
	
}
