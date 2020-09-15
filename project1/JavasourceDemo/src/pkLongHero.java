
public abstract class pkLongHero extends pkHero {
	private int attackR;
	
	public pkLongHero() {
		super();
	}
	
	public pkLongHero(long id, String name,int attackR, int x, int y) {
		super(id, name);
		setX(x);
		setY(y);
		setAttackR(attackR);
		
	}

	public int getAttackR() {
		return attackR;
	}

	public void setAttackR(int attackR) {
		this.attackR = attackR;
	}
	
	
}
