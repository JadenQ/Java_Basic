package booksystem.auth;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import booksystem.biz.BizFactory;
import booksystem.biz.BookInfoBiz;
import booksystem.biz.UserBiz;
import booksystem.biz.implement.BookInfoBizImp1;
import booksystem.entity.BookInfo;
import booksystem.entity.User;
import booksystem.exceptions.NoPermissionException;
import booksystem.util.FileUtil;

/**
 * ��ɫ��
 * @todo TODO
 * @author Jaden
 * @date 2020��3��17��,����8:49:53
 * @copyright Jaden
 */
public class Role implements Serializable{

	private static final long serialVersionUID = -3333276291539854775L;
	
	private String name;  //��ɫ���ƣ���ʾ��ϵͳ�û�����
	private String key;  //��ӦȨ�������ļ��е�Ȩ��key���޸������ļ�Ҳ�����޸��û���Ȩ��
	private List<String> permissions; //Ȩ�޼��ϣ������������ļ�����
	private BookInfoBiz bookInfoBiz;
	private UserBiz userBiz;
	
	
	public Role() {
		setName("Ĭ�Ͻ�ɫ");
		setKey("default");
		createPermissions(key);
		//bookInfoBiz = new BookInfoBizImp1(); //Ӳ����ʵ�֣����Ըĳɹ���ģʽ���������ʵ��
		//����ģʽ�����ϼӹ� ���������ࣨfactory�ࣩһ���ַ���������������ַ���������Ӧ������ʵ��
		//���Է���biz����
		bookInfoBiz = (BookInfoBiz)BizFactory.getBiz("bookInfoBiz");
		userBiz = (UserBiz)BizFactory.getBiz("userbiz");
	}
	
	/**
	 * ����һ��������ɫ���ƺ�Ȩ��key�Ľ�ɫ����
	 * Ȩ��key��Ӧһ���ַ��������ǽ�����ַ����ָ������飬�����ֵ��permission����
	 * @param name
	 * @param key
	 */
	public Role(String name, String key) {
		setName(name);
		setKey(key);
		createPermissions(key);
		bookInfoBiz = (BookInfoBiz)BizFactory.getBiz("bookInfoBiz");
	}

	private void createPermissions(String key) {
		//��ȡ��ɫ��Ȩ�޼��ϣ���������ļ�
		Properties props = new Properties();
		try {
			props.load(Role.class.getResourceAsStream("RolePermissions.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String strPermission = props.getProperty(key); //administrator = bookinfobiz.*,userbiz.*
		if(null == permissions) permissions = new ArrayList<>();
		permissions.clear();
		//ȱ�㣺֮���ܸ��ĳ�����
		//permissions.addAll(Arrays.asList(strPermission.split(",")));
		String[] permissionArray = strPermission.split(",");
		for(String permission : permissionArray) {
			if("".equals(permission)) continue; //ĳ��������֮���ǿ�
			permissions.add(permission.trim());
		}
	}
	

	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public List<String> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<String> permissions) {
		this.permissions = permissions;
	}
	public BookInfoBiz getBookInfoBiz() {
		return bookInfoBiz;
	}
	public void setBookInfoBiz(BookInfoBiz bookInfoBiz) {
		this.bookInfoBiz = bookInfoBiz;
	}
	/**
	 * ��֤��ǰ��ɫ�Ƿ���Ȩ��ִ�д���Ĳ�������ҵ�񷽷������� bookinfobiz.add | bookinfobiz.instore
	 * @param optName
	 * @return
	 */
	private boolean checkPermission(String optName) {
		if(null == permissions || permissions.size() == 0) {
			return false;
		}
		//1.�г���һ����ҵ�񷽷� bookinfobiz.add,bookinfobiz.del...
		//2.��*��д�� bookinfobiz.*
		for(String permission : permissions) {
			if(optName.equals(permission)) return true;
			if(permission.equals("bookinfobiz.*")&& optName.startsWith("bookinfobiz")) {
				return true;
			} 
			if(permission.equalsIgnoreCase("userbiz.*") && optName.startsWith("userbiz")) {
				return true;
			}
		}
		return false;
		
		
	}
	
	/**
	 * �Ƿ��¼/�ȷ��е�¼Ȩ��
	 * @param user
	 * @return
	 */
	public User login(User user) {
		if(checkPermission("userbiz.login")) {
			return userBiz.login(user);
		}
		throw new NoPermissionException(name+"û�е�¼Ȩ��");
		}
	
	//��ɫ����ⷽ�����жϺ����ҵ����
	public boolean inStore(String isbn, int inCount) {
		//��֤��ǰ��ɫ�Ƿ���Ȩ��ִ��������
		if(checkPermission("bookinfobiz.instore")) {
			return bookInfoBiz.inStore(isbn, inCount);   
		}
		else{
			//�������׳��쳣or��ӡ�쳣��Ϣ
			throw new NoPermissionException(name+"û����������Ȩ��");
		}
	}
	
	//����
	public boolean outStore(String isbn, int outCount) {
		//��֤��ǰ��ɫ�Ƿ���Ȩ��ִ��������
		if(checkPermission("bookinfobiz.outstore")) {
			return bookInfoBiz.outStore(isbn, outCount); 
		}
		else{
			//�������׳��쳣or��ӡ�쳣��Ϣ
			throw new NoPermissionException(name+"û�г��������Ȩ��");
		}
	}
	
}