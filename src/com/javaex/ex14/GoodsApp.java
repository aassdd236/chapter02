package com.javaex.ex14;

public class GoodsApp {

	public static void main(String[] args) {

		Goods[] goodsArray=new Goods[3];

		Goods camera=new Goods("니콘", 400000);
		Goods computer=new Goods("LG그램", 900000);
		Goods cup=new Goods("머그컵", 2000);

		goodsArray[0]=camera;
		goodsArray[1]=computer;
		goodsArray[2]=cup;

		System.out.println(camera.getName());
		System.out.println(goodsArray[0].getName());
		System.out.println(cup.toString());

		int sum=0;
		for(int i=0; i<goodsArray.length; i++) {
			if(goodsArray != null) {
				goodsArray[i].showInfo();
				sum=sum+1;
			}
		}
	}
}
