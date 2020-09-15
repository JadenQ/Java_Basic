package ExceptionDemo;
/**
 * 手动抛出异常
 * @todo TODO
 * @author Jaden
 * @date 2020年1月13日,上午10:00:24
 * @copyright Jaden
 */
public class throwDemo {
	public static void main(String[] args) {
		Hero hero = new Hero("貂蝉");
		try {
			hero.setExp(-9000);
			hero.setHealth(60);
			hero.ride();
			
		} catch (Exception e) {
			// TODO 可以用stackTracE或者调用自己写的message
			System.err.println("经验值出现异常：");
			e.printStackTrace();
			//System.err.println("经验值出现异常："+e.getMessage());
		}
		System.out.println("当前英雄经验值："+hero.getExp());
	}
}

class Hero{
	private String name;
	private long exp;
	private int health;
	
	
	//construct
	public Hero(String name) {
		setName(name);
	}
	
	/**
	 * 英雄骑马方法，健康值低于50时，不能骑马，否则返回异常
	 * 自定义一个异常 : Lessthan0
	 * @throws Lessthan0 
	 */
	public void ride() throws Lessthan0 {
		if(health >= 50) {
			System.out.println(name+"正在骑马前进。");
		}
		else throw new Lessthan0(health);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getExp() {
		return exp;
	}
	//可以使用exception
//	public void setExp(long exp) throws Exception{
//		if(exp >= 0) {
//			this.exp = exp;
//		}
//		else{
//			throw new Exception("经验值不能为负数！");
//		}
//	}
	//可以使用自己写的异常
	public void setExp(long exp) throws Lessthan0{
		if(exp >= 0) {
			this.exp = exp;
		}
		else{
			throw new Lessthan0((int)exp);
		}
	}
	
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	

	
	
}