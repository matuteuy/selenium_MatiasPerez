package practico7_Herencia;

public class Alumno extends Persona {
	 private int nroEstudiante;
	 private String grupo;
	 private boolean tienePrevia;
	 
	 
	 
	 
	 
	public Alumno(String nombre, int ci, int edad, int nroEstudiante) {
		super(nombre, ci, edad);
		this.nroEstudiante = nroEstudiante;
		this.grupo = "1A";
		this.tienePrevia = false;
	}
	 
	public Alumno(String nombre, int ci, int nroEstudiante) {
		super(nombre, ci);
		this.nroEstudiante = nroEstudiante;
		this.grupo = "1A";
		this.tienePrevia = false;
	}
	
	
	public int getNroEstudiante() {
		return nroEstudiante;
	}
	public void setNroEstudiante(int nroEstudiante) {
		this.nroEstudiante = nroEstudiante;
	}
	public String getGrupo() {
		return grupo;
	}
	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	public boolean isTienePrevia() {
		return tienePrevia;
	}
	public void setTienePrevia(boolean tienePrevia) {
		this.tienePrevia = tienePrevia;
	}
	
	public String toString() {
		return super.toString() + ", Nro. Estudiante: " + nroEstudiante + ", Grupo: " + grupo + "," + " Previa: "+TienePrevia();
	}
	
	public String TienePrevia() {
		if (this.tienePrevia==false) {
			return "NO";
		}else {
			return "SI";
		}
	}
	 
}
