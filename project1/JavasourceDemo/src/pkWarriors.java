
public class pkWarriors extends pkHero{

	
	//���췽��
	public pkWarriors() {
		super();
		setName("defaultName");
	}
	
	public pkWarriors(long id, String name, int x, int y) {
		super(id,name);
		setX(x);
		setY(y);
	}
	
	
	
	@Override 
	public boolean closeEnough(pkHero hero) {
		double distance = getDis(getX(),getY(),hero.getX(),hero.getY());
		//սʿ��������Ϊ100�̶�
		return distance <= 100;
	}
	
	@Override 
	public void fight(pkHero hero) {
		//1.��������Ĺ�����
		int attack = ((int)(Math.random() * 1000)) % 51 + 20; //20-70
		setAttack(attack);
		//2.������Ӣ�۵�hp��ȥ
		hero.setHp(hero.getHp()-attack);
	} 
	
	

	

	
}
