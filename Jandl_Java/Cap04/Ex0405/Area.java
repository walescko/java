package com.company.Jandl_Java.Cap04.Ex0405;

import java.util.Scanner;

public class Area {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com um valor: ");
        double lado = scan.nextDouble();
        Quadrado quadrado = new Quadrado();
        quadrado.setLado(lado);
        System.out.println(quadrado.area());

    }
}
