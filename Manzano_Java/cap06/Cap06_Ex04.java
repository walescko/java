package com.company.Manzano_Java.cap06;

import java.util.Scanner;

public class Cap06_Ex04 {

    public static void main(String[] args){

        byte x;
        long R;
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um valor inteiro (de 0 ate 25): ");
        x = scan.nextByte();
        R = fatorial(x);
        System.out.println("Fatorial de " + x + " = " + R);
    }

    public static long fatorial(byte n){
        long fatorial = 1;
        if (n==0){
            fatorial = 0;
        } else {
            for (int i = 1; i <=n; i++){
                fatorial *= i;
            }
        }
        return(fatorial);
    }
}
