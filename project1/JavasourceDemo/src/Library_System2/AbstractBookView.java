package Library_System2;

import java.util.Scanner;

//����showMainView�����߼������������ǳ��󷽷�

public abstract class AbstractBookView {

	
	public AbstractBookView() {
			
		}
	
	//��Ҫ�߼���
	/**
	 * �����������涨�̶��ĳ����߼�
	 */
	public void doMainView() {
		String result = showMainView();
		switch(result) {
		//��ʾ������
		case"1":
			showAddNewView();
			showBooks(Datas.bookStore);
			break;
		case"2":
			showDelBookView();
			break;
		case"3":
			showBooks(null);
			break;
		case"4": //����Ų�ѯ
			showFindByID();
			break;
		case"5": //���
			showInStore();
			break;
		case"6":
			showOutStore();
			break;
		case"7":
			return;
		default:
			break;
		}
		doMainView();
		
	}
	
	/**
	 * ����1-7֮����û�ѡ����
	 * @return
	 */
	public abstract void start();
	public abstract String showMainView();
	
	public abstract void showOutStore();

	public abstract void showInStore();

	//��ʾ��
	public abstract Book showAddNewView();
	/**
	 * ��������һ���飬����ͼ����������
	 * ��ʾ���е�ͼ����Ϣ
	 * �������null����Ĭ����ʾͼ��ֿ��е����飺datas.BookStore
	 * @param BookArray
	 */
	public abstract void showBooks(Book ... BookArray);
	/**
	 * ɾ��ͼ�����
	 */
	public abstract void showDelBookView(); 
	/**
	 * ���ݱ�Ų�ѯ
	 */
	public abstract void showFindByID();

	
//	private static String getType(Object a) {
//		return a.getClass().toString();
// 
//	}


}
