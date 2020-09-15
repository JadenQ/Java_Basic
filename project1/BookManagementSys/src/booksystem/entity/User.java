package booksystem.entity;

import java.io.Serializable;
import java.util.Date;

import booksystem.auth.Role;

public class User implements Serializable{

	private static final long serialVersionUID = 4346933016132702181L;
	private String userName;
	private String password;
	private Role role; //�û��Ľ�ɫ
	private Date lastedLoginTime; //�ϴε�¼ʱ��
	
	public User() {
		role = new Role(); //ϵͳ����һ��Ĭ�Ͻ�ɫ
	}
	
	public User(Role role) {
		if(null == role) {
			role = new Role();
		}
		setRole(role);
	}
	
	//������
	@Override
	public boolean equals(Object obj) {
		if(null == obj) return false;
		if(!(obj instanceof User)) return false;
		User user = (User)obj; //������Ķ���ǿתΪuser
		return userName.equals(user.getUserName()) && password.equals(user.getPassword());
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public Date getLastedLoginTime() {
		return lastedLoginTime;
	}
	public void setLastedLoginTime(Date lastedLoginTime) {
		this.lastedLoginTime = lastedLoginTime;
	}
	
	
	
}