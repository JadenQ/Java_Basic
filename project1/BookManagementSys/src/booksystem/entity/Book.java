package booksystem.entity;

import java.io.Serializable;

/**
 * 真实的图书对象，读者借书时操作的对象，book对象包含bookinfo对象
 * @todo TODO
 * @author Jaden
 * @date 2020年3月11日,下午12:12:34
 * @copyright Jaden
 */
public class Book implements Serializable{
	
	private static final long serialVersionUID = 6055356243595179942L;
	private String isbn;
	private String bookID; //图书馆中该书的内部编号
	//private boolean isCanBorrow//是否可借
	private BookState state;
	private BookInfo bookInfo; //可以通过book访问bookinfo
	
	//重载equals方法，验证是否是同一本书：条件 两个对象的bookID是否相同
	@Override
	public boolean equals(Object obj) {
		if(null == obj) return false;
		if(!(obj instanceof Book)) return false;
		Book book = (Book)obj;
		
		return bookID.equals(book.getBookID());
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getBookID() {
		return bookID;
	}
	public void setBookID(String bookID) {
		this.bookID = bookID;
	}
	public BookState getState() {
		return state;
	}
	public void setState(BookState state) {
		this.state = state;
	}
	public BookInfo getBookInfo() {
		return bookInfo;
	}
	public void setBookInfo(BookInfo bookInfo) {
		this.bookInfo = bookInfo;
	}
}

/**
 * 图书状态：可借、不可借、缺货、损坏
 * @todo TODO
 * @author Jaden
 * @date 2020年3月11日,下午12:27:15
 * @copyright Jaden
 */
enum BookState{
	可借,不可借,缺货,损坏,维修中
}