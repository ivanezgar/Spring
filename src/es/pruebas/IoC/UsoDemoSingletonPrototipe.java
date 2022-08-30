package es.pruebas.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototipe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//carga de XML de configuracion
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext2.xml");

		SecretarioEmpleado Juan= contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		SecretarioEmpleado Juan2= contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		
		System.out.println(Juan);
		System.out.println(Juan2);
	}

}
