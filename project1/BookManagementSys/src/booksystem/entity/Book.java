package booksystem.entity;

import java.io.Serializable;

/**
 * ��ʵ��ͼ����󣬶��߽���ʱ�����Ķ���book�������bookinfo����
 * @todo TODO
 * @author Jaden
 * @date 2020��3��11��,����12:12:34
 * @copyright Jaden
 */
public class Book implements Serializable{
	
	private static final long serialVersionUID = 6055356243595179942L;
	private String isbn;
	private String bookID; //ͼ����и�����ڲ����
	//private boolean isCanBorrow//�Ƿ�ɽ�
	private BookState state;
	private BookInfo bookInfo; //����ͨ��book����bookinfo
	
	//����equals��������֤�Ƿ���ͬһ���飺���� ���������bookID�Ƿ���ͬ
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
 * ͼ��״̬���ɽ衢���ɽ衢ȱ������
 * @todo TODO
 * @author Jaden
 * @date 2020��3��11��,����12:27:15
 * @copyright Jaden
 */
enum BookState{
	�ɽ�,���ɽ�,ȱ��,��,ά����
}