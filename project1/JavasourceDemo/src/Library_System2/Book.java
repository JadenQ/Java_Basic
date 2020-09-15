package Library_System2;
/**
 * ͼ��ʵ����
 * @todo TODO
 * @author Jaden
 * @date 2020��2��24��,����9:54:57
 * @copyright Jaden
 */
public class Book {
	private String bookID; //ͼ����ڲ����
	private String bookName; //ͼ�������
	private String isbn; //isbn
	private String type; //ͼ�������
	private String author; //���ߣ���ʱ����
	private String publisher; //�����磬��ʱ����
	private int count; //�������������ӣ��������
	private double price; //ͼ��ĵ���
	
	//���췽��
	public Book() {}
	/**
	 * ��дͼ������equals����������������еĶ������ԱȽ� 
	 * book1.equals(book2)
	 */
	@Override
	public boolean equals(Object obj) {
		if(null == obj || !(obj instanceof Book)) {
			return false;
		}
		Book book = (Book)obj;
		return bookID.equals(book.getBookID()); //ָ����bookID�Ƚ϶�
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
