import java.io.*;
import java.util.Scanner;

class somaparas0a50do{
	public static void main(String args[]){
		int i,resto;
		int soma;

		System.out.println("WADAJU SOFTWARE SOLUTIONS");
		System.out.println("Soma dos pares até 50");

		i = 0;
		soma = 0;
		
		do {
			resto = i % 2;
			if (resto == 0){
				soma = soma + i;
			}
			i = i + 1;
		} while (i <=50);

		System.out.println();
		System.out.println(soma);
		System.out.println();
		System.out.println("Fim");
	}
}
