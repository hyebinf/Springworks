package com.spring.annotation;


public class SamsungTV implements TV{
	
	//������ ������
	private Speaker speaker; //�������̽��� ���� ��ü ����
	private int price; //
	
	public SamsungTV() {
		System.out.println("==> SamsumgTV() ��ü ����");
	}
	
	//setter ������
	public void setSpeaker(Speaker speaker) {
		this.speaker = speaker;
		System.out.println("==> setSpeaker()ȣ��");
	}
	
	public void setPrice(int price) {
			System.out.println("==> setPrice() ȣ��");
			this.price = price; //�ʱ�ȭ ����
	}
	
	@Override
	public void powerOn() {
		System.out.println("SamsungTV--���� �Ҵ�.(����:"+price+")");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV--���� ����");
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
