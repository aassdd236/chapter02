package com.javaex.ex07;

public class PointApp {

	public static void main(String[] args) {
		Point p0=new Point();
		p0.setX(30);
		p0.setY(20);
		System.out.println(p0.toString());
		
		Point p1=new Point(2);
		p1.setY(3);
		System.out.println(p1.toString());

		Point p2=new Point(100, 100);
		System.out.println(p2.toString());
		
		p1.draw(true);
		p2.draw(false);
		System.out.println(p2.getX());

	}

}
