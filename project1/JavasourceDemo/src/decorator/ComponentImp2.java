package decorator;

public class ComponentImp2 extends Decorator {
	//传递两个组件进来构造方法
		public ComponentImp2(Component component) {
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
			System.out.println("自定义方法C");
		}
		
		private void extendsReadB() {
			System.out.println("自定义方法D");
		}
}
