/**
 * 繁窃螺社窃
 * @todo 葎繁窃螺社更秀匯倖窃
 * @author Jaden
 * @date 2019定12埖13晩,貧怜10:00:22
 * @copyright Jaden
 */
public class Game1_HumanPlayer {
	//床蓑械楚�些�鉢窃侏議佚連,聞喘static final��
	public static final int MessageTypeFist = 1;
	//哺誼曳琵扮昨議佚連
	public static final int MessageTypeWin = 2;
	//払移曳琵扮昨議佚連
	public static final int MessageTypeLose = 3;
	//奉來�挫�各、蛍方、竃鉢彜蓑、��咄丼��、岬簡
	private String name;
	private int score;
	private int fist;
	//....
	//叔弼竃鉢議扮昨傍誼岬簡
	private String[] fistWords = {
			"BiuBiu~",
			"鞭棒杏��",
			"おはようございます��",
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
			"You win, I lose!!蛍かりました�。。。｜���している�。�"
	};
	
	//勧秘議佚連窃侏��昧字嬉咫斤哘議窃侏佚連
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
	
	//圭隈�叉探獣�各、蛍方、竃鉢、�┣シ賭�丼��、傍岬簡
	
}
