package booksystem.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import booksystem.auth.Role;
import booksystem.biz.BookInfoBiz;
import booksystem.biz.implement.BookInfoBizImp1;
import booksystem.entity.Book;
import booksystem.entity.BookInfo;
import booksystem.entity.User;
import booksystem.util.FileUtil;
import booksystem.view.BookView;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//测试图书实体类定义();
		//测试图书业务类();
		//测试图书的出库和入库();
		测试角色();
		测试用户类();
	}
	
	public static void 测试图书业务类() {
		BookInfoBiz bookInfoBiz = new BookInfoBizImp1();
		bookInfoBiz.findByID("abd");
	}
	
	public static void 测试图书实体类定义(){
		BookInfo bookInfo = new BookInfo();
		bookInfo.setIsbn("242-463");
		bookInfo.setName("三生三世");
		
		Book book = new Book();
		book.setIsbn("242-463"); // 扫描isbn进入
		//添加这本书
		bookInfo.addBook(book);
		
		//写入
		Map<String, BookInfo> infoMap = new HashMap<>();
		infoMap.put(bookInfo.getIsbn(),bookInfo); //数据放入map
		FileUtil.SaveBookInfoMap(infoMap);
		System.out.println(book.getBookInfo().getName());
		//读出
		infoMap = FileUtil.ReadBookInfoMap();
		System.out.println("从文件中读取出的图书信息");
		for(String isbn : infoMap.keySet()) {
			System.out.println(isbn);
		}
	}
	public static void 测试角色() {
		Role role1 = new Role();
		System.out.println(role1.getName()+"\t"+role1.getKey());
		System.out.println("权限集合:"+"\t"+role1.getPermissions());
		
		Role role2 = new Role("操作员","operator");
		System.out.println(role2.getName()+"\t"+role2.getKey());
		System.out.println("权限集合:"+"\t"+role2.getPermissions());
		
		System.out.println(role1.inStore("123", 3));
	}
//测试出入库
	public static void 测试图书的出库和入库() {
		Scanner input = new Scanner(System.in);
		BookInfoBiz bookInfoBiz = new BookInfoBizImp1();
		
	//随机先添加5本书
		BookInfo bookInfo = new BookInfo();
		bookInfo.setIsbn("123-456");
		bookInfo.setName("三生三世");
		for(int i = 0; i < 5; i++) {
			Book book = new Book();
			book.setBookID((i+1)+"");
			book.setIsbn("123-456");
			bookInfo.addBook(book); //将当前这本书添加到书籍信息
		}
		Map<String, BookInfo> infoMap = new HashMap<>();
		//向集合中添加一种书籍
		infoMap.put(bookInfo.getIsbn(), bookInfo);
		//将图书信息集合写入文件
		FileUtil.SaveBookInfoMap(infoMap);
		int originalNum = bookInfo.getBookListLength();
		System.out.println("库中已经有点的书籍数量："+ originalNum);
		//入库操作
		System.out.println("扫描要入库的图书出版号：");
		String isbn = input.next();
		boolean isInStoreSuccess = bookInfoBiz.inStore(isbn, 12);
		System.out.println("入库是否成功："+isInStoreSuccess);
		BookInfo curBookInfo = bookInfoBiz.findByIsbn(isbn);
		System.out.println("当前库存："+(curBookInfo.getInStoreCount()+originalNum));
		//出库操作
		boolean isOutStoreSuccess = bookInfoBiz.outStore(isbn, 8);
		curBookInfo = bookInfoBiz.findByIsbn(isbn);
		System.out.println("入库是否成功："+isOutStoreSuccess);
		System.out.println("当前库存：" + (curBookInfo.getInStoreCount()+originalNum));
	}

	public static void 测试用户类() {
		User user = new User(new Role("齐天大圣","operator"));
		user.setUserName("孙悟空");
		user.setPassword("jingubang"); // 设置密码
		Set<User> userSet = new HashSet<>();
		userSet.add(user);
		FileUtil.SaveUser(userSet);
		
		userSet = FileUtil.ReadUser();
		for(User u : userSet) {
			System.out.println("用户"+user.getUserName()+"的权限："+user.getRole().getPermissions()+"\n"+user.getUserName()+","+user.getRole().getName());
		}
		
		new BookView();
		
	}
}
