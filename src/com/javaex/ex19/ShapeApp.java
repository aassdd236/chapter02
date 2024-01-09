package com.javaex.ex19;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Ractangle r01=new Ractangle("빨강", "검정", 20, 20);
		
		Shape[] sArray=new Shape[3];
		
		Shape s01=new Ractangle("빨강", "검정", 20, 20);
		Shape s02=new Triangle(10, 15, "노랑", "파랑");
		Shape s03=new Circle(10, "검정", "노랑");

		sArray[0]=s01;
		sArray[1]=s02;
		sArray[2]=s03;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw();
		}
	}

}
