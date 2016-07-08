package com.service;

import com.dao.UserDAO;
import com.dao.impl.UserDAOImpl;
import com.model.User;

public class UserService {

	/**
	 * @Fields userDao : TODO(����һ��ʵ�������)
	 */
	private UserDAO userDao = new UserDAOImpl();

	public UserDAO getUserDAO() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}



	/** 
	 * addUser:TODO(������һ�仰�����������������)
	 * @author: wangxuan 
	 * @param:  @param user
	 * @return: void
	 * @param user 
	 */  
	public void addUser(User user) {
		this.userDao.save(user);
	}

}
