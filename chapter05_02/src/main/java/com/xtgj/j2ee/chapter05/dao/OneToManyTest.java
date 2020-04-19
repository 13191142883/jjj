package com.xtgj.j2ee.chapter05.dao;

import java.util.Iterator;
import com.xtgj.j2ee.chapter05.basedao.BaseHibernateDAO;
import com.xtgj.j2ee.chapter05.entity.TblJd;
import com.xtgj.j2ee.chapter05.entity.TblQx;


public class OneToManyTest extends BaseHibernateDAO {
	public static void main(String[] args) {
		new OneToManyTest().testOneToMany();
	}

	public void testOneToMany() {
		TblQx QX = (TblQx) super.get(TblQx.class, 1);
		// 输出
		System.out.println("区县"+QX.getQx()+"的街道：");// 输出区县名
		Iterator it = QX.getJds().iterator();// 迭代输出区县下属的街道
		while (it.hasNext()) {
			TblJd jd = (TblJd) it.next();
			System.out.print(jd.getJd() + ",");
		}
	}
}

