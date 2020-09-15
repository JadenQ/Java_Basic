package booksystem.view;
import java.util.Scanner;

import booksystem.auth.Role;
import booksystem.entity.User;


public class BookView {
	private Scanner input = null;
	private User loginUser = null; //当前已登录的用户对象
	private Role role = null;  //当前已经登录对象对应的角色，用来调用业务方法
	
	public BookView() {
		input = new Scanner(System.in);
		//扩展功能:从配置文件中获得当前系统的名称，然后在欢迎界面显示
		showWelcome();
	}
	/**
	 * 显示欢迎界面
	 */
	public void showWelcome() {
		System.out.println("*********欢迎使用J图书管理系统********");
		System.out.println("\t\t1.登录系统\t2.注册\t3.退出系统\t");
		System.out.println("==================");
		System.out.println("请选择：");
		String choice = input.next();
		if("1".equals(choice)) { //登录
			//验证用户是否合法，如果合法，保存起来并在后面使用，显示对应菜单
			showLoginView();
			System.out.println("当前角色:"+this.role.getKey());
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
			System.out.println("注册功能，自行实现。");
		}else {
			System.out.println("系统已经成功退出");
		}
			
	}
	
	public User showLoginView() {
		User loginUser = new User();
		System.out.println("用户名：");
		loginUser.setUserName(input.next());
		System.out.println("密码：");
		loginUser.setPassword(input.next());
		//1.通过业务方法，验证当前录入的用户对象是否合法
		//2.如果合法，当前登录用户保存到this.loginUser中备用，再设置当前用户名的角色以便调用
		//调用相应的菜单和调用响应的方法
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
	
	//主菜单
	public void showMainView_Admin() {
		System.out.println("管理员主菜单！");
	}
	public void showMainView_Op() {
		System.out.println("操作员主菜单！");
	}
}
