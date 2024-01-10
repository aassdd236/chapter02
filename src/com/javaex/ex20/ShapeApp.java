package com.javaex.ex20;

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
		
		//사각형의 가로값 가져요기
		System.out.println(((Ractangle) sArray[0]).getWidth());
		
		//원의 반지름
		System.out.println(((Circle)sArray[2]).getRadius());
		
		//전체 면적 구하기
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area());
		}
	}

}
