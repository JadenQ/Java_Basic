
/**
 * 英雄类-父类-抽象
 * @todo TODO
 * @author Jaden
 * @date 2020年1月5日,上午11:27:05
 * @copyright Jaden
 */
public abstract class pkHero {
	private long id;
	private String name;
	private int level;
	private int maxHP;
	private int hp;
	private int attack;
	private int x;
	private int y;
	
	public pkHero() {
		setMaxHP(100);
		setHp(100);
	}
	
	public pkHero(long id, String name) {
		this();
		setId(id);
		setName(name);
	}
	
	//先定义方法
	/**
	 * 当前的英雄能不能打到传入的英雄对象
	 * @param hero
	 * @return
	 */
	public abstract boolean closeEnough(pkHero hero);
	/**
	 * 根据传入的英雄对象，默认根据随机生成的攻击力减去Hp
	 * @param hero
	 */
	public abstract void fight(pkHero hero);
	
	/**
	 * 实际上对战的过程，规定了默认的对战流程
	 * @param hero
	 */
	public void PK(pkHero hero) {
		//1.计算距离判断是否能够攻击到
		if(closeEnough(hero) && hp>0 && hero.getHp() > 0) {
			
		//2.如果可以攻击，调用攻击方法
			fight(hero);
		}
		else {
			System.out.println("太远了或者怎样，打不到！");
		}
		//3.控制台打印对战结果
		System.out.println("两个英雄状态");
		System.out.println("nickname\tHp\tx_aris\ty_aris");
		System.out.println(name+"\t"+hp+"\t"+x+"\t"+y);
		//对手位置
		System.out.printf("%s\t%d\t%d\t%d",hero.getName(),hero.getHp(),hero.getX(),hero.getY());
	}
	
	//get/set
	
	protected double getDis(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		if(level > 100) {
			this.level = 100;
		}
		else if(level < 0) {
			this.level = 0;
		}
		else {this.level = level;}
	}
	public int getMaxHP() {
		return maxHP;
	}
	public void setMaxHP(int maxHP) {
		this.maxHP = maxHP;
	}
	public int getHp() {
		return hp;
	}
	//血量与级别有关
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttack() {
		return attack;
	}
	public void setAttack(int attack) {
		this.attack = attack;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	

	
	
}
