package com.company.Jandl_Java.Cap02;

public class P0219TestArg {

	public static void main(String[] args) {

		if (args.length > 0) {
			int j = Integer.parseInt(args[0]);
			while (j >= 0) {
				System.out.println(j);
				j--;
			}
		} else {
			System.out.println("Falta um argumento inteiro");
		}
	}
}
