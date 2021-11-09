import java.io.*;
import java.util.Scanner;

class Cap03_Ex01{
	public static void main(String[] args){
	
	  int A, B, C;
	  Scanner s = new Scanner(System.in);
	
	  System.out.println();
		
	  System.out.print("Entre com o valor de A: ");
 	  A = s.nextInt();

	  System.out.print("Entre com o valor de B: ");
	  B = s.nextInt();

	  C = A + B;

	  System.out.println();
	
	if (C > 10){
		System.out.println("Resultado =" + C);
		}
	  System.out.println("A porta está ok, não foi necessário a marreta!");
	  System.out.println();
	  
	}
}
