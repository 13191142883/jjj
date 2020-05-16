package com.xtgj.j2ee.chapter10.log;

import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.springframework.aop.MethodBeforeAdvice;

public class LogAdvice implements MethodBeforeAdvice {
	private static DateFormat sdf = new SimpleDateFormat(
			"yyyy年MM月dd日 hh时mm分ss秒");

	public void before(Method m, Object[] args, Object target) throws Throwable {
		System.out.println("\n[系统日志][" + sdf.format(new Date()) + "]"
				+ m.getName() + "(" + Arrays.toString(args) + ")");
	}
}
