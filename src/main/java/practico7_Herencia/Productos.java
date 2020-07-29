package practico7_Herencia;

public class Productos {
    private String nombre;
    private float precio;
    
    

	public String toString() {
		return "Nombre= " + nombre + ", precio=" + precio;
	}

	public Productos(String nombre, float precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	
	public float Calcular(int cantidad) {
		return cantidad * this.precio;
	}
}
