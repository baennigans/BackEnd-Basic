package aop.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * SPRING AOP Ư¡
 * 1. Runtime ���
 * 2. Proxy ���
 * 3. interface ���
 */


public class EmpMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("aop-xml.xml");
	
		Programmer programmer = context.getBean("programmer",Programmer.class);
		programmer.work();
	}
}