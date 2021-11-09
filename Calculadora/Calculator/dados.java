package com.company;
import java.util.Scanner;

public class dados {

    Scanner scan = new Scanner(System.in);

    protected double number1;
    protected double number2;
    protected double resultado;

    //metodo de entrada
     public void dadosenter(){
         System.out.print("Entre com um número: ");
         number1 = scan.nextDouble();
         System.out.print("Entre com outro número: ");
         number2 = scan.nextDouble();

     }
     public void dadosexit(){
         System.out.println("O resultado da operação é: " + resultado);
     }

     //operaçoes
     protected double adicao(){
        resultado = number1 + number2;
        return resultado;
     }

     protected double subtracao(){
         resultado = number1 - number2;
         return resultado;

     }

     protected double multiplicacao(){
         resultado = number1 * number2;
         return resultado;

     }

     protected void divisao() {
         //teste de denominador
         if (number2 == 0) {
             System.out.println("ERROR: Divisão por zero!");
         } else {
             resultado = number1 / number2;
             dadosexit();
         }
     }

     protected void restodivisao(){
         if (number2 == 0) {
             System.out.println("ERROR: Divisão por zero!");
         } else {
             resultado = number1 % number2;
             dadosexit();
         }



}}
