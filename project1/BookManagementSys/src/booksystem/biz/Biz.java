package booksystem.biz;

import java.io.Serializable;
import java.util.Map;

/**
 * 定义了所有业务类的共有接口
 * 定义了所有业务的通用操作
 * @todo TODO
 * @author Jaden
 * @date 2020年3月15日,上午11:12:42
 * @copyright Jaden
 */
public interface Biz<T> extends Serializable{ //使用泛型编程<T>
	/**
	 * 通用的添加方法
	 * @param t
	 * @return
	 */
	public boolean add(T t);
	

	/**
	 * 通用删除
	 * @param t
	 * @return
	 */
	public boolean del(T t);
	/**
	 * 修改
	 */
	public T update(T t);
	/**根据id查询*/
	public T findByID(String ID);
	/**根据键值对查询所有*/
	public Map<String,T> findAll();
}
