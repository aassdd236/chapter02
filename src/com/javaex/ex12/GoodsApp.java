package com.javaex.ex12;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera=new Goods("니콘", 400000);
		System.out.println(camera.toString());

		Goods computer=new Goods();
		computer.setName("LG 그램");
		computer.setPrice(900000);
		System.out.println(computer.toString());
		
		Goods cup=new Goods("머그컵", 20000);
		System.out.println(cup.toString());
		
		System.out.println(cup.getCount());
		System.out.println(computer.getCount());
		
		//System.out.println(camera.count);
		System.out.println(Goods.count); //전역변수
	}

}
