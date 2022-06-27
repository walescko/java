package com.company.Calculadora.Calculator;
import java.math.*;
import java.util.Scanner;

public class dadosEquacoes {

    private static double a;
    private static double b;
    private static double c;
    private static double delta;
    private static double x1;
    private static double x2;
    static Scanner scan = new Scanner(System.in);

    public static void Linear() {
        System.out.println("Coefiente Linear: ");
        a = scan.nextDouble();
        System.out.println("Termo independente: ");
        b = scan.nextDouble();

    }

    public static void EquacaoLinear() {
        x1 = b/a;
        System.out.println("A soluçãoda equação " + a +"x + " + b + " é x = " + x1);
    }


    public static void Quadratica() {
        System.out.println("Coefiente Quadrático: ");
        a = scan.nextDouble();
        System.out.println("Coefiente Linear: ");
        b = scan.nextDouble();
        System.out.println("Termo independente: ");
        c = scan.nextDouble();
    }

    public static void EquacaoQuadratica() {
        System.out.println("Tem nada aqui");
    }
}
