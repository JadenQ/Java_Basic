
public class Class4_Hero {

	private long id;
	private String nickName;
	private int level;
	private long CurExp;
	private long exp; //��ǰ������������Ҫ���飬����Ҫset���̶���ʽ������Ҫ�ֶ�����set

	//����������
	public Class4_Hero(long id, String nickName, int level, long exp) {
		this.id = id;
		this.setNickName(nickName);
		this.level = level;
		this.exp = exp;
	}
	
	//Ĭ��
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
	
	//�޸��˷���Ȩ��;��������ɾ��֮�󣬹ر��޸ĵĽӿڣ�ֱ�Ӵ��ͽ������
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
