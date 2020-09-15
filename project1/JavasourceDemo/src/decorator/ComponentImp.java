package decorator;
/**
 * װ������ʵ����A
 * @todo TODO
 * @author Jaden
 * @date 2020��2��7��,����8:58:43
 * @copyright Jaden
 */
public class ComponentImp extends Decorator{
	//������������������췽��
	public ComponentImp(Component component) {
		super(component);
	}
	
	@Override
	//�������read����������չ
	public void read() {
		this.extendsReadA();
		super.read();
		this.extendsReadB();
	}
	
	private void extendsReadA() {
		System.out.println("�Զ��巽��A");
	}
	
	private void extendsReadB() {
		System.out.println("�Զ��巽��B");
	}
	
}
