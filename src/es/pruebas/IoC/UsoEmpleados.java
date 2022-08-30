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
		
		/*DirectorEmpleado Juan= contexto.getBean("miEmpleado", DirectorEmpleado.class);
		
		System.out.println(Juan.getTareas());
		
		System.out.println(Juan.getInforme());
		
		System.out.println(Juan.getEmail());
		
		System.out.println(Juan.getNombreEmpresa());*/
		
		
	SecretarioEmpleado Maria= contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		SecretarioEmpleado Pablo= contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(Maria.getTareas());
		
		System.out.println(Maria.getInforme());
		
		System.out.println("Email: "+Maria.getEmail());
		
		System.out.println("Empresa: "+Maria.getNombreEmpresa());
		
		System.out.println("Email Pablo: "+Pablo.getEmail());
		
		Maria.setNombreEmpresa("Caca");
		
		System.out.println("Empresa Pablo: "+Pablo.getNombreEmpresa());
		
		contexto.close();
	}

}
