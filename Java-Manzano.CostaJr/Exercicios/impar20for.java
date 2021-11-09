import java.io.*;
import java.util.Scanner;

class impar20for {
	public static void main(String args[]){
	  int i;
	  int impar;

	  System.out.println("WADAJU SOFTWARE SOLUTIONS");
	  System.out.println("Ímpares entre 0 e 20");
	  

	  
	  //n = 0 ;
	  for (i=1 ; i <= 20; i++){
		  impar = i % 2;
		  if (impar != 0){
			  System.out.println(" "+i);
		  }
		  //n = n + 1;
	  } 

	  System.out.println();
	  System.out.println("Fim!");
	}
}
