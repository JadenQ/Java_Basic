package decorator;
/**
 * װ�������࣬����Ϊ���������ʵ�ֹ�����չ
 * 1.component 2.true component 3.decorator
 * @todo TODO
 * @author Jaden
 * @date 2020��2��7��,����8:54:41
 * @copyright Jaden
 */
public class Decorator extends Component {
	private Component component;
	
	public Decorator(Component component) {
		this.component = component;
	}
	
	@Override
	public void read() {
		//component.read����ʵ����read����
		//������ת����component����ת���������չ
		component.read();
	}
}
