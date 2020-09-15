import java.util.Scanner;
/**
 * ��Ϸ���䣺�Ƿ���+����+������Ϸ�����
 * @todo TODO
 * @author Jaden
 * @date 2019��12��13��,����10:47:13
 * @copyright Jaden
 */
public class Game1_Room {
	//���ԣ����Ƿ��ƣ���(����)��������Ϸ����ҡ������
	private Game1_HumanPlayer player1 = null;
	private Game1_DigitPlayer player2 = null;
	
	/**����id*/
	private long roomID;
	/**��������*/
	private String roomName;
	/**��������*/
	private String roomPass;
	
	/**
	 ���췽��*/
		
	public Game1_Room() {
		initGame();
		startGame();
		endGame(); 
	}
	
	//��ʼ����Ϸ
	public void initGame() {
		//1.ʵ�����������
		player1 = new Game1_HumanPlayer();
		player2 = new Game1_DigitPlayer();
		//2.��ʼ����Ϸ����������
		System.out.println("������......");
		for(int i = 0; i < 40; i++) {
			System.out.print("+");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("\n���سɹ���");
	}
	//��ʼ��Ϸ
	public void startGame() {
		showMenu();
		chooseRole();
		game1_Cycle();
		//��ӡ��� 
	}
	//��Ϸ��ѭ����
	private void game1_Cycle() {
		while(true) {
			//˫����ȭ
			System.out.println(player1.getName()+"�����ȭ��");
			Scanner input = new Scanner(System.in);
			player1.setFist(input.nextInt());
			int fist1 = player1.getFist();
			//��close,��ֹ�����ٴε��ó�������input.close();
			//���2 
			int fist2 = player2.getFist(); //�Ѿ�д���������ȭ
			//�ж���Ӯ
			int result = judge(fist1,fist2);
			//"-1"-���1 win "0"-��ƽ  "1"-���2 win
			if(result == -1) {
				player1.sendMessage(Game1_HumanPlayer.MessageTypeWin);
				player2.sendMessage(Game1_DigitPlayer.MessageTypeLose);
				System.out.println("Player1Ӯһ�ѣ�");
			}
			else if(result == 0) {
				System.out.println("ƽ���ǣ�");	
			}
			else if(result == 1) {
				player1.sendMessage(Game1_HumanPlayer.MessageTypeLose);
				player2.sendMessage(Game1_DigitPlayer.MessageTypeWin);
				System.out.println("Player2Ӯһ�ѣ�");
			}
			System.out.println("�Ƿ�����һ�֣�[y/n]");
			String answer = new Scanner(System.in).next();
			if(!"y".equalsIgnoreCase(answer)) {
				break;
			}
		}
	}
	//��ʾ�˵�
	public void showMenu() {
		System.out.println("\n--��ӭ���롶"+roomName+"����Ϸ����--");
		System.out.println("��ȭ���� 1-���� 2-ʯͷ 3-��");
	}
	//ѡ���ɫ
	public void chooseRole() {
		System.out.println("�Է���ɫ��1.��� 2.���� 3.���� 4.����");
		System.out.println("��ѡ��");
		//ʡ�Զ�����Ϸ��Ե���֤
		int choice = new Scanner(System.in).nextInt();
		String[] nameArray = {"���","����","����","����"};
		player2.setName(nameArray[choice - 1]);
		player1.setName("Ұԭ��֮��");
		System.out.println(player1.getName() + "V.S."+player2.getName());
		
	}
	//�ж���Ӯ
	public int judge(int fist1, int fist2) {
		if(fist1 == fist2) return 0;
		if(fist1 == 1 && fist2 == 3 || fist1== 2 && fist2 ==1 || fist1==3 && fist2 == 2) {
			//player1 score +1 . player2 score -1
			player1.setScore(player1.getScore()+1);
			player2.setScore(player2.getScore()-1);
			return -1;
		}
		player1.setScore(player1.getScore()-1);
		player2.setScore(player2.getScore()+1);
		return 1;
	}
	//������Ϸ
	public void endGame() {
		System.out.println("��Ϸ����������һ�ְɣ�");
	}
	
	//��ò����ķ���
	public long getRoomID() {
		return roomID;
	}
	public void setRoomID(long roomID) {
		this.roomID = roomID;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomPass() {
		return roomPass;
	}
	public void setRoomPass(String roomPass) {
		this.roomPass = roomPass;
	}
	
	
	
	
	//��������ʼ��Ϸ����ʼ����Ϸ����ʾ�˵���ѡ������ж���Ӯ�����Զ����ڲ������У�
}
