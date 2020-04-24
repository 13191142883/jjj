package com.xtgj.j2ee.chapter05.dao;

import com.xtgj.j2ee.chapter05.basedao.BaseHibernateDAO;
import com.xtgj.j2ee.chapter05.entity.TblJd;
import com.xtgj.j2ee.chapter05.entity.TblQx;

public class ManyToOneTest extends BaseHibernateDAO {
	public static void main(String[] args) {
		new ManyToOneTest().testManyToOne();
	}

	public void testManyToOne() {
		TblJd JD = (TblJd) super.get(TblJd.class, 1);
		String qxname = JD.getQx().getQx();
		System.out.println(qxname + "," + JD.getJd());
	}
}
