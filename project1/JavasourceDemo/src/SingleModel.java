
/**
 * ����ģʽ
 * @todo TODO
 * @author Jaden
 * @date 2020��1��4��,����11:31:26
 * @copyright Jaden
 */
public class SingleModel {
	
	//1.��˽�е�ʵ��
	private static SingleModel me = null;
	
	 
	public int count = 0;
	//2.���췽��Ϊ˽��
	private SingleModel() {
		count++;
	}
	//���ˣ����������κ������ط�ʵ��singlemodel
	
	/**
	 * ����������һ��������һ��ʵ������֮�����getInstance����
	 * 3.��ʵ������ֻ��һ��
	 * @return
	 */
	public static SingleModel getInstance() {
		if(null == me) me = new SingleModel();
		return me;
	}
	
}
