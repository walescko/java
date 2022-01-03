package com.company.Manzano_Java.cap06;

import java.util.Scanner;

public class Cap06_Ex03 {

    public static void main(String[] args){

        byte x;
        long R;
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um valor inteiro (de 0 ate 25): ");
        x = scan.nextByte();
        fatorial(x);
    }

    public static void fatorial(byte n){
        long fatorial = 1;
        if (n==0){
            fatorial = 0;
        } else {
            for (int i = 1; i <=n; i++){
                fatorial *= i;
            }
        }
        System.out.println("Fatorial de " + n + " = " + fatorial);
        }
    }



