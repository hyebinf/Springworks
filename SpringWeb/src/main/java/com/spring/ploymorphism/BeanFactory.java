package com.spring.ploymorphism;

public class BeanFactory {

	public Object getBean(String beanName) {
		if(beanName.equals("samsung")) {
			return new SamsungTV();
		}else if(beanName.equals("lg")) {
			return new LgTV();
		}
		return null;
		
		/*getBean() 메서드는 매개변수로 받음 beanName에 해당하는
		 * 객체를 생성하여 리턴한다.
		 */

	}

}
