package com.spring.consinject;


public class SamsungTV implements TV{

	private SonySpeaker speaker; //���� ��ü ����
	
	//������ ������
	public SamsungTV() {
		System.out.println("==> SamsungTV(1) ��ü ����");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("SamsungTV(2) ��ü ����");
		this.speaker =speaker;
	}

	@Override
	public void powerOn() {
		System.out.println("SamsungTV--���� �Ҵ�");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SamsungTV--���� ����");
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
