public class Metodos_arreglos {


    public static void main(String[] args) {
        Integer [] valores = new Integer [15];
        boolean [] ArregloBoolean = new boolean [8];
        Integer [] valores1a100 = new Integer [99];



        ArregloBoolean[0]=true;
        ArregloBoolean[1]=false;
        ArregloBoolean[2]=true;
        ArregloBoolean[3]=false;
        ArregloBoolean[4]=true;
        ArregloBoolean[5]=false;
        ArregloBoolean[6]=true;
        ArregloBoolean[7]=false;



        inicializar(valores);
        imprimirArregloEnteros(valores);
        System.out.println("-----------------");
        imprimirArregloBoolean(ArregloBoolean);
        System.out.println("-----------------");
        inicializar(valores1a100);
        //imprimirArregloEnteros(valores1a100);
        System.out.println("-----------------");
        System.out.println("Suma: "+ suma(valores1a100));
        System.out.println("Promedio: "+ promedio(valores1a100));


    }

    public static int promedio(Integer[] valores) {
        return suma(valores) / valores.length;

    }

    public static int suma(Integer[] valores) {

        int sum=0;

        for (int i = 0; i < valores.length; i++) {
            sum=sum+valores[i];
        }
        return sum;
    }

    public static void inicializar(Integer[] valores1a100) {
        int num=1;

        for (int i = 0; i < valores1a100.length; i++) {
            valores1a100[i]=num;
            num++;
        }

    }

    public static void imprimirArregloBoolean(boolean[] arregloBoolean) {
        System.out.println("Imprimir Arreglo Boolean: ");
        for (int i = 0; i < arregloBoolean.length; i++) {
            System.out.println("Posicion " + i + " es: " + arregloBoolean[i]);
        }

    }

    public static void imprimirArregloEnteros (Integer[] arregloEnteros) {
        System.out.println("Imprimir Arreglo Enteros: ");

        for (int i = 0; i < arregloEnteros.length; i++) {
            System.out.println("Posicion " + i + " es: " + arregloEnteros[i]);
        }
    }




}
//Crear un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtener la suma de todos ellos y el promedio.
