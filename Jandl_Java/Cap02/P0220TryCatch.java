package com.company.Jandl_Java.Cap02;

public class P0220TryCatch {

	public static void main(String[] args) {
		
		try {
			int j = Integer.parseInt(args[0]);
			while ( j >= 0 ) {
				System.out.println(j);
				j--;
			}
		} catch (Exception e) {
			System.out.println("Argumento não foi dado ou não é um inteiro.");
		}
	}
}
