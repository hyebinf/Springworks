package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")//"tv"아이디
public class LgTV implements TV{

	
	@Autowired
	//@Qualifier("apple") //의존성 주입될 객체의 아이디나 지정할 수 있다.
	private Speaker speaker; //Speaker 객체 선언
	
	public LgTV() {
		System.out.println("==> LgTV() 객체 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("LGTV--전원 켠다.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LGTV--전원 끈다");
		
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
