package ExceptionDemo;
/**
 * �Զ���һ���쳣��С����ʱ����
 * @todo TODO
 * @author Jaden
 * @date 2020��1��13��,����10:19:05
 * @copyright Jaden
 */
public class Lessthan0 extends Exception{
	//��д�������췽���Ϳ�����
	private int value;
	
	
	public Lessthan0() {
		super("���ֲ���С������");
	}
	
	public Lessthan0(int value) {
		super("���������Ϊ��" + value +"����������");
	}
}
