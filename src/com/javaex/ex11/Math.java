package com.javaex.ex11;

public class Math {
	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
	public int iPlus(int a, int b) {
		int sum = a+b;
		return sum;
	}
	public double diPlus(double a, int b) {
		double sum = a+b;
		return sum;
	}
	public double idPlus(int a, double b) {
		double sum = a+b;
		return sum;
	}
	public double ddplus(double a, double b) {
		double sum = a+b;
		return sum;
	}
	public String plus(String a, double b) {
		String sum=a;
		for(int i=1; i<b; i++) {
			sum = sum + b;
		}
		return sum;
		
	}
}
