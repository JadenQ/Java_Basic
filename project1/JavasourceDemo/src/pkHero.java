
/**
 * Ӣ����-����-����
 * @todo TODO
 * @author Jaden
 * @date 2020��1��5��,����11:27:05
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
	
	//�ȶ��巽��
	/**
	 * ��ǰ��Ӣ���ܲ��ܴ򵽴����Ӣ�۶���
	 * @param hero
	 * @return
	 */
	public abstract boolean closeEnough(pkHero hero);
	/**
	 * ���ݴ����Ӣ�۶���Ĭ�ϸ���������ɵĹ�������ȥHp
	 * @param hero
	 */
	public abstract void fight(pkHero hero);
	
	/**
	 * ʵ���϶�ս�Ĺ��̣��涨��Ĭ�ϵĶ�ս����
	 * @param hero
	 */
	public void PK(pkHero hero) {
		//1.��������ж��Ƿ��ܹ�������
		if(closeEnough(hero) && hp>0 && hero.getHp() > 0) {
			
		//2.������Թ��������ù�������
			fight(hero);
		}
		else {
			System.out.println("̫Զ�˻����������򲻵���");
		}
		//3.����̨��ӡ��ս���
		System.out.println("����Ӣ��״̬");
		System.out.println("nickname\tHp\tx_aris\ty_aris");
		System.out.println(name+"\t"+hp+"\t"+x+"\t"+y);
		//����λ��
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
	//Ѫ���뼶���й�
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
