package Library_System2;
/**
 * 图书业务类，对图书以及图书数组进行基本操作
 * @todo TODO
 * @author Jaden
 * @date 2020年2月24日,上午10:53:07
 * @copyright Jaden
 */
public class BookBiz {
	//基本的业务方法
	//增加图书、出库、入库、删除
	
	/**
	 * 获得图书仓库中Data.BookStores数组中图书对象的个数
	 * 只能计算datas.boostore中的，而不能计算一个book array的数量
	 * 可重载
	 * @return
	 */
	public int getBookCount() {
		int count = 0;
		for(Book book : Datas.bookStore) {
			if(book == null) break; 
			count++;
		}
		return count;
	}
	/**
	 * 重载后可以输入一个数组
	 * @param books
	 * @return
	 */
	public int getBookCount(Book ...books) {
		int count = 0;
		for(Book book : books) {
			if(book == null) break; 
			count++;
		}
		return count;
	}
	
	/**
	 * 传入的图书放置到图书仓库当中去
	 * @param book
	 * @return 是否放置成功，如果仓库已经满，返回false
	 */
	public boolean addBook(Book book) {
		int bookCount = getBookCount();
		if(Datas.bookStore.length == bookCount) {
			return false;
		}
		//不满
		Datas.bookStore[bookCount] = book;
		return true;
	}
	/**
	 * 删除要传入的图书对象
	 * @param book
	 * @return 是否删除成功
	 */
	public boolean delBook(Book book) {
		int bookCount = getBookCount();
		int delIndex = -1;
		for(int i = 0; i<bookCount; i++) {
			//问题在于如何比较两个书完全相等：可以利用isbn号差异比较，也可以重写equals方法
			//if(book.getBookID().equals(Datas.bookStore[i].getBookID())) {}
			if(book.equals(Datas.bookStore[i])) {
				delIndex = i;
				break;
			}
		}
			if(delIndex == -1) {
				return false; //没有找到这个书，返回false并退出了
			}
		//执行删除操作的套路
		for(int i = delIndex; i < bookCount-1; i++) {
			Datas.bookStore[i] = Datas.bookStore[i+1];
		}
		//将最后一个元素（剩余的空位）置空
		Datas.bookStore[bookCount-1] = null;
		return true;
	}
	/**
	 * 利用ID查找图书
	 * @param bookID
	 * @return 返回图书对象
	 */
	public Book findByID(String bookID) {
		int bookCount = getBookCount();
		for(int i =0; i<bookCount; i++) {
			if(bookID.equals(Datas.bookStore[i].getBookID())) {
				return Datas.bookStore[i]; //id相等返回
			}
		}
		return null;
	}
	/**
	 * 入库：为仓库现有的图书增加库存
	 * @param bookID
	 * @param count
	 * @return 入库的bookID不存在则入库失败
	 */
	public boolean inStore(String bookID, int count) {
		Book book = findByID(bookID);
		if(null == book) {
			return false; //在显示层及逆行提醒入库失败
		}
		//增加库存
		book.setCount(book.getCount() + count); //在数量这一栏增加
		return true; //在显示层再说明成功加入的显示提示
	}
	
	/**
	 * 出库：现有仓库存量减少
	 * @param bookID
	 * @param count
	 * @return 库存小于count时，出库失败
	 */
	public boolean outStore(String bookID, int count) {
		Book book = findByID(bookID);
		if(null == book) {
			return false;
		}
		if(book.getCount() < count) {
			return false;
		}
		book.setCount(book.getCount() - count); //减少一定量的图书
		return true;
	}
}
