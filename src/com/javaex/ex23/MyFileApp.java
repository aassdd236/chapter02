package com.javaex.ex23;

public class MyFileApp {

	public static void main(String[] args) {

		MyFile mf=new MyFile();

		/* 정상일 때
		String str=mf.read("c:/aaa.txt");
		System.out.println(str);
		 */

		/* 예외 처리가 잘 되었으나 처리방식이 ㄴ
		String str=mf.read("c:/bbb.txt");
		System.out.println(str);
		 */
		
		try {
			mf.read("c:/bbb.txt");
		} catch (Exception e) {
			System.out.println("cannot found");
		}

	}

}
