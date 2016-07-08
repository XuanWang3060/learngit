package com.test;

import com.model.User;
import com.service.UserService;

public class UserTest {
	public static void main(String[] args) {
		System.out.println("the test class is start!");
		User u = new User();
		u.setUserName("xuanwangm");
		u.setPassWord("11111");
		
		UserService us = new UserService();
		us.addUser(u);
		System.out.println("the test class is end!");
	}

}
