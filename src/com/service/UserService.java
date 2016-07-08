package com.service;

import com.dao.UserDAO;
import com.dao.impl.UserDAOImpl;
import com.model.User;

public class UserService {

	/**
	 * @Fields userDao : TODO(定义一个实现类变量)
	 */
	private UserDAO userDao = new UserDAOImpl();

	public UserDAO getUserDAO() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}



	/** 
	 * addUser:TODO(这里用一句话描述这个方法的作用)
	 * @author: wangxuan 
	 * @param:  @param user
	 * @return: void
	 * @param user 
	 */  
	public void addUser(User user) {
		this.userDao.save(user);
	}

}
