package com.spring.annotation;

import org.springframework.stereotype.Component;

//@Component("sony")
public class SonySpeaker implements Speaker{

	
	public SonySpeaker() {
		System.out.println("==> SonySpeaker 按眉积己");
	}
	@Override
	public void volumeUp() {
		System.out.println("SonySpeaker -- 家府 棵覆");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("SonySpeaker -- 家府 郴覆");
		
	}

}
