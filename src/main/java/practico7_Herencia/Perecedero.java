package practico7_Herencia;

public class Perecedero extends Productos{
	private int caducidad;


	public String toString() {
		return super.toString() + ", Caducidad=" + caducidad;
	}

	public Perecedero(String nombre, float precio, int caducidad) {
		super(nombre, precio);
		this.caducidad = caducidad;
	}

	public int getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(int caducidad) {
		this.caducidad = caducidad;
	}
	
	public float Calcular(int cantidad) {
		float precioTotal;
		
		precioTotal= cantidad * this.getPrecio();
		
		if (this.getCaducidad()==1) {
			return precioTotal/4;
		}else if (this.getCaducidad()==2){
			return precioTotal/3;
		}else if (this.getCaducidad()==3){
			return precioTotal/2;
		}
		return precioTotal;
	
	}
}
