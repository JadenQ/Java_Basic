package Library_System2;

public class Main {

	public static void main(String[] args) {
		
		//new BookView().showBooks(Datas.bookStore);
		
		//不使用抽象类：
//		new BookView();
		
		
		//使用抽象类：IDLE控制台实现
		AbstractBookView bookView = new BookViewConsoleImpl();
		bookView.start();
		
		//使用抽象类：对话框实现
//		AbstractBookView bookView = new BookViewDialogImpl();
//		bookView.doMainView();
		
		//测试savebooks,将数据库中的写出为dat文件
//		System.out.println(Datas.bookStore.length);
//		FileUtil.SaveBooks(Datas.bookStore);
		
		//测试Loadbooks，将dat文件中的写入为一个个对象
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
//		newBook.setBookName("天龙八部");
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
			System.out.println("仓库空了");
		}
		for(int i = 0; i < bookbiz.getBookCount(); i++) {
			System.out.println(Datas.bookStore[i].getBookID()+"\t"+Datas.bookStore[i].getBookName()+"\t"+Datas.bookStore[i].getCount());
			
		}
		
	}

}
