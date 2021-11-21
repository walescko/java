package com.company.Jandl_Java.Cap03.exercicios.Ex06;

import java.util.Scanner;

public class RaioCircunfenrica {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("Calculo da Circunferencia de um circulo de Raio R");
        System.out.print("Entre com o valor do Raio R do círculo: ");
        Double raio = scan.nextDouble();

        Circulo circulo = new Circulo(raio);
//        circulo.Area(raio);
        circulo.Saida(raio);
        System.out.println("fim");
    }
}
