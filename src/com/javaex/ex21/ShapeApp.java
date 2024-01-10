package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {
		
		//Ractangle r01=new Ractangle("빨강", "검정", 20, 20);
		
		/*Shape[] sArray=new Shape[3];
		
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
		*/
		//Drawable 배열 만들기
		Drawable[] dArray=new Drawable[4];
		
		//그릴 수 있는 것, 사각형
		Drawable d01=new Ractangle("빨강", "빨강", 100, 20);
		d01.draw();
		
		//점
		Drawable d02=new Point(2,3);
		d02.draw();
		
		//원
		Drawable d03=new Circle(10, "빨강", "파랑");
		d03.draw();
		
		//삼각형
		Drawable d04=new Triangle(10, 50, "빨강", "검정");
		d04.draw();
		
		dArray[0]=d01; //사각형
		dArray[1]=d02; //점
		dArray[2]=d03; //원
		dArray[3]=d04; //삼각형
		
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		//사각형의 가로
		System.out.println((((Ractangle) dArray[0]).getWidth()));
		
		//원의 넓이
		System.out.println(((Circle)dArray[2]).area());
		System.out.println(((Shape)dArray[2]).area());
		
		//점의 y값
		System.out.println(((Point)dArray[1]).getY());
		
		//전체에서 도형의 넓이를 출력
		for(int i=0; i<dArray.length; i++) {
			if(dArray[i] instanceof Shape) {
			//현재 배열의 방(주소)를 따라가면
			System.out.println(((Shape)dArray[i]).area());
			}
		}
	}
}
