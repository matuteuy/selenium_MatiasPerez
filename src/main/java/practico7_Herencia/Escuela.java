package practico7_Herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Escuela {
	
	 public static void main (String args[]){
		 Scanner input = new Scanner(System.in);
		 ArrayList<Persona> listaPersonas = new ArrayList<Persona>();
		 
		 Persona alumno = new Alumno("Juan", 55555555, 5,987654);
		 Persona profe = new Profesor("Alicia", 66666666,"Biologia", 25000);

		 listaPersonas.add(alumno);
		 listaPersonas.add(profe);
		 
		 
	        int opcion = 0;
	        System.out.println("*** BIENVENIDOS AL INSTITUTO ESTUDIAR*****");
	        while (opcion != 5){
	            System.out.println(" 1- Agregar profesor");
	            System.out.println(" 2- Agregar alumno");
	            System.out.println(" 3- Ver alumnos");
	            System.out.println(" 4- Ver profesores");
	            System.out.println(" 5- Salir");
	            System.out.println("##########################");
	            opcion = input.nextInt();

	            if (opcion == 1) {
	                System.out.println("Ingrese el nombre del Profesor: ");
	                String nombre = input.next();
	                
	                System.out.println("Ingrese la Cedula de Identidad del profesor: ");
	                int ci = input.nextInt();
	                
	                System.out.println("Ingrese la edad del profesor. Ingrese 0 si no la sabe: ");
	                int edad = input.nextInt();
	                
	                System.out.println("Ingrese la materia del Profesor: ");
	                String materia = input.next();
	                
	                System.out.println("Ingrese el salario del profesor: ");
	                float salario = input.nextFloat();
	                
	                
	                if (edad==0) {
	                	Persona Profesor1 = new Profesor(nombre, ci,materia, salario);
	                	listaPersonas.add(Profesor1);
	                }else {
						Persona Profesor1 = new Profesor(nombre, ci, edad,materia, salario);
						listaPersonas.add(Profesor1);
	                }	                
	                

	            } else if (opcion == 2) {
	                System.out.println("Ingrese el nombre del Alumno");
	                String nombre = input.next();
	                
	                System.out.println("Ingrese la Cedula de Identidad del alumno: ");
	                int ci = input.nextInt();
	                
	                System.out.println("Ingrese la edad del alumno. Ingrese 0 si no la sabe: ");
	                int edad = input.nextInt();
	                
	                System.out.println("Ingrese Nro. de estudiante: ");
	                int nro = input.nextInt();
	                
	                if (edad==0) {
	                	Alumno Alumno1 = new Alumno(nombre, ci,nro);
						listaPersonas.add(Alumno1);
	                }else {
	                	Persona Alumno1 = new Alumno(nombre, ci, edad,nro);
						listaPersonas.add(Alumno1);
	                }	


	            } else if (opcion == 3) {
	                imprimirAlumnos(listaPersonas);
	                
	            } else if (opcion == 4) {
	                imprimirProfesores(listaPersonas);

	            } else {
	                System.out.println("Saliendo!! Chauuu");
	            }

	            System.out.println("****************");

	        }
	 }

	private static void imprimirAlumnos(ArrayList<Persona> listaPersonas) {
        System.out.println("******* LISTA DE Alumnos *******");
        if (listaPersonas.isEmpty()) {
            System.out.println("No hay Personas en el sistema");
        } else {
            for (Persona unaPers : listaPersonas ){
            	if (unaPers.getClass()==Alumno.class){
					System.out.println(unaPers);
				}

            }
        }
		
	}
	
	private static void imprimirProfesores(ArrayList<Persona> listaPersonas) {
        System.out.println("******* LISTA DE Profesores *******");
        if (listaPersonas.isEmpty()) {
            System.out.println("No hay Peronas en el sistema");
        } else {
            for (Persona unPer : listaPersonas ){
				if (unPer.getClass()==Profesor.class){
					System.out.println(unPer);
				}

            }
        }
		
	}
}
