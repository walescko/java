import java.io.*;
import java.util.Scanner;

class quadrado15a200do{
	public static void main(String args[]){

		double quadrado;
		int i;

		System.out.println("WADAJU SOFTWARE SOLUTIONS");
		System.out.println("Quadrados de 15 a 200");

		i = 15;

		do {
			quadrado = i*i;
			System.out.println(quadrado);
			i = i + 1;
		} while (i <= 200);

		System.out.println();
		System.out.println("Fim");
	}
}
