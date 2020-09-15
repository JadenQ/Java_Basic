
/**
 * 单例模式
 * @todo TODO
 * @author Jaden
 * @date 2020年1月4日,上午11:31:26
 * @copyright Jaden
 */
public class SingleModel {
	
	//1.将私有地实例
	private static SingleModel me = null;
	
	 
	public int count = 0;
	//2.构造方法为私有
	private SingleModel() {
		count++;
	}
	//至此，不可以在任何其他地方实例singlemodel
	
	/**
	 * 可以利用这一方法返回一个实例化，之后调用getInstance方法
	 * 3.令实例个数只有一个
	 * @return
	 */
	public static SingleModel getInstance() {
		if(null == me) me = new SingleModel();
		return me;
	}
	
}
