package interfaceEat;
/**
 * ��ʳ�ýӿ�
 * @todo TODO
 * @author Jaden
 * @date 2020��1��7��,����9:52:38
 * @copyright Jaden
 */
public interface Edible {


		public String name = "define a reign";
		//ʡ����static,final
		String test();
		//ͬ��������Ҳ��Ĭ����abstract
		//�ӿ�����Ҳ����д����ʵ��(java8֮��)
		//�������дdefault
		default public void eating() {
			System.out.println("eating1��Ĭ��ʵ��");
		}
	}

//����������eating�����������ӿڣ������д�أ���mouth
interface Edible2 {
	default public void eating() {
		System.out.println("eating2��Ĭ��ʵ��");
	}
}

