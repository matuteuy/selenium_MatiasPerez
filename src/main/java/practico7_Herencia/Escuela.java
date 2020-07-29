package practico7_Herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Escuela {
	
	 public static void main (String args[]){
		 Scanner input = new Scanner(System.in);
		 ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
		 ArrayList<Alumno> listaAlumno = new ArrayList<Alumno>();
		 
		 Alumno Alumno = new Alumno("Juan", 55555555, 5,987654);
		 Profesor Profesor = new Profesor("Alicia", 66666666,"Biologia", 25000);
		 listaAlumno.add(Alumno);
		 listaProfesores.add(Profesor);
		 
		 
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
	                	Profesor Profesor1 = new Profesor(nombre, ci,materia, salario);
	                	listaProfesores.add(Profesor1);
	                }else {
	                	Profesor Profesor1 = new Profesor(nombre, ci, edad,materia, salario);
	                	listaProfesores.add(Profesor1);
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
	                	listaAlumno.add(Alumno1);
	                }else {
	                	Alumno Alumno1 = new Alumno(nombre, ci, edad,nro);
	                	listaAlumno.add(Alumno1);
	                }	


	            } else if (opcion == 3) {
	                imprimirAlumnos(listaAlumno);
	                
	            } else if (opcion == 4) {
	                imprimirProfesores(listaProfesores);

	            } else {
	                System.out.println("Saliendo!! Chauuu");
	            }

	            System.out.println("****************");

	        }
	 }

	private static void imprimirAlumnos(ArrayList<Alumno> listaAlumno) {
        System.out.println("******* LISTA DE Alumnos *******");
        if (listaAlumno.isEmpty()) {
            System.out.println("No hay alumnos en el sistema");
        } else {
            for (Alumno unAlumno : listaAlumno ){
                System.out.println(unAlumno);
            }
        }
		
	}
	
	private static void imprimirProfesores(ArrayList<Profesor> listaProfesor) {
        System.out.println("******* LISTA DE Profesores *******");
        if (listaProfesor.isEmpty()) {
            System.out.println("No hay profesores en el sistema");
        } else {
            for (Profesor unProfe : listaProfesor ){
                System.out.println(unProfe);
            }
        }
		
	}
}
