package es.pruebas.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//Creacion de objetos de tipo Empleado
		
			Empleados Empleado1 = new DirectorEmpleado();
		
		//Uso de los objetos creados
			
			System.out.println(Empleado1.getTareas());*/
		
		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Empleados Juan= contexto.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Juan.getTareas());
		
		contexto.close();
	}

}
