package Library_System2;
/**
 * ͼ��ҵ���࣬��ͼ���Լ�ͼ��������л�������
 * @todo TODO
 * @author Jaden
 * @date 2020��2��24��,����10:53:07
 * @copyright Jaden
 */
public class BookBiz {
	//������ҵ�񷽷�
	//����ͼ�顢���⡢��⡢ɾ��
	
	/**
	 * ���ͼ��ֿ���Data.BookStores������ͼ�����ĸ���
	 * ֻ�ܼ���datas.boostore�еģ������ܼ���һ��book array������
	 * ������
	 * @return
	 */
	public int getBookCount() {
		int count = 0;
		for(Book book : Datas.bookStore) {
			if(book == null) break; 
			count++;
		}
		return count;
	}
	/**
	 * ���غ��������һ������
	 * @param books
	 * @return
	 */
	public int getBookCount(Book ...books) {
		int count = 0;
		for(Book book : books) {
			if(book == null) break; 
			count++;
		}
		return count;
	}
	
	/**
	 * �����ͼ����õ�ͼ��ֿ⵱��ȥ
	 * @param book
	 * @return �Ƿ���óɹ�������ֿ��Ѿ���������false
	 */
	public boolean addBook(Book book) {
		int bookCount = getBookCount();
		if(Datas.bookStore.length == bookCount) {
			return false;
		}
		//����
		Datas.bookStore[bookCount] = book;
		return true;
	}
	/**
	 * ɾ��Ҫ�����ͼ�����
	 * @param book
	 * @return �Ƿ�ɾ���ɹ�
	 */
	public boolean delBook(Book book) {
		int bookCount = getBookCount();
		int delIndex = -1;
		for(int i = 0; i<bookCount; i++) {
			//����������αȽ���������ȫ��ȣ���������isbn�Ų���Ƚϣ�Ҳ������дequals����
			//if(book.getBookID().equals(Datas.bookStore[i].getBookID())) {}
			if(book.equals(Datas.bookStore[i])) {
				delIndex = i;
				break;
			}
		}
			if(delIndex == -1) {
				return false; //û���ҵ�����飬����false���˳���
			}
		//ִ��ɾ����������·
		for(int i = delIndex; i < bookCount-1; i++) {
			Datas.bookStore[i] = Datas.bookStore[i+1];
		}
		//�����һ��Ԫ�أ�ʣ��Ŀ�λ���ÿ�
		Datas.bookStore[bookCount-1] = null;
		return true;
	}
	/**
	 * ����ID����ͼ��
	 * @param bookID
	 * @return ����ͼ�����
	 */
	public Book findByID(String bookID) {
		int bookCount = getBookCount();
		for(int i =0; i<bookCount; i++) {
			if(bookID.equals(Datas.bookStore[i].getBookID())) {
				return Datas.bookStore[i]; //id��ȷ���
			}
		}
		return null;
	}
	/**
	 * ��⣺Ϊ�ֿ����е�ͼ�����ӿ��
	 * @param bookID
	 * @param count
	 * @return ����bookID�����������ʧ��
	 */
	public boolean inStore(String bookID, int count) {
		Book book = findByID(bookID);
		if(null == book) {
			return false; //����ʾ�㼰�����������ʧ��
		}
		//���ӿ��
		book.setCount(book.getCount() + count); //��������һ������
		return true; //����ʾ����˵���ɹ��������ʾ��ʾ
	}
	
	/**
	 * ���⣺���вֿ��������
	 * @param bookID
	 * @param count
	 * @return ���С��countʱ������ʧ��
	 */
	public boolean outStore(String bookID, int count) {
		Book book = findByID(bookID);
		if(null == book) {
			return false;
		}
		if(book.getCount() < count) {
			return false;
		}
		book.setCount(book.getCount() - count); //����һ������ͼ��
		return true;
	}
}
