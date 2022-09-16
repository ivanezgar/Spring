package es.pruebas.IoC;

public class DirectorEmpleado implements Empleados {
	
	
	//Creacion de campo tipo creacionInforme (intefaz)

	private CreacionInformes informeNuevo;
	
	private String email;
	
	private String nombreEmpresa;
	
	//metodo init. Ejecutar tareas antes de que el bean esté disponible
	
	public void metodoInicial() {
		
		System.out.println("Dentro del metodo init. Aqui irian las tareas a ejecutar antes de que el bean este listo");
		
		
	}
	
	// metodo destroy .Ejecutar tareas despues de que el bean haya sido utilizado
	public void metodoFinal() {
		
		System.out.println("Dentro del metodo destroy. Aqui irian las tareas a ejecutar despues de que el bean sea usado");
		
		
	}
	//Creaci�n de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informeNuevo) {
		
		this.informeNuevo = informeNuevo;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
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
