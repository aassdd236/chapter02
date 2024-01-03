package com.javaex.ex03;

public class Goods {

	//필드
	private String name;
	private int price;
	
	//생성자
	//메소드
	public void setName(String name) {
		this.name=name;
	}
	public void setPrice(int price) {
		this.price=price;
	}
	public String getName() {
		return this.name;
	}
	public int getPrice() {
		return this.price;
	}
	public void showInfo(){
		System.out.println("========================");
		System.out.println("상품명: "+this.name+", 가격: "+this.price);
		System.out.println("========================");
	}
}
