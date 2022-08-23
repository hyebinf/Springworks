package com.spring.product;

public class TVUser {

	public static void main(String[] args) {
		/*SamsungTV tv = new SamsungTV();
		tv.powerOn();
		tv.VolumeUp();
		tv.powerOff();
		tv.VolumeDown();*/
		
		LgTV tv = new LgTV(); //SamsungTV()로 교체
		tv.powerOn();
		tv.VolumeUp();
		tv.powerOff();
		tv.VolumeDown();
		
		/*
		 * 인스페이스형 객체(인스턴스)로 생성해서 묵시적 형변환(자동형변환)을
		 * 이용하여 객체르 참조하면 쉽게 교체 가능
		 */
		

	}

}
