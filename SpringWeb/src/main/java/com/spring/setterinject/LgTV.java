package com.spring.setterinject;

public class LgTV implements TV{

	//������ ������
	private Speaker speaker; //�������̽��� ���� ��ü ����
	private int price;
	
	public LgTV() {
		System.out.println("==> LgTV() ��ü ����");
	}
	
	//setter ������
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
		System.out.println("==> setSpeaker()ȣ��");
	}
	
	public void setPrice(int price){		
		System.out.println("==> setPrice() ȣ��");
		this.price = price; //�ʱ�ȭ ����
	}
	@Override
	public void powerOn() {
		System.out.println("LGTV--���� �Ҵ�.(����:"+price+")");
		
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
