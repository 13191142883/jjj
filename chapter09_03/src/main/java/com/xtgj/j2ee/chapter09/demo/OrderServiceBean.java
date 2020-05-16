package com.xtgj.j2ee.chapter09.demo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.xtgj.j2ee.chapter09.dao.OrderDaoBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderServiceBean {

	@Autowired        //注解用于字段上
	private static OrderDaoBean orderDao;
	public void  setOrderDao(OrderDaoBean orderDaoBean){
		this.orderDao = orderDaoBean;
	}
	ApplicationContext context = null;
	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMethod3() {
		OrderDaoBean orderServiceBean = (OrderDaoBean) context.getBean("orderService");
		OrderServiceBean.orderDao.tesstAutowired("no auto");
	}
}

/*public class OrderServiceBean {
@Autowired             //注解用于属性的setter方法上
public void setOrderDao(OrderDaoBean orderDao) {
		this.orderDao = orderDao;
	}
}*/
