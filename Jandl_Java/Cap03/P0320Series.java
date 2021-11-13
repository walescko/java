package com.company.Jandl_Java.Cap03;

import java.util.Scanner;

public class P0320Series {
    public static void main(String[] a){
        System.out.print("Digite um número elementos para sequência: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        System.out.printf("Qual a razão da PA e PG? ");
        int razao = scan.nextInt();
        for (int n = 0 ; n < number ; n++){
            System.out.printf("Fibo: %6d Arit: %6d Geom: %6d\n",
                    P0318Fibonacci.fibonacci(n),
                    P0319Progressao.aritmetica(0, razao, n),
                    P0319Progressao.geometrica(1, razao, n));
        }
    }
}
