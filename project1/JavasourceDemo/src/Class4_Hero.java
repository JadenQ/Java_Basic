
public class Class4_Hero {

	private long id;
	private String nickName;
	private int level;
	private long CurExp;
	private long exp; //当前级别升级所需要经验，不需要set，固定公式，不需要手动输入set

	//带参数重载
	public Class4_Hero(long id, String nickName, int level, long exp) {
		this.id = id;
		this.setNickName(nickName);
		this.level = level;
		this.exp = exp;
	}
	
	//默认
	public Class4_Hero() {}

	// shift+ctrl+f
	public long getId() {
		return id;
	}
	

	public long getCurExp() {
		return CurExp;
	}

	public void setCurExp(long curExp) {
		CurExp = curExp;
	}

	public void setId(long id) {
		if(id <= 0) id = 1;
		else {
			this.id = id;
		}
	}

	public String getNickName() {
		return nickName;
	}
	
	//修改了访问权限;或者这里删掉之后，关闭修改的接口，直接传送进入参数
	private void setNickName(String nickName) {
		if(null == nickName) {
			nickName = "Unknow_Hero";
		}
		else {
			this.nickName = nickName;
		}
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		if(level<1 || level > 999) {
			this.level = 1;
		}
		else {
		this.level = level;
		}
	}

	public long getExp() {
		exp = ((long)Math.pow((level-1),3) + 60 / 5*((level-1) *2 +60));
		return exp;
	}

}
