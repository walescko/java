import java.io.*;
import java.util.Scanner;

class soma100for{
	public static void main(String args[]){
	  int i;
	  int soma;

	  System.out.println("WADAJU SOFTWARE SOLUTIONS");
	  System.out.println("Soma dos número até 100");

	  //i = 0;
	  //n = 0;
	  soma = 0;

	  for (i = 0 ; i <= 100 ; i++){
		  soma = soma + i;
		 // i = i + 1;
	  } 

	  System.out.println("A soma dos números de 0 a 100 é "+soma);
	  System.out.println();
	  System.out.println("Fim");
	}
}
