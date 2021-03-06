package booksystem.entity;

import java.io.Serializable;
import java.util.Date;

import booksystem.auth.Role;

public class User implements Serializable{

	private static final long serialVersionUID = 4346933016132702181L;
	private String userName;
	private String password;
	private Role role; //用户的角色
	private Date lastedLoginTime; //上次登录时间
	
	public User() {
		role = new Role(); //系统分配一个默认角色
	}
	
	public User(Role role) {
		if(null == role) {
			role = new Role();
		}
		setRole(role);
	}
	
	//对象流
	@Override
	public boolean equals(Object obj) {
		if(null == obj) return false;
		if(!(obj instanceof User)) return false;
		User user = (User)obj; //将输入的对象强转为user
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
