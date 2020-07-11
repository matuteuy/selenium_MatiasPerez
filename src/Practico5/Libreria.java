package Practico5;

import java.util.Scanner;

public class Libreria {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Libro libro1 = new Libro();
        System.out.println(libro1);
        System.out.println("--------------------");


        System.out.println("Ingrese ISBN: ");
        int isbn = input.nextInt();

        System.out.println("Ingrese Titulo del libro: ");
        String titulo = input.nextLine();


        System.out.println("Ingrese Nro. de Páginas: ");
        int nroPaginas = input.nextInt();


        System.out.println("Ingrese Autor: ");
        String autor = input.nextLine();



        Libro libro2 = new Libro();


        System.out.println("Ingrese ISBN: ");
        isbn = input.nextInt();
        System.out.println("Ingrese Título: ");
        titulo = input.nextLine();
        System.out.println("Ingrese Autor: ");
        autor = input.nextLine();
        System.out.println("Ingrese Nro. de Páginas: ");
        nroPaginas = input.nextInt();

        Libro libro3 = new Libro();


        System.out.println(libro2);
        System.out.println(libro3);

    }
}