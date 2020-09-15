/**
 * 
 * @todo while demo
 * @author Jaden
 * @date 2019年11月22日,上午9:58:33
 * @copyright Jaden
 */
public class whileDemo {
	public static void main(String[] args) {
		int i = 0;
		while(i < 10) {
			System.out.println("this is"+i);
			i++;           //防止死循环，循环更新
		}
	}
}
