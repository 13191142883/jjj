/**
 * 灰色墨盒
 * 
 * @author迅腾国际
 */
package com.xtgj.j2ee.chapter08.spring;

import java.awt.Color;

class GreyInk implements Ink {
	public String getColor(int r, int g, int b) {
		int c = (r + g + b) / 3;
		Color color = new Color(c, c, c);
		return "#" + Integer.toHexString(color.getRGB()).substring(2);
	}
}

