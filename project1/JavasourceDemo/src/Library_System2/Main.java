package Library_System2;

public class Main {

	public static void main(String[] args) {
		
		//new BookView().showBooks(Datas.bookStore);
		
		//��ʹ�ó����ࣺ
//		new BookView();
		
		
		//ʹ�ó����ࣺIDLE����̨ʵ��
		AbstractBookView bookView = new BookViewConsoleImpl();
		bookView.start();
		
		//ʹ�ó����ࣺ�Ի���ʵ��
//		AbstractBookView bookView = new BookViewDialogImpl();
//		bookView.doMainView();
		
		//����savebooks,�����ݿ��е�д��Ϊdat�ļ�
//		System.out.println(Datas.bookStore.length);
//		FileUtil.SaveBooks(Datas.bookStore);
		
		//����Loadbooks����dat�ļ��е�д��Ϊһ��������
//		System.out.println(FileUtil.LoadBooks().length);
//		Book[] booksArray = FileUtil.LoadBooks();
//		for(int i = 0; i< booksArray.length; i++) {
//			if(booksArray[i] == null) break;
//			System.out.println(booksArray[i].getBookID()+"\t"+booksArray[i].getBookName()+"\t"+booksArray[i].getCount());
//		}
//		
		// testing
//		Book newBook = new Book();
//		newBook.setBookID("10");
//		newBook.setBookName("�����˲�");
//		BookBiz bookbiz = new BookBiz();
//		bookbiz.addBook(newBook);
//		show();
//		//bookbiz.delBook(newBook);
//		//show();
//		bookbiz.inStore("10", 4);
//		show();
//		bookbiz.outStore("10", 2);
//		show();
		
	}
	
	public static void show() {
		BookBiz bookbiz = new BookBiz();
		if(bookbiz.getBookCount() <= 0) {
			System.out.println("�ֿ����");
		}
		for(int i = 0; i < bookbiz.getBookCount(); i++) {
			System.out.println(Datas.bookStore[i].getBookID()+"\t"+Datas.bookStore[i].getBookName()+"\t"+Datas.bookStore[i].getCount());
			
		}
		
	}

}
