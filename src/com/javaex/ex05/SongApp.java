package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		Song s=new Song();
		s.setArtist("아이유");
		s.setTitle("좋은날");
		s.setAlbum("Real");
		s.setYear(2010);
		s.setTrack(3);
		s.setComposer("이민수");
		
		s.showInfo();
		
		Song o=new Song();
		o.setArtist("BIGBANG");
		o.setTitle("거짓말");
		o.setAlbum("Always");
		o.setYear(2007);
		o.setTrack(2);
		o.setComposer("G-DRAGON");
		
		o.showInfo();

		Song n=new Song();
		n.setArtist("버스커버스커");
		n.setTitle("벚꽃엔딩");
		n.setAlbum("버스커버스커1집");
		n.setYear(2012);
		n.setTrack(4);
		n.setComposer("장범준");
		
		n.showInfo();
	}

}
