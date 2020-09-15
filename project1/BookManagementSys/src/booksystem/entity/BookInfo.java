package booksystem.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * ��ͼ���ISBNΪΨһ��ʶͼ�����Ϣ�ࣨISBN��
 * ĳһ��ISBN���Ӧ�ܶ౾��ʵ���ڵ�ͼ�����
 * isbn��������ߣ������磬�����������ʱ�䣬����
 * @todo TODO
 * @author Jaden
 * @date 2020��3��11��,����12:06:23
 * @copyright Jaden
 */
//��Ϊ��ʹ�ö�������������л���չ�ӿ�
//bookinfo - book һ�Զ�Ĺ�ϵ

public class BookInfo implements Serializable{

	private static final long serialVersionUID = -2847303466901121425L;
	private String isbn;
	private String name;
	private String type; //���Զ���Ϊö������
	private String author;
	private String publisher;
	private int inStoreCount;
	private Date publishDate;
	private double price;
	private List<Book> bookList;
	
	//���幹�췽������дtoString,equals�Ȳ������õ�ʱ�������
	/**
	 * ����һ��ISBN���ͼ����Ϣ�������ʵ��ͼ�����
	 * @param book
	 */
	public void addBook(Book book) {
		//ע������ʹ����bookList����
		if(null == bookList) {bookList = new ArrayList<>();}
		if(null == book) return;
		if(!isbn.equals(book.getIsbn())) return;
		//�����ͬһ���飬�ǾͲ���Ҫ�������,containsʹ����equals����
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
