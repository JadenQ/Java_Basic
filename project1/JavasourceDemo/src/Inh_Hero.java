/**
 * Ӣ����ĸ���
 * @todo TODO
 * @author Jaden
 * @date 2019��12��26��,����10:17:20
 * @copyright Jaden
 */
public class Inh_Hero {
	private String nickName;
	private int level;
	private int maxLife;
	private int curLife;
	
	//���췽��
	public Inh_Hero() {
		//System.out.println("����Ĭ�Ϲ��죡");
	}
	
	public Inh_Hero(String nickName, int level, int maxLife, int curLife) {
		this.nickName = nickName;
		this.level = level;
		this.maxLife = maxLife;
		this.curLife = curLife;
	}
	
	//�Ƚ�����Ӣ�ۼ����С compareTo
	/**
	 * ������������1���ڣ�0���� -1С��
	 * @return
	 */
	public int compareByName(Inh_Hero hero) {
		return getNickName().compareTo(hero.getNickName());
				
	}
	/**
	 * �Ƚ�����Ӣ�۶���Ĵ�С������
	 * @param hero
	 * @return
	 */
	public int compareTo(Inh_Hero hero) {
		if(this.level > hero.getLevel())
			return 1;
		else if(this.level == hero.getLevel())
			return 0;
		else return -1; //С��
		
	}
	
	//move ����
	public void move() {
		System.out.println("����һ��move����");
	}
	
	
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public int getMaxLife() {
		return maxLife;
	}
	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}
	public int getCurLife() {
		return curLife;
	}
	public void setCurLife(int curLife) {
		this.curLife = curLife;
	}
	
	
	

}
