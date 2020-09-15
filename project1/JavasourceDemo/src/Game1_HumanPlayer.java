/**
 * ���������
 * @todo Ϊ������ҹ���һ����
 * @author Jaden
 * @date 2019��12��13��,����10:00:22
 * @copyright Jaden
 */
public class Game1_HumanPlayer {
	//��̬��������ȭ���͵���Ϣ,ʹ��static final��
	public static final int MessageTypeFist = 1;
	//Ӯ�ñ���ʱ�����Ϣ
	public static final int MessageTypeWin = 2;
	//ʧ�ܱ���ʱ�����Ϣ
	public static final int MessageTypeLose = 3;
	//���ԣ����ơ���������ȭ״̬������Ч����̨��
	private String name;
	private int score;
	private int fist;
	//....
	//��ɫ��ȭ��ʱ��˵��̨��
	private String[] fistWords = {
			"BiuBiu~",
			"�����ɣ�",
			"���Ϥ褦�������ޤ���",
			"Come on!",
			"This is definitly winner!"
	};
	private String[] winWords = {
			"who else?",
			"winner winner chicken dinner",
			"Loser!",
			"so that's ur power?",
			"Attacking!"
	};
	private String[] loseWords = {
			"I WILL NEVER Die!",
			"THANK U FOR DEFEAT ME",
			"WHY!",
			"I WILL COME BACK!",
			"You win, I lose!!�֤���ޤ������������㏊���Ƥ��룡��"
	};
	
	//�������Ϣ���ͣ������ӡ��Ӧ��������Ϣ
	public void sendMessage(int msgType) {
		int index = ((int)(Math.random()*1000)) % 5;
		String message = null;
		if (msgType == MessageTypeFist) {
			message = fistWords[index];
		} else if (msgType == MessageTypeWin) {
			message = winWords[index];
		} else if (msgType == MessageTypeLose) {
			message = loseWords[index];
		}
		System.out.println(message);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getFist() {
		return fist;
	}

	public void setFist(int fist) {
		this.fist = fist;
	}
	
	//�������õ����ơ���������ȭ����������Ч����˵̨��
	
}
