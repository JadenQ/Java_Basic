package interface_pkGame;

/**
 * �ɹ����ӿڣ�ֻҪʵ���˱��ӿڣ��;߱��˿�ʵʩ��������Ļ�������
 * @todo д�����з���
 * @author Jaden
 * @date 2020��1��6��,����10:31:09
 * @copyright Jaden
 */
public interface Assailable {
	String getName();
	int getX();
	int getY();
	void setX(int x);
	void setY(int y);
	int getHp();
	void setHp(int hp);
	/**
	 * ���ݾ����жϣ��ܷ�ɹ�������һ���߱����������Ķ��󣨾��µ�λ��
	 * @param assa
	 * @return
	 */
	boolean closeEnough(Assailable assa);
	
	/**
	 * ��������һ�����µ�λ
	 * @param assa
	 */
	void fight(Assailable assa);
	
	
}
