package interface_pkGame;

/**
 * 可攻击接口：只要实现了本接口，就具备了可实施攻击对象的基本特征
 * @todo 写出所有方法
 * @author Jaden
 * @date 2020年1月6日,上午10:31:09
 * @copyright Jaden
 */
public interface Assailable {
	String getName();
	int getX();
	int getY();
	void setX(int x);
	void setY(int y);
	int getHp();
	void setHp(int hp);
	/**
	 * 根据距离判断，能否成功攻击另一个具备攻击能力的对象（军事单位）
	 * @param assa
	 * @return
	 */
	boolean closeEnough(Assailable assa);
	
	/**
	 * 攻击另外一个军事单位
	 * @param assa
	 */
	void fight(Assailable assa);
	
	
}
