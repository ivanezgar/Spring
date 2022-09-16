package es.pruebas.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		
		//obtencion del bean
		Empleados Juan=contexto.getBean("miEmpleado",Empleados.class);
		
		System.out.println(Juan.getInforme());
		//cerrar el contexto
		
		contexto.close();
	}
	
}
