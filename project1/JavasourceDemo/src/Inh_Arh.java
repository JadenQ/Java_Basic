
public class Inh_Arh extends Inh_Hero{
	private int magicAttack;
	/**
	 * 战士的静态属性，每实例化一个新的战士对象，ID++
	 */
	public static int ID = 0;
	
	//默认一个角色构造
	public Inh_Arh() {
		setNickName("default firer"+ID);
		setLevel(1);
		setMaxLife(100);
		setCurLife(100);
		setMagicAttack(8);
		ID++;
	}
	
	//带参数构造
	public Inh_Arh(String nickName) {
		this(); //调用该类自己的默认构造
		setNickName(nickName);
	}
	
	public void fire() {
		System.out.println("法师"+getNickName()+" burning thee!");
	}

	//重写一个toString去打印角色信息 alt+/,可以不用写.toString，直接调用
	@Override

	public String toString() {
		
		StringBuffer str = new StringBuffer();
		str.append(getLevel());
		str.append("\t");
		str.append(getNickName());
		str.append("\t\t");
		str.append(getCurLife());
		str.append("\t");
		str.append(getMaxLife());
		str.append("\t");
		str.append(getMagicAttack());
		
		return str.toString();
	}

	
	public int getMagicAttack() {
		return magicAttack;
	}

	public void setMagicAttack(int magicAttack) {
		this.magicAttack = magicAttack;
	}
	
	
}
