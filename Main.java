package com.bootcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int resultado=0;
        int a, b;
        Scanner leer=new Scanner(System.in);
        System.out.println("Introduzca numero a:");
        a=leer.nextInt();

        System.out.println("Introduzca numero b:");
        b=leer.nextInt();

        resultado = suma(a, b);
        System.out.println(resultado);
    }
    public static int suma(int a, int b){
        System.out.println("EL resultado de la suma es: ");
        return  a + b;
    }
}