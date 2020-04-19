package com.xtgj.j2ee.chapter05.entity;

import javax.persistence.Persistence;
import java.util.HashSet;
import java.util.Set;

public class TblQx implements java.io.Serializable {
	private int qxid = 0;
	private String qx = "";
	private Set jds = new HashSet();

	public Set getJds() {
		return jds;
	}

	public void setJds(Set jds) {
		this.jds = jds;
	}

	public String getQx() {
		return qx;
	}

	public void setQx(String qx) {
		this.qx = qx;
	}

	public int getQxid() {
		return qxid;
	}

	public void setQxid(int qxid) {
		this.qxid = qxid;
	}
}
