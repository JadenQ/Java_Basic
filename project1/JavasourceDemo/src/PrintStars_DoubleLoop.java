/**
 * 
 * @todo ѭ����ӡ�Ǻţ�����ͼ��
 * @author Jaden
 * @date 2019��11��26��,����10:02:52
 * @copyright Jaden
 */
public class PrintStars_DoubleLoop {

	public static void main(String[] args) {
		 //�С���˫ѭ��
		 	char ch = 'A';
		 	//��ӡ�Ǻ�
//		for(int i = 0; i < 4; i++) {
//			for(int j = 0; j<=(2-i) ; j++) {
//				System.out.print(" "); }
//			for(int j =0; j<=(2*i); j++) {
//				System.out.print("*");
//			}
//			System.out.println(); //����ѭ������س�
//			
//		}
//		for(int i = 3; i > 0; i--) {
//			for(int j = 0; j<=(3-i) ; j++) {
//				System.out.print(" "); }
//			for(int j =0; j<=(2*i-2); j++) {
//				System.out.print("*");
//			}
//			System.out.println(); //����ѭ������س�
//			
			
		//��ӡ��ĸ
//			for(int i = 0; i < 4; i++) {
//				for(int j = 0; j<=(2-i) ; j++) {
//					System.out.print(" "); }
//				for(int j =0; j<=(2*i); j++) {
//					System.out.print((char)(ch+i));
//				}
//				System.out.println(); //����ѭ������س�
//				
//			}
//			for(int i = 3; i > 0; i--) {
//				for(int j = 0; j<=(3-i) ; j++) {
//					System.out.print(" "); }
//				for(int j =0; j<=(2*i-2); j++) {
//					System.out.print((char)(ch+(7-i)));
//				}
//				System.out.println(); //����ѭ������س�	
//			}
			
		//��ӡ��������
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j<=(2-i) ; j++) {
				System.out.print(" "); }
			for(int j =0; j<=(2*i); j++) {
				if(j == 0 || j == (2*i)) {System.out.print("*");}
				else {System.out.print(" ");}
			}
				System.out.println(); //����ѭ������س�
			}
			
			
		for(int i = 3; i > 0; i--) {
			for(int j = 0; j<=(3-i) ; j++) {
				System.out.print(" "); }
			for(int j =0; j<=(2*i-2); j++) {
				if(j == 0 || j == (2*i-2)) {System.out.print("*");} //ֻ����β�����ǺŴ�ӡ����
				else {System.out.print(" ");}
			}
			System.out.println(); //����ѭ������س�
			}
	}
}
