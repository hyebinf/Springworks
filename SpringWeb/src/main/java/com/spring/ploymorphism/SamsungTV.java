package com.spring.ploymorphism;

public class SamsungTV implements TV{

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
		System.out.println("SamsungTV-- �Ҹ� �ø���");
	}

	@Override
	public void volumDown() {
		System.out.println("SamsungTV-- �Ҹ� ������");
	}

}
