package com.javaex.ex23;

import java.io.IOException;

public class MyFile {

	//필드
	
	//생성자 기본생성자
	
	//메소드 gs
	
	//메소드 일반
	/*public String read(String path) {
		
		String result="학교종이 땡땡땡 어서 모이자";
		   //path에 있는 파일을 읽음(가정)
		
		//파일이 없는 상황 발생
		try{
			throw new IOException();
		}catch(IOException e){
			System.out.println("경로에 파일이 없습니다");
		}
		return result;
	}*/
	//파일이 없는 경우
	public String read(String path) throws IOException {
		String result="학교종이 땡땡땡 어서 모이자";
		throw new IOException();
	}
}
