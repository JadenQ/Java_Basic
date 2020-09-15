package interface_pkGame;

public class Castle implements Assailable{

	private String name;
	private int x;
	private int y;
	private int maxHp;
	private int hp;
	private int attackR;
	
	//构造方法
	public Castle(String name, int x, int y, int attackR) {
		setName(name);
		setX(x);
		setY(y);
		setAttackR(attackR);
		setMaxHp(100);
		setHp(100);
	}
	
	
	@Override 
	public boolean closeEnough(Assailable assa) {
		double distance = getDis(getX(),getY(),assa.getX(),assa.getY());
		//战士攻击距离为100固定
		return distance <= 100;
	}
	
	
	
	@Override
	public void fight(Assailable assa) {
		int attack = 15;
		assa.setHp(assa.getHp()-attack);
	}
	
	protected double getDis(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public int getMaxHp() {
		return maxHp;
	}
	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getAttackR() {
		return attackR;
	}
	public void setAttackR(int attackR) {
		this.attackR = attackR;
	}
	
	
}
