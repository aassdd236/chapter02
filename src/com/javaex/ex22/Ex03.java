package com.javaex.ex22;

public class Ex03 {

	public static void main(String[] args) {
		Point p01=new Point(2, 3);
		p01.draw();
		
		Point p02;

		try {
			p02=null;
			p02.draw();
		} catch (NullPointerException e) {
			System.out.println("주소값이 없음");
		}
		System.out.println("종료");
	}
}
