package booksystem.biz;

import booksystem.entity.BookInfo;

/**
 * 图书业务类的接口
 * 增删改查（只要有共同操作的。都建立一个父接口）
 * 在本文件写入特有的
 * @todo TODO
 * @author Jaden
 * @date 2020年3月15日,上午11:12:00
 * @copyright Jaden
 */
public interface BookInfoBiz extends Biz<BookInfo>{
	public BookInfo findByIsbn(String isbn);
	/**
	 * 出库
	 * @param isbn
	 * @param outCount
	 * @return
	 */
	public boolean outStore(String isbn, int outCount);
	/**
	 * 入库
	 * @param isbn
	 * @param inCount
	 * @return
	 */
	public boolean inStore(String isbn, int inCount);
}
