package com.company.Jandl_Java.Cap02;

/*Esse código tem um pequeno bug, que no final ele não apresenta a condição
min e max iguais em todos os casos.
Esse código se encontra no livro:
JAVA - Guia do Programador
Peter Jandl Junior - 4ª Edição - 2021
página 63
*/
import java.util.Scanner;

public class P0212DoWhile {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite o valor inteiro inferior: ");
		int min = s.nextInt();
		
		System.out.print("Digite o valor interior superior: ");
		int max = s.nextInt();
		
		do {
			System.out.println(min + " < " + max);
			min++; max--;//aqui que deve estar o bug do programa.
		} while (max >= min);
	
		System.out.println(min + " == " + max + " Condição Final!");
	}
}
