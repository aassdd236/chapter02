package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		Goods camera=new Goods();

		camera.setName("니콘");
		camera.setPrice(400000);
		
		System.out.println(camera.getName());
		System.out.println(camera.getPrice());
		
		camera.showInfo();
		
		//computer
		Goods computer=new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		
		System.out.println(computer.getName());
		System.out.println(computer.getPrice());
		
		computer.showInfo();
	}

}
