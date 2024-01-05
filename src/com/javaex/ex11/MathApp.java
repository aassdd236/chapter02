package com.javaex.ex11;

public class MathApp {

	public static void main(String[] args) {
		
		//
		Math math=new Math();
		
		System.out.println(math.iPlus(2, 3));
		System.out.println(math.iPlus(100, 300));
		System.out.println(math.diPlus(2.2, 5));
		System.out.println(math.idPlus(5, 2.2));
		System.out.println(math.ddplus(2.2, 5.5));
		
		System.out.println(math.plus("안녕하세요", 3));
	}

}
