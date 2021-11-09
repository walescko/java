import java.io.*;
import java.util.Scanner;

class somaparas0a50for {
	public static void main(String args[]){
		int i,resto;
		int soma;

		System.out.println("WADAJU SOFTWARE SOLUTIONS");
		System.out.println("Soma dos pares até 50");

		soma = 0;

		for (i = 1 ; i <=50 ; i++) {
			resto = i % 2;
			if (resto == 0){
				soma = soma + i;
			}
		}
		System.out.println();
		System.out.println(soma);
		System.out.println();
		System.out.println("Fim");
	}
}
