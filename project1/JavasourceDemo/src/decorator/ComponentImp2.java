package decorator;

public class ComponentImp2 extends Decorator {
	//������������������췽��
		public ComponentImp2(Component component) {
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
			System.out.println("�Զ��巽��C");
		}
		
		private void extendsReadB() {
			System.out.println("�Զ��巽��D");
		}
}
