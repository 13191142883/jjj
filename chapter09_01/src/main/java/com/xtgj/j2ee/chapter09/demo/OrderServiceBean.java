package com.xtgj.j2ee.chapter09.demo;

import com.xtgj.j2ee.chapter09.dao.OrderDaoBean;

public class OrderServiceBean {
	private String name;
	private OrderDaoBean orderDao;

	public OrderDaoBean getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDaoBean orderDao) {
		this.orderDao = orderDao;
	}

	public OrderServiceBean() {
	}

	public OrderServiceBean(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
