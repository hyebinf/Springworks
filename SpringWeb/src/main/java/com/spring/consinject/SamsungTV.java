package com.spring.consinject;


public class SamsungTV implements TV{

	private SonySpeaker speaker; //참조 객체 변수
	
	//생성자 인젝션
	public SamsungTV() {
		System.out.println("==> SamsungTV(1) 객체 생성");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("SamsungTV(2) 객체 생성");
		this.speaker =speaker;
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV--전원 켠다");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV--전원 끈다");
	}

	@Override
	public void volumUp() {
		speaker.volumUp();
	}

	@Override
	public void volumDown() {
		speaker.volumDown();
	}

}
