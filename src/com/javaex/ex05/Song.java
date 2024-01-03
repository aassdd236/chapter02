package com.javaex.ex05;

public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
		
	public String getTitle() {
		return this.title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return this.artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return this.album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return this.composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return this.year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return this.track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	
	public void showInfo(){
		System.out.println(artist+", "+title+" ("+album+", "+year+", "+track+"번 track, "+composer+" 작곡)");
	}

}
