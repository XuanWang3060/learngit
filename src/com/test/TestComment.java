/**
 * @Copyright:   Copyright(c) 2016 ISoftstone  Co. Ltd. All Rights Reserved.
 * @Description: TODO(��һ�仰�������ļ���ʲô)
 * @Version:     1.0
 *
 * @author:      xczhanga
 * @Date:        2016��7��5��
 *
 * @Modification History:
 *	[Editor] [date] [remark]
 *
 * @Review History:
 *	[Reviewer] [date] [remark]
 *
 */
package com.test;


/**
 * @author: xczhanga
 * @date:   2016��7��5��
 */
public abstract class TestComment {
	/** 
	 * main:TODO(������һ�仰�����������������)
	 * @author: xczhanga 
	 * @param:  @param args
	 * @return: void
	 * @param args 
	 */  
	public static void main(String[] args) {
		
		System.out.println("test rollback!");
		System.out.println("test commit change choose!");
		int number = 23871;
		int reverse = 0;
		do{
			int lastDigit = number % 10;
			reverse = (reverse * 10) + lastDigit;
			number = number / 10;
		}while(number > 0);
		System.out.println("That number reverse is: " + reverse);
		System.out.println("�������뷨�ĺ�ѡ�������");
		
	}
	
	

}
