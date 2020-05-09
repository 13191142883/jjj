package com.xtgj.j2ee.chapter09.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xtgj.j2ee.chapter09.demo.OrderServiceBean;

public class SpringTest {

	ApplicationContext context = null;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMethod1() {
		OrderServiceBean bean = (OrderServiceBean) context
				.getBean("orderService");
		System.out.println(bean.getName());
	}
	@Test
	public void testMethod2() {
		OrderServiceBean bean = (OrderServiceBean) context.getBean("orderService");
		bean.getOrderDao().save();
	}

}
