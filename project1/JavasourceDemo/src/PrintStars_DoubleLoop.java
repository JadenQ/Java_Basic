/**
 * 
 * @todo 循环打印星号，构成图形
 * @author Jaden
 * @date 2019年11月26日,上午10:02:52
 * @copyright Jaden
 */
public class PrintStars_DoubleLoop {

	public static void main(String[] args) {
		 //行、列双循环
		 	char ch = 'A';
		 	//打印星号
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j<=(2-i) ; j++) {
//				System.out.print(" "); }
//			for(int j =0; j<=(2*i); j++) {
//				System.out.print("*");
//			}
//			System.out.println(); //在外循环里面回车
//			
//		}
//		for(int i = 3; i > 0; i--) {
//			for(int j = 0; j<=(3-i) ; j++) {
//				System.out.print(" "); }
//			for(int j =0; j<=(2*i-2); j++) {
//				System.out.print("*");
//			}
//			System.out.println(); //在外循环里面回车
//			
			
		//打印字母
//			for(int i = 0; i < 4; i++) {
//				for(int j = 0; j<=(2-i) ; j++) {
//					System.out.print(" "); }
//				for(int j =0; j<=(2*i); j++) {
//					System.out.print((char)(ch+i));
//				}
//				System.out.println(); //在外循环里面回车
//				
//			}
//			for(int i = 3; i > 0; i--) {
//				for(int j = 0; j<=(3-i) ; j++) {
//					System.out.print(" "); }
//				for(int j =0; j<=(2*i-2); j++) {
//					System.out.print((char)(ch+(7-i)));
//				}
//				System.out.println(); //在外循环里面回车	
//			}
			
		//打印空心菱形
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j<=(2-i) ; j++) {
				System.out.print(" "); }
			for(int j =0; j<=(2*i); j++) {
				if(j == 0 || j == (2*i)) {System.out.print("*");}
				else {System.out.print(" ");}
			}
				System.out.println(); //在外循环里面回车
			}
			
			
		for(int i = 3; i > 0; i--) {
			for(int j = 0; j<=(3-i) ; j++) {
				System.out.print(" "); }
			for(int j =0; j<=(2*i-2); j++) {
				if(j == 0 || j == (2*i-2)) {System.out.print("*");} //只有首尾两个星号打印出来
				else {System.out.print(" ");}
			}
			System.out.println(); //在外循环里面回车
			}
	}
}
