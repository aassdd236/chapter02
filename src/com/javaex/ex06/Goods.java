package com.javaex.ex06;

public class Goods {

	private String name;
	private int price;
	
	//생성자
	public Goods() {
		//메모리에 올리는 일(클래스를 인스턴스화), 생략 가능
		System.out.println("Goods()");
	}
	public Goods(String name) {
		this.name = name;
		System.out.println("Goods(name)");
	}
	public Goods(String name, int price) {
		this(name); //기존 생성자 중에 호출(많은 생성자에 하나만 추가하고 싶을 때 사용)
		this.price=price;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}
	
	
}
