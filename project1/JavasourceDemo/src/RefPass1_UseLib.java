/**
 * 
 * @todo TODO���÷�����
 * @author Jaden
 * @date 2019��12��17��,����10:44:43
 * @copyright Jaden
 */
public class RefPass1_UseLib {
	public static void main(String[] args) {
		//ʵ����һ��ͼ��
		//new:���ڴ棬��main������ջ��֮��
		RefPass1_Book book = new RefPass1_Book("����","12-32-i54",98.8,5);
		//book���ڵ�λ�ã�
		System.out.println(book);
		//book��hash�ڴ��ַ���͸���ջ��
		//ʵ����һ��ͼ�����Ա���ڶ��ڴ棩
		RefPass1_Lib Lib = new RefPass1_Lib();
		//ͼ�����Ա�����������
		//book�����ڴ��еĵ�ַ����sellbook��sellbook���е����ҵ����ڴ棬�����޸�
		Lib.sellBook(book);
		System.out.println(book.getCount());
	}
	
}
