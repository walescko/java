import java.io.*;
import java.util.Scanner;

	class Cap03_Ex02 {
		public static void main(String args[]){
		   int A, B, R;
		   Scanner s = new Scanner(System.in);

		   System.out.println();
		   System.out.println("WADAJU SOFTWARE SOLUTIONS");
		   System.out.println("Teste de condições if else");
		   System.out.print("Entre com o valor <A>: ");
		   A = s.nextInt();
		   System.out.print("Entre com o valor <B>: ");
		   B = s.nextInt();

		   R = A + B;

		   if (R>10){
			   System.out.print("O resultado ultrapassa o valor dez.");
		   } else {
			   System.out.print("O resultado não ultrapassa o valor dez.");
		   }
		   System.out.println();
		   System.out.println("Não foi preciso a mareta para abrir uma porta!");
		}
	}

