package com.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")//"tv"���̵�
public class LgTV implements TV{

	
	@Autowired
	//@Qualifier("apple") //������ ���Ե� ��ü�� ���̵� ������ �� �ִ�.
	private Speaker speaker; //Speaker ��ü ����
	
	public LgTV() {
		System.out.println("==> LgTV() ��ü ����");
	}
	
	@Override
	public void powerOn() {
		System.out.println("LGTV--���� �Ҵ�.");
		
	}

	@Override
	public void powerOff() {
		System.out.println("LGTV--���� ����");
		
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
