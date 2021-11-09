import java.io.*;
import java.util.Scanner;

class parimpar{
	public static void main(String args[]){
		int numero;
		int resto;
		Scanner s = new Scanner(System.in);

		System.out.println("WADAJU SOFTWARE SOLUTIONS");
		System.out.println("Par ou Impar?");
		System.out.print("Digite um número inteiro: ");
		numero = s.nextInt();

		resto = numero % 2;

		if (resto == 0) {
			System.out.println("O número "+numero+" é par.");
		} else {
			System.out.println("O número "+numero+" é impar.");
		}

		System.out.println();
		System.out.println("Fim");
	}
}
