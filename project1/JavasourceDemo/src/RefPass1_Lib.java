/**
 * 图书的业务类，封装了图书数据的增删改查方法
 */
public class RefPass1_Lib {
	/**
	 * 销售书籍
	 * @param book 要销售的书的对象
	 * @return 销售成功：返回销售的数量///销售失败：返回-1
	 */
	public int sellBook(RefPass1_Book book) {
		//1 判断图书的库存是否大于1
		//2 图书库存-1
		//3 返回销售的数量
		if(!(book.getCount()>1)) {
			return -1;
		}
		//当前的库存量-1
		book.setCount(book.getCount()-1);
		return 1;
	}
}
