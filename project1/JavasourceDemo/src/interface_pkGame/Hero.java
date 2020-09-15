package interface_pkGame;

//ʵ���˿ɹ����ӿڵĳ�����
//дһ������interface�ĳ����ࣺ��:1.implements 2.д�������õ��ķ���
public abstract class Hero implements Assailable {

	private long id;
	private String name;
	private int level;
	private int maxHP;
	private int hp;
	private int attack;
	private int x;
	private int y;
	
	//���췽��
	public Hero() {
		setMaxHP(100);
		setHp(100);
	}
	
	public Hero(long id, String name) {
		this();
		setId(id);
		setName(name);
	}
	
	//Ӣ��֮��PK 1.�жϾ���2.����
	public void PK(Assailable assa) {
		if(closeEnough(assa) && hp > 0 && assa.getHp()>0) {
			fight(assa);
		}
		else {System.out.println("�ﲻ����������");}
		
		System.out.println("����Ӣ��״̬");
		System.out.println("nickname\tHp\tx_aris\ty_aris");
		System.out.println(name+"\t"+hp+"\t"+x+"\t"+y);
		//����λ��
		System.out.printf("%s\t%d\t%d\t%d",assa.getName(),assa.getHp(),assa.getX(),assa.getY());
	
	}
	
	
	//�����������µ�λ�ľ���
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
		this.level = level;
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
