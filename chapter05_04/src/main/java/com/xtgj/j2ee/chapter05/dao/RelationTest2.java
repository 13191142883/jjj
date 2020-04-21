package com.xtgj.j2ee.chapter05.dao;

import com.xtgj.j2ee.chapter05.basedao.BaseHibernateDAO;
import com.xtgj.j2ee.chapter05.entity.TblJd;
import com.xtgj.j2ee.chapter05.entity.TblQx;

public class RelationTest2 extends BaseHibernateDAO {
	//在Many一方添加数据
	public void testAddMany(){
		TblQx qx = (TblQx)super.get(TblQx.class, 1999);
		TblJd jd1 = new TblJd();
			jd1.setJd("heping");
			jd1.setQx( qx);
			super.add(jd1);
			
			TblJd jd2 = new TblJd();
			jd2.setJd("bayi");
			jd2.setQx(qx);
			super.add(jd2);
			
			TblJd jd3 = new TblJd();
			jd3.setJd("wusi");
			jd3.setQx(qx);
			super.add(jd3);
	}
	

	public static void main(String[] args) {
		new RelationTest2().testAddMany();
	}
}

