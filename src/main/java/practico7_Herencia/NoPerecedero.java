package practico7_Herencia;

public class NoPerecedero extends Producto{
	 private String tipo;
	 

	public NoPerecedero(String nombre, float precio, String tipo) {
			super(nombre, precio);
			this.tipo = tipo;
	}
	 
	public String toString() {
			return super.toString() + ", Tipo=" + tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public float Calcular(int cantidad) {
		return cantidad * this.getPrecio();
	}

}
