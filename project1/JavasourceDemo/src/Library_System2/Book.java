package Library_System2;
/**
 * 图书实体类
 * @todo TODO
 * @author Jaden
 * @date 2020年2月24日,上午9:54:57
 * @copyright Jaden
 */
public class Book {
	private String bookID; //图书的内部编号
	private String bookName; //图书的名称
	private String isbn; //isbn
	private String type; //图书的类型
	private String author; //作者：暂时不用
	private String publisher; //出版社，暂时不用
	private int count; //库存量，入库增加，出库减少
	private double price; //图书的单价
	
	//构造方法
	public Book() {}
	/**
	 * 重写图书对象的equals方法，方便后续进行的对象恒等性比较 
	 * book1.equals(book2)
	 */
	@Override
	public boolean equals(Object obj) {
		if(null == obj || !(obj instanceof Book)) {
			return false;
		}
		Book book = (Book)obj;
		return bookID.equals(book.getBookID()); //指利用bookID比较多
	}
	public String getBookID() {
		return bookID;
	}


	public void setBookID(String bookID) {
		this.bookID = bookID;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
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


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}
	
	
}
