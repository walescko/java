package com.company.Jandl_Java.Cap03.exercicios.Ex0405;

import java.util.Scanner;

public class AreaConstructor {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com um valor: ");
        double lado = scan.nextDouble();
        QuadradoConstructor quadrado = new QuadradoConstructor(lado);
        quadrado.setLado(lado);
        System.out.println(quadrado.area());

    }
}
