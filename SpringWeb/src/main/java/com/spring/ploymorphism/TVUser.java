package com.spring.ploymorphism;

public class TVUser {
	public static void main(String[] args) {
	
		
		TV tv = new LgTV(); 
		tv.powerOn();
		tv.powerOff();
		tv.volumDown();
		tv.volumUp();
}
}
