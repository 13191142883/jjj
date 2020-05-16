package com.xtgj.j2ee.chapter09.demo;

import com.xtgj.j2ee.chapter09.dao.OrderDaoBean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OrderTest {
    @Autowired
    private OrderDaoBean orderDao;

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
        OrderTest orderTest = (OrderTest) context.getBean("OderText");
        orderTest.orderDao.tesstAutowired("no auto");
    }
}
