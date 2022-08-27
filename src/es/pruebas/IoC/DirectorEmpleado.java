package es.pruebas.IoC;

public class DirectorEmpleado implements Empleados {
	
	
	//Creacion de campo tipo creacionInforme (intefaz)

	private CreacionInformes informeNuevo;
	
	
	//Creaci�n de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el directo: "+informeNuevo.getInformes();
	}

}
