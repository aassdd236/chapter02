package com.javaex.ex08;

public class SongApp {

	public static void main(String[] args) {
		Song s0=new Song("좋은날", "아이유", "Real", "이민수", 2010);
		s0.setTrack(3);
		System.out.println(s0.toString());
		
		
		Song s1=new Song("거짓말", "빅뱅", "Always", "G-DRAGON", 2007, 2);
		System.out.println(s1.toString());

	}

}
