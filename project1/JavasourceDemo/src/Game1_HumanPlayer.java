/**
 * 人类玩家类
 * @todo 为人类玩家构建一个类
 * @author Jaden
 * @date 2019年12月13日,上午10:00:22
 * @copyright Jaden
 */
public class Game1_HumanPlayer {
	//静态常量：出拳类型的信息,使用static final，
	public static final int MessageTypeFist = 1;
	//赢得比赛时候的信息
	public static final int MessageTypeWin = 2;
	//失败比赛时候的信息
	public static final int MessageTypeLose = 3;
	//属性：名称、分数、出拳状态、（音效）、台词
	private String name;
	private int score;
	private int fist;
	//....
	//角色出拳的时候说得台词
	private String[] fistWords = {
			"BiuBiu~",
			"受死吧！",
			"おはようございます！",
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
			"You win, I lose!!分かりました！！！！勉強している！！"
	};
	
	//传入的信息类型，随机打印对应的类型信息
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
	
	//方法：得到名称、分数、出拳、（播放音效）、说台词
	
}
