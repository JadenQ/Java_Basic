/**
 * 
 * @todo TODO调用方法等
 * @author Jaden
 * @date 2019年12月17日,上午10:44:43
 * @copyright Jaden
 */
public class RefPass1_UseLib {
	public static void main(String[] args) {
		//实例化一个图书
		//new:堆内存，在main方法的栈区之外
		RefPass1_Book book = new RefPass1_Book("情人","12-32-i54",98.8,5);
		//book所在的位置：
		System.out.println(book);
		//book的hash内存地址传送给了栈区
		//实例化一个图书管理员（在堆内存）
		RefPass1_Lib Lib = new RefPass1_Lib();
		//图书管理员进行卖书操作
		//book将堆内存中的地址传给sellbook，sellbook进行调用找到堆内存，进行修改
		Lib.sellBook(book);
		System.out.println(book.getCount());
	}
	
}
