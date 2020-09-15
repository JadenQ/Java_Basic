package booksystem.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 以图书的ISBN为唯一标识图书的信息类（ISBN）
 * 某一个ISBN会对应很多本真实存在的图书对象
 * isbn，类别，作者，出版社，库存量，出版时间，单价
 * @todo TODO
 * @author Jaden
 * @date 2020年3月11日,下午12:06:23
 * @copyright Jaden
 */
//因为会使用对象流，添加序列化扩展接口
//bookinfo - book 一对多的关系

public class BookInfo implements Serializable{

	private static final long serialVersionUID = -2847303466901121425L;
	private String isbn;
	private String name;
	private String type; //可以定义为枚举类型
	private String author;
	private String publisher;
	private int inStoreCount;
	private Date publishDate;
	private double price;
	private List<Book> bookList;
	
	//定义构造方法、重写toString,equals等操作，用的时候在完成
	/**
	 * 向这一个ISBN类的图书信息中添加真实的图书对象
	 * @param book
	 */
	public void addBook(Book book) {
		//注意这里使用了bookList对象
		if(null == bookList) {bookList = new ArrayList<>();}
		if(null == book) return;
		if(!isbn.equals(book.getIsbn())) return;
		//如果是同一本书，那就不需要在添加了,contains使用了equals方法
		if(bookList.contains(book)) return;
		book.setBookInfo(this);
		bookList.add(book);
	}

	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public int getInStoreCount() {
		return inStoreCount;
	}
	public void setInStoreCount(int inStoreCount) {
		this.inStoreCount = inStoreCount;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}


	public int getBookListLength() {
		Object[] array = bookList.toArray();
		return array.length;
	}
	
	
}
