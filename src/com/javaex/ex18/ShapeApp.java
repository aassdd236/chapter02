package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {
		
		//shape만(부모)
		Shape s01=new Shape();
		s01.setFillColor("노랑");
		s01.setLineColor("검정");
		
		System.out.println(s01.toString());
		
		//사각형(자식)
		Ractangle r01=new Ractangle();
		r01.setWidth(3);
		r01.setHeight(30);
		r01.setFillColor("빨강");
		r01.setLineColor("검정");
				
		System.out.println(r01.toString());
		
		Ractangle r02=new Ractangle("파랑", "검정", 40, 40);
		System.out.println(r02.toString());
			
	}

}
