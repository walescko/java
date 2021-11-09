import java.io.*;
import java.util.Scanner;

class troca {
	
	public static void main(String args[]){

	int a,b,c;
	
	Scanner s = new Scanner(System.in);

	System.out.println("WADAJU SOFTWARE SOLUTIONS");
	System.out.println("Troca de posição");
	System.out.print("Entre com o valor inteiro para A: ");
	a = s.nextInt();
	System.out.print("Entre com o valor inteiro para B: ");
	b = s.nextInt();
	
	c = a;
	a = b;
	b = c;

	System.out.println("A = " + a);
	System.out.println("B = " + b);
	System.out.println("Fim do Programa");


	}
}
