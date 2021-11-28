package com.company.Jandl_Java.Cap04;

import java.util.Scanner;

public class P0405UsaConversores {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double tempC = sc.nextDouble();
        sc.close();

        P0403CelsiusKelvin ck = new P0403CelsiusKelvin();
        System.out.println("ck: "+ck);
        double tempK = ck.converter(tempC);
        System.out.println("tempK = " + tempK +"K.");

        P0404KelvinCelsius kc = new P0404KelvinCelsius();
        System.out.println("kc: "+kc);
        tempC = kc.converter(tempK);
        System.out.println("tempC = " + tempC +"C.");

    }
}

