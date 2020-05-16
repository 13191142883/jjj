package com.xtgj.j2ee.chapter10.biz.impl;

import com.xtgj.j2ee.chapter10.biz.BookBiz;

public class BookBizImpl implements BookBiz {
	/**
	 * 购买图书
	 */
	public boolean buy(String userName, String bookName, double price) {
		System.out.println("业务方法buy开始执行");
		System.out.println("." + userName + "购买图书：" + bookName);
		System.out.println("." + userName + "增加积分：" + (int) (price / 10));
		System.out.println("." + "向物流系统下发货单");
		System.out.println("业务方法buy结束");
		return true;
	}

	/**
	 * 发表书评
	 */
	public void comment(String userName, String comments) {
		System.out.println("业务方法comment开始执行");
		System.out.println("." + userName + "发表书评" + comments);
		System.out.println("业务方法comment结束");
	}
}
