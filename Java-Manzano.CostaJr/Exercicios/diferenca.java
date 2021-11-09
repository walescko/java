import java.io.*;
import java.util.Scanner;

class diferenca{
	public static void main(String args[]){
	  int num1,num2;
	  int diferenca,maior,menor;
	  Scanner s = new Scanner(System.in);


	  System.out.println("WADAJU SOFTWARE SOLUTIONS");
	  System.out.println("Diferença entre maior e o menor");
	  System.out.println("Digite dois números inteiros: ");
	  System.out.print("A = ");
	  num1 = s.nextInt();
	  System.out.print("B = ");
	  num2 = s.nextInt();

	  if (num1 > num2){
		  diferenca = num1 - num2;
		  maior = num1;
		  menor = num2;
	  } else {
		  diferenca = num2 - num1;
	  	  maior = num2;
	  	  menor = num1;	  
	  }

	  System.out.println("Maior = "+maior);
	  System.out.println("Menor = "+menor);
	  System.out.println("Diferença entre eles é "+diferenca);
	  System.out.println("Fim");
	  System.out.println();
	}
}
