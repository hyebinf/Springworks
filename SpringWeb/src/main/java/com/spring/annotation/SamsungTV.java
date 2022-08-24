package com.spring.annotation;


public class SamsungTV implements TV{
	
	//생성자 인젝션
	private Speaker speaker; //인터페이스형 참조 객체 변수
	private int price; //
	
	public SamsungTV() {
		System.out.println("==> SamsumgTV() 객체 생성");
	}
	
	//setter 인젝션
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
		System.out.println("==> setSpeaker()호출");
	}
	
	public void setPrice(int price) {
			System.out.println("==> setPrice() 호출");
			this.price = price; //초기화 설정
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV--전원 켠다.(가격:"+price+")");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV--전원 끈다");
	}

	@Override
	public void volumUp() {
		speaker.volumeUp();
	}

	@Override
	public void volumDown() {
		speaker.volumeDown();
	}

}
