package booksystem.biz.implement;

import java.util.Map;
import java.util.Set;

import booksystem.biz.UserBiz;
import booksystem.entity.User;
import booksystem.util.FileUtil;

public class UserBizImp1 implements UserBiz{

	@Override
	public boolean add(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean del(User t) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User update(User t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByID(String ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, User> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	/**
	 * ���ص�¼�ɹ��Ķ���
	 */
	public User login(User user) {
		Set<User> userSet = FileUtil.ReadUser();
		if(null == userSet || userSet.size() == 0) return null;
		for(User temp : userSet) {
			if(temp.equals(user)) {
				return temp; //ȡ��User����
			}
		}
		
		return null; //
	}
	
}