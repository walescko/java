package com.company;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {

            menu menu = new menu();
            byte resp;

            do {
                menu.menuCalculadora();
                System.out.print("Para continuar digite '0': ");
                resp = scan.nextByte();
            } while (resp == 0);
        }
    }
}
