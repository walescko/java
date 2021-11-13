package com.company.Jandl_Java.Cap02;

import java.util.Scanner;

public class P0204EntradaSaida {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		
		System.out.println("Olá!");
		
		System.out.print("Digite um inteiro: ");
		int valor = s.nextInt();
		
		System.out.println("Valor = "+ valor);
		s.close();
	}
}
