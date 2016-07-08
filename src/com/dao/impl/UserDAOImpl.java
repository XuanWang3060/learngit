package com.dao.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dao.UserDAO;
import com.model.User;

public class UserDAOImpl implements UserDAO{
	
	private static Logger logger = LoggerFactory.getLogger("R");

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub\
		logger.error("the error input");
		logger.warn("the warn input");
		logger.info("the info input");
		logger.debug("the debug input");
		System.out.println("user saved!");
		logger.error("the error end");
		logger.warn("the warn end");
		logger.info("the info end");
		logger.debug("the debug end");
		
	}

}
