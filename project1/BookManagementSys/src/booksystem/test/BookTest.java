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
		//����ͼ��ʵ���ඨ��();
		//����ͼ��ҵ����();
		//����ͼ��ĳ�������();
		���Խ�ɫ();
		�����û���();
	}
	
	public static void ����ͼ��ҵ����() {
		BookInfoBiz bookInfoBiz = new BookInfoBizImp1();
		bookInfoBiz.findByID("abd");
	}
	
	public static void ����ͼ��ʵ���ඨ��(){
		BookInfo bookInfo = new BookInfo();
		bookInfo.setIsbn("242-463");
		bookInfo.setName("��������");
		
		Book book = new Book();
		book.setIsbn("242-463"); // ɨ��isbn����
		//�����Ȿ��
		bookInfo.addBook(book);
		
		//д��
		Map<String, BookInfo> infoMap = new HashMap<>();
		infoMap.put(bookInfo.getIsbn(),bookInfo); //���ݷ���map
		FileUtil.SaveBookInfoMap(infoMap);
		System.out.println(book.getBookInfo().getName());
		//����
		infoMap = FileUtil.ReadBookInfoMap();
		System.out.println("���ļ��ж�ȡ����ͼ����Ϣ");
		for(String isbn : infoMap.keySet()) {
			System.out.println(isbn);
		}
	}
	public static void ���Խ�ɫ() {
		Role role1 = new Role();
		System.out.println(role1.getName()+"\t"+role1.getKey());
		System.out.println("Ȩ�޼���:"+"\t"+role1.getPermissions());
		
		Role role2 = new Role("����Ա","operator");
		System.out.println(role2.getName()+"\t"+role2.getKey());
		System.out.println("Ȩ�޼���:"+"\t"+role2.getPermissions());
		
		System.out.println(role1.inStore("123", 3));
	}
//���Գ����
	public static void ����ͼ��ĳ�������() {
		Scanner input = new Scanner(System.in);
		BookInfoBiz bookInfoBiz = new BookInfoBizImp1();
		
	//���������5����
		BookInfo bookInfo = new BookInfo();
		bookInfo.setIsbn("123-456");
		bookInfo.setName("��������");
		for(int i = 0; i < 5; i++) {
			Book book = new Book();
			book.setBookID((i+1)+"");
			book.setIsbn("123-456");
			bookInfo.addBook(book); //����ǰ�Ȿ�����ӵ��鼮��Ϣ
		}
		Map<String, BookInfo> infoMap = new HashMap<>();
		//�򼯺�������һ���鼮
		infoMap.put(bookInfo.getIsbn(), bookInfo);
		//��ͼ����Ϣ����д���ļ�
		FileUtil.SaveBookInfoMap(infoMap);
		int originalNum = bookInfo.getBookListLength();
		System.out.println("�����Ѿ��е���鼮������"+ originalNum);
		//������
		System.out.println("ɨ��Ҫ����ͼ�����ţ�");
		String isbn = input.next();
		boolean isInStoreSuccess = bookInfoBiz.inStore(isbn, 12);
		System.out.println("����Ƿ�ɹ���"+isInStoreSuccess);
		BookInfo curBookInfo = bookInfoBiz.findByIsbn(isbn);
		System.out.println("��ǰ��棺"+(curBookInfo.getInStoreCount()+originalNum));
		//�������
		boolean isOutStoreSuccess = bookInfoBiz.outStore(isbn, 8);
		curBookInfo = bookInfoBiz.findByIsbn(isbn);
		System.out.println("����Ƿ�ɹ���"+isOutStoreSuccess);
		System.out.println("��ǰ��棺" + (curBookInfo.getInStoreCount()+originalNum));
	}

	public static void �����û���() {
		User user = new User(new Role("�����ʥ","operator"));
		user.setUserName("�����");
		user.setPassword("jingubang"); // ��������
		Set<User> userSet = new HashSet<>();
		userSet.add(user);
		FileUtil.SaveUser(userSet);
		
		userSet = FileUtil.ReadUser();
		for(User u : userSet) {
			System.out.println("�û�"+user.getUserName()+"��Ȩ�ޣ�"+user.getRole().getPermissions()+"\n"+user.getUserName()+","+user.getRole().getName());
		}
		
		new BookView();
		
	}
}