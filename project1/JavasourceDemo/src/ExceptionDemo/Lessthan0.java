package ExceptionDemo;
/**
 * 自定义一个异常，小于零时触发
 * @todo TODO
 * @author Jaden
 * @date 2020年1月13日,上午10:19:05
 * @copyright Jaden
 */
public class Lessthan0 extends Exception{
	//重写两个构造方法就可以了
	private int value;
	
	
	public Lessthan0() {
		super("数字不能小于限制");
	}
	
	public Lessthan0(int value) {
		super("输入的数字为：" + value +"，低于限制");
	}
}
