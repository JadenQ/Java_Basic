
public class RefPass3_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���ô���
		Demo demo = new Demo();
		FailSwap(demo);
		System.out.println(demo.attr1+"\t+\t"+demo.attr2);
		Swap(demo);
		System.out.println(demo.attr1+"\t+\t"+demo.attr2);
	}
	//��Բ����
	static class Demo {
		int attr1 = 10;
		int attr2 = 50;
	}

	public static void FailSwap(Demo demo) {
		//������һ���µĵ�ַ���з������������þɵ�
		demo = new Demo();
		int temp = demo.attr1;
		demo.attr1 = demo.attr2;
		demo.attr2 = temp;
	}
	public static void Swap(Demo demo) {
		int temp = demo.attr1;
		demo.attr1 = demo.attr2;
		demo.attr2 = temp;
	}
	
}
