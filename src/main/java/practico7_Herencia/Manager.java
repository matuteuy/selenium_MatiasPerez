package practico7_Herencia;

public class Manager extends Empleado{
	  private String area;

	  
	public Manager(String unNombre, int unTelefono, float unSueldo, String area) {
		super(unNombre, unTelefono, unSueldo);
		this.area = area;
	}
	
	
	
	
    public String getArea(){
        return this.area;
    }

    public void setArea(String unarea){
        this.area = unarea;
    }
    
    public String toString(){

        return super.toString() + " Su lenguaje es " + this.getArea();

    }


}
