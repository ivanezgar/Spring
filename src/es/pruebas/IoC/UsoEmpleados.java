package es.pruebas.IoC;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Creacion de objetos de tipo Empleado
		
			Empleados Empleado1 = new DirectorEmpleado();
		
		//Uso de los objetos creados
			
			System.out.println(Empleado1.getTareas());
			
			System.out.println("LACACA");
	}

}
