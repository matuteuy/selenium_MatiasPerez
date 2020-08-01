package Practico5;

import java.util.Scanner;

public class Automotora {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);


        Camion c1 = new Camion();
        c1.setChapa(44444);
        c1.setColor("Negro");
        c1.setanioCompra(1995);

        System.out.println(c1);

        System.out.println("Ingrese el color del camion");
        String colorCamion = input.nextLine();

        System.out.println("Ingrese la chapa del camion");
        int chapaCamion = input.nextInt();

        System.out.println("Ingrese el año de compra");
        int anio = input.nextInt();


        Camion c2 = new Camion(chapaCamion, colorCamion,anio);
        System.out.println(c2);

        boolean sonIguales = c1.tieneMismoColor(c2);

        if (sonIguales == true) {
            System.out.println("Los camiones tienen el mismo color");
        } else {
            System.out.println("Los camiones NO tienen el mismo color");
        }
    }
}
