import java.util.ArrayList;

public class EjerciciosListas {


    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<Integer>();
        ArrayList<String> listaNombres = new ArrayList<String>();

        listaNombres.add("Andres"); //pos0
        listaNombres.add("Maria"); // pos1
        listaNombres.add("Jose"); //pos2

        listaNumeros.add(2);
        listaNumeros.add(4);
        listaNumeros.add(10);
        imprimirListaEnteros(listaNumeros);
        imprimirLista(listaNombres);

    }

    public static void imprimirListaEnteros(ArrayList<Integer> listaEnteros) {
        System.out.println("Voy a imprimir los elementos de la lista: ");
        for (int i = 0; i < listaEnteros.size(); i++) {
            System.out.println(listaEnteros.get(i));
        }
    }

    public static void imprimirLista(ArrayList<String> listaStrings) {
        System.out.println("Voy a imprimir los elementos de la lista: ");
        for (int i = 0; i < listaStrings.size(); i++) {
            System.out.println(listaStrings.get(i));
        }
    }
    public static int cantidadElementos (ArrayList<Integer> listaEnteros) {
        return listaEnteros.size();
    }

    //Método que reciba una lista de enteros, y retorne la verdadero si y sólo si la lista está vacía.
    public static boolean esListaEnterosVacia (ArrayList<Integer> listaEnteros) {

        if (listaEnteros.isEmpty() == true) {
            return true;
        } else {
            return false;
        }
    }

    //Método que reciba una lista de enteros, y retorne la suma.
    public static int obtenerSumaTotal (ArrayList<Integer> listaEnteros) {
        int suma = 0;

        for (int i = 0; i < listaEnteros.size(); i++) {
            suma = suma + listaEnteros.get(i);
        }

        return suma;
    }


    //Método que reciba una lista de enteros, y retorne el promedio de los mismos.
    public static float calcularPromedio(ArrayList<Integer> listaNumeros) {
        int sumaTotal = obtenerSumaTotal(listaNumeros);
        float promedio = sumaTotal / listaNumeros.size();
        return promedio;
        //return obtenerSumaTotal(listaNumeros) / listaNumeros.size();
    }

    //Método que reciba una lista de enteros, y retorne el menor.
    // 4 5 1
    public static int obtenerMenor (ArrayList<Integer> listaNumeros) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < listaNumeros.size(); i++) {
            if (listaNumeros.get(i) < min) {
                min = listaNumeros.get(i);
            }
        }

        return min;
    }
}
//Crear un método imprimirListaEnteros que reciba una lista de enteros, y los imprima en pantalla.
