package practico7_Herencia;

public class Persona {
    private String nombre;
    private int ci;
    private int edad;
    
    
    
    
    
	public Persona(String nombre, int ci, int edad) {
		super();
		this.nombre = nombre;
		this.ci = ci;
		this.edad = edad;
	}	
	
	public Persona(String nombre, int ci) {
		super();
		this.nombre = nombre;
		this.ci = ci;
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Nombre: " + nombre + ", ci=" + ci + ", edad=" + edad ;
	}
	
}
