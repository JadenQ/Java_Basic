/**
 * ͼ���ҵ���࣬��װ��ͼ�����ݵ���ɾ�Ĳ鷽��
 */
public class RefPass1_Lib {
	/**
	 * �����鼮
	 * @param book Ҫ���۵���Ķ���
	 * @return ���۳ɹ����������۵�����///����ʧ�ܣ�����-1
	 */
	public int sellBook(RefPass1_Book book) {
		//1 �ж�ͼ��Ŀ���Ƿ����1
		//2 ͼ����-1
		//3 �������۵�����
		if(!(book.getCount()>1)) {
			return -1;
		}
		//��ǰ�Ŀ����-1
		book.setCount(book.getCount()-1);
		return 1;
	}
}
