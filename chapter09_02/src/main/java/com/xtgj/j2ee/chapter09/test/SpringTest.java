package com.xtgj.j2ee.chapter09.test;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

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
	public void testMethod3() {
		OrderServiceBean bean = (OrderServiceBean) context
				.getBean("orderService");
		List<String> list = bean.getLists();
		for(String tmp : list){
			System.out.print(tmp+"\t");
		}
		System.out.println("\n--------------------------");
		
		Set<String> set = bean.getSets();
		for(String tmp : set){
			System.out.print(tmp+"\t");
		}
		System.out.println("\n--------------------------");
				
		Map<String, String> map = bean.getMaps();
		for(String key : map.keySet()){
			System.out.print(key+"\t"+map.get(key)+"\n");
		}
		System.out.println("\n--------------------------");
		
		Properties prop = bean.getProperties();
		for(Object key : prop.keySet()){
			System.out.print(key+"\t"+prop.get(key)+"\n");
		}
		System.out.println("\n--------------------------");
	}

}
