package com.javaex.ex16;

public class ColorPoint extends Point {

	//필드
	private String color;

	//생성자
	
	public ColorPoint(String color) {
		super();
		this.color = color;
	}
	
	public ColorPoint() {
		super();
		System.out.println("ColorPoint()");
	}

	public ColorPoint(int x, int y, String color) {
		super();
		super.setX(x);
		super.setY(y);
		this.color = color;
		System.out.println("ColorPoint(3)");
	}
	
	//메소드
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColorPoint [color=" + color + "]";
	}
	
	public void print() {
		System.out.println("점 x = "+super.x+" 점 y = "+super.getY()+" 색깔: "+color);
	}
}
