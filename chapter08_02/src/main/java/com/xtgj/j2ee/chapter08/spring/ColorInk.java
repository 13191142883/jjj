package com.xtgj.j2ee.chapter08.spring;

import java.awt.Color;

/**
 * 彩色墨盒
 * 
 * @author迅腾国际
 */
public class ColorInk implements Ink {
	/*
	 * (非 Javadoc)
	 * 
	 * @see com.aptech.jb.ink.Ink#getColor(int, int, int)
	 */
	public String getColor(int r, int g, int b) {
		Color color = new Color(r, g, b);
		return "#" + Integer.toHexString(color.getRGB()).substring(2);
	}
}

