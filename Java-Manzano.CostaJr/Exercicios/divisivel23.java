import java.io.*;
import java.util.Scanner;

class divisivel23{
	public static void main(String args[]){

		int numero;
		int resto2, resto3;
		Scanner s = new Scanner(System.in);

		System.out.println("WADAJU SOFTWARE SOLUTIONS");
		System.out.println("Divisibilidade por 2 e 3 ao mesmo tempo");
		System.out.print("Entre com um valor inteiro: ");
		numero = s.nextInt();

		resto2 = numero %2;
		resto3 = numero %3;

		if ((resto2 == 0) && (resto3 ==0)){
			System.out.println("O numero "+numero+" é divisivel por 2 e 3");
		} else {
			System.out.println("O número "+numero+" não é divisivel por 2 e 3");
		}

		System.out.println();
		System.out.println("Terminou o programa");
	}
}
