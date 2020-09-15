package Library_System2;
import java.util.Scanner;
/**
 * 图书系统的视图
 * 为了之后对界面更好升级，可以将这个bookview文件分解成抽象类abstractBookView和BookViewConsoleImpl
 * @todo TODO
 * @author Jaden
 * @date 2020年2月24日,下午1:14:06
 * @copyright Jaden
 */
public class BookView {
	private Scanner input = null;
	private BookBiz bookbiz = null;
	
	public BookView() {
		input = new Scanner(System.in);
		bookbiz = new BookBiz();
		
		 System.out.println("********************"); ////
		 System.out.println("\t欢迎使用Jaden图书管理系统"); ////
		 System.out.println("\t1.登录\t2.退出系统"); ////
		 System.out.println("********************"); 
		 System.out.println("请选择：");
		 //实际留出提供选择输入 
		 String choice = input.next(); 
		 if("1".equals(choice)) {
			 //执行登陆操作 
			 System.out.println("登陆成功！(未实现登录功能)"); 
			 //验证成功显示主菜单
			 showMainView();
		 } 
		 System.out.println("Jaden图书管理系统成功退出！感谢您的使用！"); //
		}
	/**
	 * 显示主菜单
	 * @return 返回true：继续执行主菜单；false继续上一级菜单
	 */
	public void showMainView() {
		System.out.println("\nJaden图书管理系统>>主菜单");
		System.out.println("1.新增图书\t2.删除图书\t3.查看所有图书\t4.按照编号查询\t5.入库\t6.出库\t7.退出系统");
		System.out.println("请您选择：");
		String choice = input.next();
		switch(choice) {
		//显示先三个
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
		case"4": //按编号查询
			showFindByID();
			break;
		case"5": //入库
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
	//显示层
	public Book showAddNewView() {
		System.out.println("Jaden管理系统>>新增图书");
		System.out.println("书籍编号：");
		String bookID = input.next();//
		//这里需要验证用户输入的编号是否存在
		Book newBook = bookbiz.findByID(bookID);
		if(newBook == null) {
			//创建并介绍书籍对象
			newBook = new Book();
			newBook.setBookID(bookID); //前面输入了，需要设置一下
			System.out.println("请输入收录书籍信息，名称：");
			newBook.setBookName(input.next());
			System.out.println("库存数量：");
			newBook.setCount(input.nextInt());
			//....其他书籍信息
			//业务层实现
			bookbiz.addBook(newBook); //添加到图书仓库
			
		} //图书不存在
		else {//图书已经存在
			System.out.println("系统已存录该书籍信息，请重新录入！");
			newBook = showAddNewView(); //重新调用该方法
		}
		return newBook;
	}
	/**
	 * 可以输入一本书，或者图书对象的数组
	 * 显示所有的图书信息
	 * 如果传入null，则默认显示图书仓库中的数组：datas.BookStore
	 * @param BookArray
	 */
	public void showBooks(Book ... BookArray) {
		System.out.println("内部编号\t\t名称\t库存");
		if(BookArray == null) {  //输入null时，显示所有的图书内容
			BookArray = Datas.bookStore;
		}
		int bookCount = bookbiz.getBookCount(BookArray);
		for(int i = 0; i<bookCount; i++) {
//			System.out.println(getType(BookArray[i].getCount()));

			System.out.printf("%s\t\t %s\t\t %d\n",BookArray[i].getBookID(),BookArray[i].getBookName(),BookArray[i].getCount());
		}
	}
	/**
	 * 删除图书界面
	 */
	public void showDelBookView() {
		System.out.println("\nJaden图书管理系统>>删除图书");
		System.out.println("输入要删除的图书编号");
		String delID = input.next();
		Book delBook = new Book(); 
		delBook.setBookID(delID); 
		if(bookbiz.delBook(delBook)) {   //delBook方法返回是否删除成功
			System.out.println("删除成功！");
			showBooks(null); //相当于刷新当前图书
		}
		else {
			System.out.println("删除失败！");
		}
	}
	
	/**
	 * 根据编号查询
	 */
	public void showFindByID() {
		System.out.println("Jaden图书管理系统>>按编号查询");
		System.out.println("输入要查询的编号：");
		String bookID = input.next();
		Book book = bookbiz.findByID(bookID);
		if(book == null) {
			System.out.println("未找到图书信息");
			return;
		}
		else showBooks(book);
	}
	/**
	 * 入库的显示
	 */
	public void showInStore() {
		//图书ID和数量
		System.out.println("\nJaden图书管理系统>>图书入库");
		System.out.println("入库的图书编号：");
		String bookID = input.next();
		System.out.println("入库的数量：");
		int bookCount = input.nextInt();
		if(bookbiz.inStore(bookID, bookCount)) {
			System.out.println("入库成功！");
			showBooks(null);
		}
		else System.out.println("入库失败，请检查编号");
	}
	/**
	 * 出库的显示
	 */
	public void showOutStore() {
		System.out.println("\nJaden图书管理系统>>图书出库");
		System.out.println("出库的图书编号：");
		String bookID = input.next();
		System.out.println("出库的数量：");
		int bookCount = input.nextInt();
		if(bookbiz.inStore(bookID, bookCount)) {
			System.out.println("出库成功！");
			showBooks(null);
		}
		else System.out.println("出库失败，请检查编号是否错误，或出库数量是否超限");
	}
	
//	private static String getType(Object a) {
//		return a.getClass().toString();
// 
//	}

	
}
