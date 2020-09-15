package booksystem.view;
import java.util.Scanner;

import booksystem.auth.Role;
import booksystem.entity.User;


public class BookView {
	private Scanner input = null;
	private User loginUser = null; //��ǰ�ѵ�¼���û�����
	private Role role = null;  //��ǰ�Ѿ���¼�����Ӧ�Ľ�ɫ����������ҵ�񷽷�
	
	public BookView() {
		input = new Scanner(System.in);
		//��չ����:�������ļ��л�õ�ǰϵͳ�����ƣ�Ȼ���ڻ�ӭ������ʾ
		showWelcome();
	}
	/**
	 * ��ʾ��ӭ����
	 */
	public void showWelcome() {
		System.out.println("*********��ӭʹ��Jͼ�����ϵͳ********");
		System.out.println("\t\t1.��¼ϵͳ\t2.ע��\t3.�˳�ϵͳ\t");
		System.out.println("==================");
		System.out.println("��ѡ��");
		String choice = input.next();
		if("1".equals(choice)) { //��¼
			//��֤�û��Ƿ�Ϸ�������Ϸ��������������ں���ʹ�ã���ʾ��Ӧ�˵�
			showLoginView();
			System.out.println("��ǰ��ɫ:"+this.role.getKey());
			switch (this.role.getKey()) {
			case "administrator":
				showMainView_Admin();
				break;
			case "operator":
				showMainView_Op();
				break;
			default: break;
			}
			
			
		}else if("2".equals(choice)) {
			System.out.println("ע�Ṧ�ܣ�����ʵ�֡�");
		}else {
			System.out.println("ϵͳ�Ѿ��ɹ��˳�");
		}
			
	}
	
	public User showLoginView() {
		User loginUser = new User();
		System.out.println("�û�����");
		loginUser.setUserName(input.next());
		System.out.println("���룺");
		loginUser.setPassword(input.next());
		//1.ͨ��ҵ�񷽷�����֤��ǰ¼����û������Ƿ�Ϸ�
		//2.����Ϸ�����ǰ��¼�û����浽this.loginUser�б��ã������õ�ǰ�û����Ľ�ɫ�Ա����
		//������Ӧ�Ĳ˵��͵�����Ӧ�ķ���
		loginUser = loginUser.getRole().login(loginUser);
		if(loginUser == null) {
			return null;
		}
		else {
			this.loginUser = loginUser;
			this.role = this.loginUser.getRole();
			return this.loginUser;
		}
	}
	
	//���˵�
	public void showMainView_Admin() {
		System.out.println("����Ա���˵���");
	}
	public void showMainView_Op() {
		System.out.println("����Ա���˵���");
	}
}