package com.javaex.ex09;

public class TV {
	//필드
	private int channel;
	private int volume;
	private boolean power;
	
	//생성자
	public TV(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	public TV() {
		
	}
	
	//메소드
	public int getChannel() {
		return channel;
	}
	public int getVolume() {
		return volume;
	}
	public boolean isPower() {
		return power;
	}
	public void power(boolean on) {
		if(on==true) {
			power=true;
		}else {
			power=false;
		}	
	}
	public void channel(int channel) {
		if(channel>255) {
			this.channel=255;
		}else if(channel<1) {
			this.channel=1;
		}else {
			this.channel=channel;
		}
	}
	public void channel(boolean up) {
		if(up==true) {
			channel+=1;
		}else {
			channel-=1;
		}
	}
	public void volume(int volume) {
		if(volume>100) {
			this.volume=100;
		}else if(volume<0) {
			this.volume=0;
		}else {
			this.volume=volume;
		}
	}
	public void volume(boolean up) {
		if(up==true) {
			volume+=1;
		}else {
			volume-=1;
		}
	}
	public void status(){
		System.out.println("파워:"+power+" 채널: "+channel+" 볼륨: "+volume);
	}
}
