package Library_System2;

import java.util.Scanner;

//除了showMainView（主逻辑），其他都是抽象方法

public abstract class AbstractBookView {

	
	public AbstractBookView() {
			
		}
	
	//主要逻辑：
	/**
	 * 本方法用来规定固定的程序逻辑
	 */
	public void doMainView() {
		String result = showMainView();
		switch(result) {
		//显示先三个
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
		case"4": //按编号查询
			showFindByID();
			break;
		case"5": //入库
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
	 * 返回1-7之间的用户选择项
	 * @return
	 */
	public abstract void start();
	public abstract String showMainView();
	
	public abstract void showOutStore();

	public abstract void showInStore();

	//显示层
	public abstract Book showAddNewView();
	/**
	 * 可以输入一本书，或者图书对象的数组
	 * 显示所有的图书信息
	 * 如果传入null，则默认显示图书仓库中的数组：datas.BookStore
	 * @param BookArray
	 */
	public abstract void showBooks(Book ... BookArray);
	/**
	 * 删除图书界面
	 */
	public abstract void showDelBookView(); 
	/**
	 * 根据编号查询
	 */
	public abstract void showFindByID();

	
//	private static String getType(Object a) {
//		return a.getClass().toString();
// 
//	}


}
