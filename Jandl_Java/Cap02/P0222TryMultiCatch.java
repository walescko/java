package com.company.Jandl_Java.Cap02;

public class P0222TryMultiCatch {
	public static void main(String[] args) {
	
		try {
			int j = Integer.parseInt(args[0]);
			while (j >= 0) {
				System.out.println(j);
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("Argumento não fornecido ou inválido.");
		}
	}
}