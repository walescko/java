import java.io.*;
import java.util.Scanner;

class impar20do {
	public static void main(String args[]){
	  int n,i;
	  int impar;

	  System.out.println("WADAJU SOFTWARE SOLUTIONS");
	  System.out.println("Ímpares entre 0 e 20");
	  

	  i = 0 ;
	  n = 0 ;
	  do{
		  impar = n % 2;
		  if (impar != 0){
			  System.out.println(" "+n);
		  }
		  i = i + 1;
		  n = n + 1;
	  } while (n <=20);

	  System.out.println();
	  System.out.println("Fim!");
	}
}
