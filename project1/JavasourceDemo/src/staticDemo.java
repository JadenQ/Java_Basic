
public class staticDemo {
	
	//����ģʽ��ֻ����һ��
	private static staticDemo me = null;
	private staticDemo() {
		me = this;
	}
	
	public static staticDemo getInstance() {
		if(me == null) {
			me = new staticDemo();
		}
		return me;
	}
//����Ϊ����ģʽʵ��
	//��̬����/�������������ʵ�����ڵ�
	public static int static_num = 1;
	//static�������Ϊ�����ԣ����۶��ٸ�ʵ�������м���
	
	public int normal_num = 1;
	
	//��̬������ֻ�ܵ��þ�̬���Ժͷ���
	public void test() {
		static_num++;
		normal_num++;
	}

	public static void main(String[] args) {
		
		staticDemo staticDemo1 = new staticDemo();
		staticDemo1.test();
		
		System.out.println(staticDemo1.static_num);
		System.out.println(staticDemo1.normal_num);
		//��׼д����
		System.out.println(staticDemo.static_num);
		System.out.println(staticDemo1.normal_num);

		staticDemo staticDemo2 = new staticDemo();
		staticDemo2.test();
		
		System.out.println(staticDemo2.static_num);
		System.out.println(staticDemo2.normal_num);
		//��׼д����
		System.out.println(staticDemo.static_num);
		System.out.println(staticDemo2.normal_num);
		
		
	}
}
