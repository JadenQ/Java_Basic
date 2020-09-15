package librarySystem1;

import javax.swing.JOptionPane;

/**
 * 使用升级的如数界面
 * @todo TODO
 * @author Jaden
 * @date 2020年2月27日,上午11:34:39
 * @copyright Jaden
 */
public class BookViewDialogImpl extends AbstractBookView{
	//初始化
	private BookBiz bookbiz = null;
	//构造方法
	public BookViewDialogImpl() {
		bookbiz = new BookBiz();
	}
	//重载
	@Override
	public void start() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public String showMainView() {
		// TODO Auto-generated method stub
		String strMenu = "\\nJaden图书管理系统>>主菜单";
		strMenu += "1.新增图书\t2.删除图书\t3.查看所有图书\t4.按照编号查询\t5.入库\t6.出库\t7.退出系统";
		strMenu += "请选择：";
		String result = JOptionPane.showInputDialog(strMenu); //显示输入对话框
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
	//仅仅将输入从scanner 改为 joptionpane.showinputdialog   输出改为joption...
	public Book showAddNewView() {
		// TODO Auto-generated method stub
		Book newbook = new Book();
		String bookID = null;
		String bookName = null;
		int count = -1;
		//这三个变量输入时需要验证用户输入数据的合法性
		bookID = JOptionPane.showInputDialog("请输入图书编号：");
		bookName = JOptionPane.showInputDialog("图书名称：");
		count = Integer.parseInt(JOptionPane.showInputDialog("库存量："));
		
		newbook.setBookID(bookID);
		newbook.setBookName(bookName);
		newbook.setCount(count);
		
		if(bookbiz.addBook(newbook)) {
			JOptionPane.showMessageDialog(null, "添加成功！");
		}
		else{
			JOptionPane.showMessageDialog(null, "添加失败！");
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
