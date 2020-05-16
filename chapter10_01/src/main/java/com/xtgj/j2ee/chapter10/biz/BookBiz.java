package com.xtgj.j2ee.chapter10.biz;

/**
 * 在线图书销售系统业务逻辑接口
 * 
 * @author讯腾国际
 */
public interface BookBiz {
	public boolean buy(String userName, String bookName, double price);

	public void comment(String userName, String comments);
}

