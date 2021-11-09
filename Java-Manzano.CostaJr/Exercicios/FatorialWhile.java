import java.util.Scanner;
import java.io.*;

class FatorialWhile{
	public static void main(String args[]){
		long fat = 1;
		int n, i;
		Scanner s = new Scanner(System.in);

		System.out.println();
		System.out.println("FATORIAL DE UM NÚMERO");
		System.out.print("Entre com um valor inteiro: ");
		n = s.nextInt();

		i = 1;

		while (i <= n){
			fat = fat *i;
			i = i + 1;
		}
		System.out.println("Fatorial de "+n+"! = "+fat);
	}
}
