package com.company.Jandl_Java.Cap02;

import java.util.Scanner;

public class P0211While {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Qual o valor inical? ");
		int j = s.nextInt();
		
		while (j>=0) {
			System.out.println(j);
			j--;
			
		}
	}
}
