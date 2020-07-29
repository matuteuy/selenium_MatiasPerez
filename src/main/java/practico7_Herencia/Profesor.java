package practico7_Herencia;

public class Profesor extends Persona{
    private String materia;
    private float salario;
    
    


	public Profesor(String nombre, int ci, int edad, String materia, float salario) {
		super(nombre, ci, edad);
		this.materia = materia;
		this.salario = salario;
	}
	
	public Profesor(String nombre, int ci, String materia, float salario) {
		super(nombre, ci);
		this.materia = materia;
		this.salario = salario;
	}



	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return super.toString() + ", Materia: " + materia + ", salario: " + salario + "]";
	}
	
	
}
