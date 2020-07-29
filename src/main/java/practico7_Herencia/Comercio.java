package practico7_Herencia;

public class Comercio {
	   public  static void main (String[] args){
	        
	       Productos ListaProductos[]=new Productos[3];
	       
	       ListaProductos[0]=new Productos("producto1", 20);
	       ListaProductos[1]=new Perecedero("producto2",20,1);
	       ListaProductos[2]=new NoPerecedero("producto 3",200,"comestible");
	       
	     
	       
	       double suma=0;
	       for(int i=0;i<ListaProductos.length;i++){
	           suma=suma+ListaProductos[i].Calcular(5);
	       }
	        System.out.println("El precio total de productos es: "+suma);
	      
	      
	    }
}
