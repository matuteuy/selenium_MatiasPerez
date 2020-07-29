package practico7_Herencia;

import java.util.ArrayList;

public class MiEmpresa {
	
	 public static void main (String args[]){
		 ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
			
			
		    Empleado t1 = new Tester("Matias", 12341234, 10000, true, true);
		    Empleado t2 = new Developer("Ana",44444,12222,"Java");
		    Empleado t3 = new Developer("Jose",55555,13222,"Phyton");    
		    Empleado t4 = new Manager("Carlos",66666,24222,"Desarrollo");
		    
		    listaEmpleados.add(t1);
		    listaEmpleados.add(t2);
		    listaEmpleados.add(t3);
		    listaEmpleados.add(t4);
		    

		    System.out.println("******* LISTA DE EMPLEADOS *******");
		       if (listaEmpleados.isEmpty()) {
		           System.out.println("No hay empleados en el sistema");
		       } else {
		            for (Empleado unEmpleadoDelSistema : listaEmpleados ){
		                System.out.println(unEmpleadoDelSistema);
		            }
		        }

		    
	 }


}
