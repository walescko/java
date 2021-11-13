package com.company.Jandl_Java.Cap03;
//import JandlJrCap03.P0319Progressao;
//import JandlJrCap03.P0318Fibonacci;

public class P0330Series {
    public static void main(String[] a){
        for (int n = 0 ; n < 10 ; n++){
            System.out.printf("Fibo: %6d Arit: %6d Geom: %6d\n",
                    P0318Fibonacci.fibonacci(n),
                    P0319Progressao.aritmetica(0, 2, n),
                    P0319Progressao.geometrica(1, 3, n));
        }
    }
}
