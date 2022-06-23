package com.kh.practice.pointv2.controller;

import com.kh.practice.pointv2.model.vo.Rectangle;

public class RectangleController {
	
	private Rectangle r = new Rectangle();
	
	public String calcArea(int x, int y, int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		int area = r.getWidth() * r.getHeight();
		return r.toString() + " / 면적 : " + area;
	}
	
	public String calcPerimeter(int x, int y, int width, int height) {
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		int perimeter = 2 * (r.getWidth() + r.getHeight());
		return r.toString() + " / 둘레 : " + perimeter;
	}

}
