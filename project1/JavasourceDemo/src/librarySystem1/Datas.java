package librarySystem1;
/**
 * ģ������ݲֿ�
 * @todo TODO
 * @author Jaden
 * @date 2020��2��24��,����10:54:29
 * @copyright Jaden
 */
public class Datas {
	/**������������ͼ����Ϣ���ݣ�ͼ��Ĳֿ�*/
	public static Book[] bookStore = new Book[999];
	//�þ�̬���ͼ��ֿ�����������鼮��Ϣ�Ա��ڲ���
	//����ʱ��:����ʵ����
	static {
		Book book1 = new Book();
		book1.setBookID("1000");
		book1.setBookName("�Ͼ��⴫");
		book1.setIsbn("101-102");
		book1.setCount(12);
		book1.setPrice(29.9);
		bookStore[0] = book1;
		
		Book book2 = new Book();
		book2.setBookID("1001");
		book2.setBookName("��¥��");
		book2.setIsbn("102-103");
		book2.setCount(14);
		book2.setPrice(80);
		bookStore[1] = book2;
		
		Book book3 = new Book();
		book3.setBookID("1002");
		book3.setBookName("¹����");
		book3.setIsbn("104-105");
		book3.setCount(1);
		book3.setPrice(19.9);
		bookStore[2] = book3;
		
		Book book4 = new Book();
		book4.setBookID("1003");
		book4.setBookName("����������");
		book4.setIsbn("106-107");
		book4.setCount(8);
		book4.setPrice(39.9);
		bookStore[3] = book4;
		
		Book book5 = new Book();
		book5.setBookID("1004");
		book5.setBookName("���Ӣ�۴�");
		book5.setIsbn("107-108");
		book5.setCount(11);
		book5.setPrice(39.9);
		bookStore[4] = book5;
		
		
	}
}
