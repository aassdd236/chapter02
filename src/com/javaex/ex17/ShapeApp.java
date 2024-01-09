package com.javaex.ex17;

public class ShapeApp {

	public static void main(String[] args) {
		
		Ractangle[] rArray=new Ractangle[3];
		
		Ractangle r01=new Ractangle( 5, 10, "파랑", "빨강");
		Ractangle r02=new Ractangle( 10, 10, "노랑", "노랑");
		Ractangle r03=new Ractangle( 20, 20, "빨강", "빨강");
		
		rArray[0]=r01;
		rArray[1]=r02;
		rArray[2]=r03;
		
		Triangle[] tArray=new Triangle[3];
		
		Triangle t01=new Triangle(5, 10, "빨강", "검정");
		Triangle t02=new Triangle(30, 30, "노랑", "파랑");
		Triangle t03=new Triangle(25, 20, "초록", "검정");
		
		tArray[0]=t01;
		tArray[1]=t02;
		tArray[2]=t03;
		
		Circle[] cArray=new Circle[3];
		
		Circle c01=new Circle(5, "파랑", "검정");
		Circle c02=new Circle(10, "검정", "빨강");
		Circle c03=new Circle(20, "노랑", "초록");
		
		cArray[0]=c01;
		cArray[1]=c02;
		cArray[2]=c03;
		
		
		for(int i=0; i<rArray.length; i++) {
			rArray[i].draw();
			tArray[i].draw();
			cArray[i].draw();
		}
	}

}
