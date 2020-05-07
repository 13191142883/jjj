/**
 * 打印机程序
 * 
 * @author迅腾国际
 */
package com.xtgj.j2ee.chapter08.spring;
class Printer {
	public Ink ink = null;
	

	public Paper paper = null;
	public Ink getInk() {
		return ink;
	}

	public Paper getPaper() {
		return paper;
	}
	public void setInk(Ink ink) {
		this.ink = ink;
	}

	public void setPaper(Paper paper) {
		this.paper = paper;
	}

	public void print(String str) {
		// 输出颜色标记
		System.out.println("使用" + ink.getColor(255, 200, 0) + "颜色打印:\n");
		// 逐字符输出到纸张
		for (int i = 0; i < str.length(); ++i) {
			paper.putInChar(str.charAt(i));
		}
		// 将纸张的内容输出
		System.out.print(paper.getContent());
	}
}

