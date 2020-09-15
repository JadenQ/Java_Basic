/**
 * 战士类，继承了hero类
 * @todo TODO
 * @author Jaden
 * @date 2019年12月26日,下午10:22:50
 * @copyright Jaden
 */

//1.父类的构造 2.父类的private方法。 以上两个不可以被继承。
//利用super可以使用父类构造，先默认使用父类构造，再使用子类构造
//java只支持继承一个父类：利用接口可以实现多个父类的要求
//继承必须保证在逻辑上存在包含关系
//ex:
//Hero 小巧 = new Archman();    合法，  含义为：法师 is a 英雄（👈）
public class Inh_Warrior extends Inh_Hero{
	/**
	 * 战士的静态属性，每实例化一个新的战士对象，ID++
	 * 每次实例化一个对象，static都只对应这用一个变量，而不是每次实例化产生新的变量
	 */
	public static int ID = 0;
	
	//物理攻击数
	private int pysAttack;
	
	//construct 
	public Inh_Warrior() {
		//子类构造中，此处有一个默认的super()，即先默认一个父类默认构造
		//先实例化父类对象，再实例化子类对象
		System.out.println("这是一个子类构造！");
		setNickName("default fighter"+ID);
		setLevel(1);
		setMaxLife(100);
		setCurLife(100);
		setPysAttack(7);
		ID++;
	}
	
	public Inh_Warrior(String nickName, int pysAttack) {
		this();
		setNickName(nickName);
		setPysAttack(pysAttack);
		
	}
	
	
	//方法
	/**
	 * 重写：所有都与父类相同，只能子类重写父类
	 * 为了避免出错，用override标注
	 */
	@Override
	public void move() {
		System.out.println(getNickName()+"我正在move");
	}
	//重写equals，解决equals 是hero的父类而无法比较相等的问题
	//重写自父类的父类——爷爷类
	@Override
	public boolean equals(Object obj) {
		//如果传入的obj是warrior类的实例
		if(!(obj instanceof Inh_Warrior)) {
			return false;
		}
		Inh_Warrior newInh_Warrior = (Inh_Warrior)obj;
		//比较两个属性
		if(getNickName().equals(newInh_Warrior.getNickName())&& getPysAttack() == newInh_Warrior.getPysAttack()) {
			return true;
		}
		return false;
	}
//	
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
		str.append(getPysAttack());
		
		return str.toString();
	}


	public int getPysAttack() {
		return pysAttack;
	}

	public void setPysAttack(int pysAttack) {
		this.pysAttack = pysAttack;
	}
	
	
	
}
