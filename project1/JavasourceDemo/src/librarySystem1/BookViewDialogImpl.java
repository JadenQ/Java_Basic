package librarySystem1;

import javax.swing.JOptionPane;

/**
 * ʹ����������������
 * @todo TODO
 * @author Jaden
 * @date 2020��2��27��,����11:34:39
 * @copyright Jaden
 */
public class BookViewDialogImpl extends AbstractBookView{
	//��ʼ��
	private BookBiz bookbiz = null;
	//���췽��
	public BookViewDialogImpl() {
		bookbiz = new BookBiz();
	}
	//����
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String showMainView() {
		// TODO Auto-generated method stub
		String strMenu = "\\nJadenͼ�����ϵͳ>>���˵�";
		strMenu += "1.����ͼ��\t2.ɾ��ͼ��\t3.�鿴����ͼ��\t4.���ձ�Ų�ѯ\t5.���\t6.����\t7.�˳�ϵͳ";
		strMenu += "��ѡ��";
		String result = JOptionPane.showInputDialog(strMenu); //��ʾ����Ի���
		if(result == null) result = "7";
		return result;
		
	}
	@Override
	public void showOutStore() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void showInStore() {
		// TODO Auto-generated method stub
		
	}
	@Override
	//�����������scanner ��Ϊ joptionpane.showinputdialog   �����Ϊjoption...
	public Book showAddNewView() {
		// TODO Auto-generated method stub
		Book newbook = new Book();
		String bookID = null;
		String bookName = null;
		int count = -1;
		//��������������ʱ��Ҫ��֤�û��������ݵĺϷ���
		bookID = JOptionPane.showInputDialog("������ͼ���ţ�");
		bookName = JOptionPane.showInputDialog("ͼ�����ƣ�");
		count = Integer.parseInt(JOptionPane.showInputDialog("�������"));
		
		newbook.setBookID(bookID);
		newbook.setBookName(bookName);
		newbook.setCount(count);
		
		if(bookbiz.addBook(newbook)) {
			JOptionPane.showMessageDialog(null, "��ӳɹ���");
		}
		else{
			JOptionPane.showMessageDialog(null, "���ʧ�ܣ�");
		}
		
		return newbook;
	}
	@Override
	public void showBooks(Book... BookArray) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void showDelBookView() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void showFindByID() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
