package com.company.Jandl_Java.Cap03;

import java.util.Scanner;

public class P0303UsaHora {
    public static void main(String[] arg){

        P0302Hora hora = new P0302Hora();
        hora.setHorario(15,30,10);
        System.out.println("Hora: " + hora.toString());

        Scanner sc = new Scanner(System.in);

        System.out.print("Horas? ");
        int h = sc.nextInt();
        System.out.print("Minutos? ");
        int m = sc.nextInt();
        System.out.print("Segundos? ");
        int s = sc.nextInt();
        sc.close();

        hora.setHorario(h, m , s);
        System.out.println("Hora: " + hora.toString());

        if (hora.getHoras() >= 18 || hora.getHoras() < 6){
            System.out.println("Is the Night");
        } else {
            System.out.println("Is the day");
        }
    }
}
