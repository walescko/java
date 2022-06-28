package com.company.Calculadora.Calculator;

import java.text.DecimalFormat;
import java.util.Scanner;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class dadosEquacoes {

    private static double a;
    private static double b;
    private static double c;
    private static double delta;
    private static double x1;
    private static double x2;
    static Scanner scan = new Scanner(System.in);
    static DecimalFormat df = new DecimalFormat("00.00");

    public static void Linear() {
        System.out.println("Coefiente Linear: ");
        a = scan.nextDouble();
        System.out.println("Termo independente: ");
        b = scan.nextDouble();

    }

    public static void EquacaoLinear() {
        x1 = b/a;
        System.out.println("A soluçãoda equação " + a +"x + " + b + " é x = " + df.format(x1));
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
        delta = pow(b,2) - 4 * a * c;
        if ((a == 0) || (delta < 0 )){
            System.out.println("Não tem raízes reais!");
        } else {
            if (delta == 0 ){
                x1 = -b/(2*a);
                System.out.println("A equação tem duas raízes reais idênticas X1 = X2 = "+df.format(x1));
            } else {
                x1 = (-b + sqrt(delta))/(2*a);
                x2 = (-b - sqrt(delta))/(2*a);
                System.out.println("A equação tem duas raízes reais distintas X1 = "+df.format(x1)+" e X2 = "+df.format(x2));
            }
        }
        // vértice da parábola
        double xv, yv;
        xv = (-b)/(2*a);
        yv = -delta/(4*a);
        System.out.println("O vértice da parabóla é Xv = "+df.format(xv)+ " e Yv = "+df.format(yv));

    }
}
