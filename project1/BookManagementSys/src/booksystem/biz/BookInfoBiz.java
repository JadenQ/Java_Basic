package booksystem.biz;

import booksystem.entity.BookInfo;

/**
 * ͼ��ҵ����Ľӿ�
 * ��ɾ�Ĳ飨ֻҪ�й�ͬ�����ġ�������һ�����ӿڣ�
 * �ڱ��ļ�д�����е�
 * @todo TODO
 * @author Jaden
 * @date 2020��3��15��,����11:12:00
 * @copyright Jaden
 */
public interface BookInfoBiz extends Biz<BookInfo>{
	public BookInfo findByIsbn(String isbn);
	/**
	 * ����
	 * @param isbn
	 * @param outCount
	 * @return
	 */
	public boolean outStore(String isbn, int outCount);
	/**
	 * ���
	 * @param isbn
	 * @param inCount
	 * @return
	 */
	public boolean inStore(String isbn, int inCount);
}
