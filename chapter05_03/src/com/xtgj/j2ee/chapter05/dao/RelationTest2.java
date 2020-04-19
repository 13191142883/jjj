package com.xtgj.j2ee.chapter05.dao;

import com.xtgj.j2ee.chapter05.basedao.BaseHibernateDAO;
import com.xtgj.j2ee.chapter05.entity.TblQx;

public class RelationTest2 extends BaseHibernateDAO {
	//在One一方添加数据
public void testAddOne() {
	TblQx qx = new TblQx();
		qx.setQx("山南区");
		super.add(qx);
	}

	public static void main(String[] args) {
		new RelationTest2().testAddOne();
	}
}

