package com.xtgj.j2ee.chapter10;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xtgj.j2ee.chapter10.biz.BookBiz;

public class AOPTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");
		BookBiz bookBiz = (BookBiz) context.getBean("bookBizTarget");
		bookBiz.buy("高志水", "CMMi实务手册", 50);
		bookBiz.comment("王筝", "《盗墓笔记》一点都不恐怖，很好看！");
	}
}
