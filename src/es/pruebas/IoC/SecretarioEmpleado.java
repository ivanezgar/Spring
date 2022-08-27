package es.pruebas.IoC;

public class SecretarioEmpleado implements Empleados {

	
	private CreacionInformes informeNuevo;
	
	private String email;
	
	private String nombreEmpresa;
	
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		
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
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario: "+informeNuevo.getInformes();
	}

}
