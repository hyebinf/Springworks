package com.spring.annotation;

import org.springframework.stereotype.Component;

//@Component("apple")
public class AppleSpeaker implements Speaker{

	
	public AppleSpeaker() {
		System.out.println("==> AppleSpeaker 按眉 积己");
	
	}
	@Override
	public void volumeUp() {
		System.out.println("AppleSpeaker -- 家府棵覆");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("AppleSpeaker -- 家府郴覆");
		
	}

}
