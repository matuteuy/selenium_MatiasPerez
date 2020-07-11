package Practico5;

import java.util.Scanner;

public class GestionarProductos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        String nombre = "Producto 1";
        int codigo = 1;
        boolean importado = true;
        String lote = "1A2B";
        Producto p1 = new Producto(nombre,codigo,importado,lote);

        nombre = "Producto 2";
        codigo = 2;
        importado = false;
        lote = "2C4D";
        Producto p2 = new Producto(nombre,codigo,importado,lote);

        Producto p3 = new Producto();



        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());


    }
}
