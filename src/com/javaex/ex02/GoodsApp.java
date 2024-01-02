package com.javaex.ex02;

public class GoodsApp {

	public static void main(String[] args) {
		
		Goods camera=new Goods();
		camera.name="니콘";
		camera.price=400000;
		
		Goods computer=new Goods();
		computer.name="LG그램";
		computer.price=900000;
		
		Goods cup=new Goods();
		cup.name="머그컵";
		cup.price=2000;
		
		System.out.println(camera.name+" "+camera.price);
		System.out.println(computer.name+" "+computer.price);
		System.out.println(cup.name+" "+cup.price);

	}

}
