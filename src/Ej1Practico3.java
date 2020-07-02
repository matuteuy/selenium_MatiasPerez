import java.util.Scanner;
public class Ej1Practico3 {
    public static void main(String[] args) {
        Scanner input =new Scanner (System.in);
        boolean result=false;

        System.out.println("Ingrese número: ");
        int numero = input.nextInt();

        System.out.println("Ingrese minimo: ");
        int minimo = input.nextInt();

        System.out.println("Ingrese máximo: ");
        int maximo = input.nextInt();


        result= dentroMaximoYMinimo(numero,minimo,maximo);

        if (result==true) {
            System.out.println("El numero es valido");
        }else {
            System.out.println("El numero esta fuera de rango.");
        }


    }

    public static boolean dentroMaximoYMinimo (int numero, int min, int max) {


        if (numero >= min && numero <=max) {
            return true;
        }else {
            return false;
        }
    }
}
