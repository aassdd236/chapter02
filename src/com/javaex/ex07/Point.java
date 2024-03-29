package com.javaex.ex07;

public class Point {
	//필드
	private int x;
	private int y;

	//생성자
	public Point() {

	}
	public Point(int x) {
		this.x=x;
		System.out.println(x);
	}
	public Point(int x, int y) {
		this(x);
		this.y=y;
	}

	//메소드
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	public void draw() {
		System.out.println( "점 [x=" + x + ", y=" + y + "]를 그렸습니다");
	}

	public void draw(boolean action) {
		if(action ==true) {
			System.out.println( "점 [x=" + x + ", y=" + y + "]를 그렸습니다");
		}else {
			System.out.println("점 [x=" + x + ", y=" + y + "]를 지웠습니다");
		}
	}



}
