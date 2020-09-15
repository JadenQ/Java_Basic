package booksystem.biz;

import booksystem.entity.User;

public interface UserBiz extends Biz<User>{
	public User login(User user);
}
