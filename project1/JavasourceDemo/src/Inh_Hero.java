/**
 * 英雄类的父类
 * @todo TODO
 * @author Jaden
 * @date 2019年12月26日,下午10:17:20
 * @copyright Jaden
 */
public class Inh_Hero {
	private String nickName;
	private int level;
	private int maxLife;
	private int curLife;
	
	//构造方法
	public Inh_Hero() {
		//System.out.println("父类默认构造！");
	}
	
	public Inh_Hero(String nickName, int level, int maxLife, int curLife) {
		this.nickName = nickName;
		this.level = level;
		this.maxLife = maxLife;
		this.curLife = curLife;
	}
	
	//比较两个英雄级别大小 compareTo
	/**
	 * 根据名字排序，1大于，0等于 -1小于
	 * @return
	 */
	public int compareByName(Inh_Hero hero) {
		return getNickName().compareTo(hero.getNickName());
				
	}
	/**
	 * 比较两个英雄对象的大小（级别）
	 * @param hero
	 * @return
	 */
	public int compareTo(Inh_Hero hero) {
		if(this.level > hero.getLevel())
			return 1;
		else if(this.level == hero.getLevel())
			return 0;
		else return -1; //小于
		
	}
	
	//move 方法
	public void move() {
		System.out.println("这是一个move方法");
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
