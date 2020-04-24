package com.xtgj.j2ee.chapter06.hql;

import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

import com.xtgj.j2ee.chapter06.basedao.BaseHibernateDAO;
import com.xtgj.j2ee.chapter06.entity.Fwxx;



public class HQLTest extends BaseHibernateDAO {
	public static void main(String[] args) {

		//new HQLTest().testPropertyQuery();
		new HQLTest().testLikeQuery();
	}

	public void testPropertyQuery(){
		Session session = this.getSession();
		String hql = "select fw.date, fw.title from Fwxx fw";
		Query query = session.createQuery(hql);
		List list = query.list();
		Iterator it = list.iterator();
		while(it.hasNext()){
			Object[] arr = (Object[])it.next();
			System.out.println(arr[0] + "\t" + arr[1]);
		}
}
	public void testLikeQuery(){
		Session session = this.getSession();
		String hql = "from Fwxx fw where fw.title like '%gbf%'";
		Query query = session.createQuery(hql);
		List list = query.list();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Fwxx item = (Fwxx) it.next();
			System.out.println(item.getLxr() + "\t[" + item.getDate() + "]\t"
					+ item.getTitle() + "(" + item.getZj() + ")");
		}
}


	private void printFwxxList(List list) {
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Fwxx item = (Fwxx) it.next();
			System.out.println(item.getLxr() + "\t[" + item.getDate() + "]\t"
					+ item.getTitle() + "(" + item.getZj() + ")");
		}
	}
}


