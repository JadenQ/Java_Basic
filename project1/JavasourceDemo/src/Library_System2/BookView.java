package Library_System2;
import java.util.Scanner;
/**
 * ͼ��ϵͳ����ͼ
 * Ϊ��֮��Խ���������������Խ����bookview�ļ��ֽ�ɳ�����abstractBookView��BookViewConsoleImpl
 * @todo TODO
 * @author Jaden
 * @date 2020��2��24��,����1:14:06
 * @copyright Jaden
 */
public class BookView {
	private Scanner input = null;
	private BookBiz bookbiz = null;
	
	public BookView() {
		input = new Scanner(System.in);
		bookbiz = new BookBiz();
		
		 System.out.println("********************"); ////
		 System.out.println("\t��ӭʹ��Jadenͼ�����ϵͳ"); ////
		 System.out.println("\t1.��¼\t2.�˳�ϵͳ"); ////
		 System.out.println("********************"); 
		 System.out.println("��ѡ��");
		 //ʵ�������ṩѡ������ 
		 String choice = input.next(); 
		 if("1".equals(choice)) {
			 //ִ�е�½���� 
			 System.out.println("��½�ɹ���(δʵ�ֵ�¼����)"); 
			 //��֤�ɹ���ʾ���˵�
			 showMainView();
		 } 
		 System.out.println("Jadenͼ�����ϵͳ�ɹ��˳�����л����ʹ�ã�"); //
		}
	/**
	 * ��ʾ���˵�
	 * @return ����true������ִ�����˵���false������һ���˵�
	 */
	public void showMainView() {
		System.out.println("\nJadenͼ�����ϵͳ>>���˵�");
		System.out.println("1.����ͼ��\t2.ɾ��ͼ��\t3.�鿴����ͼ��\t4.���ձ�Ų�ѯ\t5.���\t6.����\t7.�˳�ϵͳ");
		System.out.println("����ѡ��");
		String choice = input.next();
		switch(choice) {
		//��ʾ������
		case"1":
			showAddNewView();
			showBooks(Datas.bookStore);
			break;
		case"2":
			showDelBookView();
			break;
		case"3":
			showBooks(null);
			break;
		case"4": //����Ų�ѯ
			showFindByID();
			break;
		case"5": //���
			showInStore();
			break;
		case"6":
			showOutStore();
			break;
		case"7":
			return;
		default:
			break;
		}
		showMainView();
	}
	//��ʾ��
	public Book showAddNewView() {
		System.out.println("Jaden����ϵͳ>>����ͼ��");
		System.out.println("�鼮��ţ�");
		String bookID = input.next();//
		//������Ҫ��֤�û�����ı���Ƿ����
		Book newBook = bookbiz.findByID(bookID);
		if(newBook == null) {
			//�����������鼮����
			newBook = new Book();
			newBook.setBookID(bookID); //ǰ�������ˣ���Ҫ����һ��
			System.out.println("��������¼�鼮��Ϣ�����ƣ�");
			newBook.setBookName(input.next());
			System.out.println("���������");
			newBook.setCount(input.nextInt());
			//....�����鼮��Ϣ
			//ҵ���ʵ��
			bookbiz.addBook(newBook); //��ӵ�ͼ��ֿ�
			
		} //ͼ�鲻����
		else {//ͼ���Ѿ�����
			System.out.println("ϵͳ�Ѵ�¼���鼮��Ϣ��������¼�룡");
			newBook = showAddNewView(); //���µ��ø÷���
		}
		return newBook;
	}
	/**
	 * ��������һ���飬����ͼ����������
	 * ��ʾ���е�ͼ����Ϣ
	 * �������null����Ĭ����ʾͼ��ֿ��е����飺datas.BookStore
	 * @param BookArray
	 */
	public void showBooks(Book ... BookArray) {
		System.out.println("�ڲ����\t\t����\t���");
		if(BookArray == null) {  //����nullʱ����ʾ���е�ͼ������
			BookArray = Datas.bookStore;
		}
		int bookCount = bookbiz.getBookCount(BookArray);
		for(int i = 0; i<bookCount; i++) {
//			System.out.println(getType(BookArray[i].getCount()));

			System.out.printf("%s\t\t %s\t\t %d\n",BookArray[i].getBookID(),BookArray[i].getBookName(),BookArray[i].getCount());
		}
	}
	/**
	 * ɾ��ͼ�����
	 */
	public void showDelBookView() {
		System.out.println("\nJadenͼ�����ϵͳ>>ɾ��ͼ��");
		System.out.println("����Ҫɾ����ͼ����");
		String delID = input.next();
		Book delBook = new Book(); 
		delBook.setBookID(delID); 
		if(bookbiz.delBook(delBook)) {   //delBook���������Ƿ�ɾ���ɹ�
			System.out.println("ɾ���ɹ���");
			showBooks(null); //�൱��ˢ�µ�ǰͼ��
		}
		else {
			System.out.println("ɾ��ʧ�ܣ�");
		}
	}
	
	/**
	 * ���ݱ�Ų�ѯ
	 */
	public void showFindByID() {
		System.out.println("Jadenͼ�����ϵͳ>>����Ų�ѯ");
		System.out.println("����Ҫ��ѯ�ı�ţ�");
		String bookID = input.next();
		Book book = bookbiz.findByID(bookID);
		if(book == null) {
			System.out.println("δ�ҵ�ͼ����Ϣ");
			return;
		}
		else showBooks(book);
	}
	/**
	 * ������ʾ
	 */
	public void showInStore() {
		//ͼ��ID������
		System.out.println("\nJadenͼ�����ϵͳ>>ͼ�����");
		System.out.println("����ͼ���ţ�");
		String bookID = input.next();
		System.out.println("����������");
		int bookCount = input.nextInt();
		if(bookbiz.inStore(bookID, bookCount)) {
			System.out.println("���ɹ���");
			showBooks(null);
		}
		else System.out.println("���ʧ�ܣ�������");
	}
	/**
	 * �������ʾ
	 */
	public void showOutStore() {
		System.out.println("\nJadenͼ�����ϵͳ>>ͼ�����");
		System.out.println("�����ͼ���ţ�");
		String bookID = input.next();
		System.out.println("�����������");
		int bookCount = input.nextInt();
		if(bookbiz.inStore(bookID, bookCount)) {
			System.out.println("����ɹ���");
			showBooks(null);
		}
		else System.out.println("����ʧ�ܣ��������Ƿ���󣬻���������Ƿ���");
	}
	
//	private static String getType(Object a) {
//		return a.getClass().toString();
// 
//	}

	
}
