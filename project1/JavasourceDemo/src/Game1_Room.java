import java.util.Scanner;
/**
 * 游戏房间：记分牌+道具+参与游戏的玩家
 * @todo TODO
 * @author Jaden
 * @date 2019年12月13日,上午10:47:13
 * @copyright Jaden
 */
public class Game1_Room {
	//属性：（记分牌）、(道具)、参与游戏的玩家、房间号
	private Game1_HumanPlayer player1 = null;
	private Game1_DigitPlayer player2 = null;
	
	/**房间id*/
	private long roomID;
	/**房间名称*/
	private String roomName;
	/**房间密码*/
	private String roomPass;
	
	/**
	 构造方法*/
		
	public Game1_Room() {
		initGame();
		startGame();
		endGame(); 
	}
	
	//初始化游戏
	public void initGame() {
		//1.实例化人物对象
		player1 = new Game1_HumanPlayer();
		player2 = new Game1_DigitPlayer();
		//2.初始化游戏的其他属性
		System.out.println("加载中......");
		for(int i = 0; i < 40; i++) {
			System.out.print("+");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.print("\n加载成功！");
	}
	//开始游戏
	public void startGame() {
		showMenu();
		chooseRole();
		game1_Cycle();
		//打印结果 
	}
	//游戏的循环：
	private void game1_Cycle() {
		while(true) {
			//双方出拳
			System.out.println(player1.getName()+"，请出拳：");
			Scanner input = new Scanner(System.in);
			player1.setFist(input.nextInt());
			int fist1 = player1.getFist();
			//不close,防止后面再次调用出现问题input.close();
			//玩家2 
			int fist2 = player2.getFist(); //已经写好随机数出拳
			//判断输赢
			int result = judge(fist1,fist2);
			//"-1"-玩家1 win "0"-打平  "1"-玩家2 win
			if(result == -1) {
				player1.sendMessage(Game1_HumanPlayer.MessageTypeWin);
				player2.sendMessage(Game1_DigitPlayer.MessageTypeLose);
				System.out.println("Player1赢一把！");
			}
			else if(result == 0) {
				System.out.println("平局惹！");	
			}
			else if(result == 1) {
				player1.sendMessage(Game1_HumanPlayer.MessageTypeLose);
				player2.sendMessage(Game1_DigitPlayer.MessageTypeWin);
				System.out.println("Player2赢一把！");
			}
			System.out.println("是否再来一局？[y/n]");
			String answer = new Scanner(System.in).next();
			if(!"y".equalsIgnoreCase(answer)) {
				break;
			}
		}
	}
	//显示菜单
	public void showMenu() {
		System.out.println("\n--欢迎进入《"+roomName+"》游戏房间--");
		System.out.println("出拳规则： 1-剪刀 2-石头 3-布");
	}
	//选择角色
	public void chooseRole() {
		System.out.println("对方角色：1.风间 2.阿呆 3.妮妮 4.正男");
		System.out.println("请选择：");
		//省略对输入合法性的验证
		int choice = new Scanner(System.in).nextInt();
		String[] nameArray = {"风间","阿呆","妮妮","正男"};
		player2.setName(nameArray[choice - 1]);
		player1.setName("野原新之助");
		System.out.println(player1.getName() + "V.S."+player2.getName());
		
	}
	//判断输赢
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
	//结束游戏
	public void endGame() {
		System.out.println("游戏结束，再来一局吧！");
	}
	
	//获得参数的方法
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
	
	
	
	
	//方法：开始游戏、初始化游戏、显示菜单、选择人物、判断输赢（可以定义在裁判类中）
}
