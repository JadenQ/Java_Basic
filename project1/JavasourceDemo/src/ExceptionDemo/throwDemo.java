package ExceptionDemo;
/**
 * �ֶ��׳��쳣
 * @todo TODO
 * @author Jaden
 * @date 2020��1��13��,����10:00:24
 * @copyright Jaden
 */
public class throwDemo {
	public static void main(String[] args) {
		Hero hero = new Hero("����");
		try {
			hero.setExp(-9000);
			hero.setHealth(60);
			hero.ride();
			
		} catch (Exception e) {
			// TODO ������stackTracE���ߵ����Լ�д��message
			System.err.println("����ֵ�����쳣��");
			e.printStackTrace();
			//System.err.println("����ֵ�����쳣��"+e.getMessage());
		}
		System.out.println("��ǰӢ�۾���ֵ��"+hero.getExp());
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
	 * Ӣ��������������ֵ����50ʱ�������������򷵻��쳣
	 * �Զ���һ���쳣 : Lessthan0
	 * @throws Lessthan0 
	 */
	public void ride() throws Lessthan0 {
		if(health >= 50) {
			System.out.println(name+"��������ǰ����");
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
	//����ʹ��exception
//	public void setExp(long exp) throws Exception{
//		if(exp >= 0) {
//			this.exp = exp;
//		}
//		else{
//			throw new Exception("����ֵ����Ϊ������");
//		}
//	}
	//����ʹ���Լ�д���쳣
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