package booksystem.biz;

import java.io.Serializable;
import java.util.Map;

/**
 * ����������ҵ����Ĺ��нӿ�
 * ����������ҵ���ͨ�ò���
 * @todo TODO
 * @author Jaden
 * @date 2020��3��15��,����11:12:42
 * @copyright Jaden
 */
public interface Biz<T> extends Serializable{ //ʹ�÷��ͱ��<T>
	/**
	 * ͨ�õ���ӷ���
	 * @param t
	 * @return
	 */
	public boolean add(T t);
	

	/**
	 * ͨ��ɾ��
	 * @param t
	 * @return
	 */
	public boolean del(T t);
	/**
	 * �޸�
	 */
	public T update(T t);
	/**����id��ѯ*/
	public T findByID(String ID);
	/**���ݼ�ֵ�Բ�ѯ����*/
	public Map<String,T> findAll();
}
