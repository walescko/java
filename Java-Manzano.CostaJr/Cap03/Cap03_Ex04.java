import java.io.*;
import java.util.Scanner;

class Cap03_Ex04 {
  public static void main(String args[]){

   int numero;
   Scanner s = new Scanner(System.in);

   System.out.println();

   System.out.print("Entre um valor: ");
   numero = s.nextInt();

   if (numero >= 20 && numero <= 90){
	System.out.print("O valor esta entre 20 e 90");
	} else {
	 System.out.print("O valor não está entre 20 e 90");
	 }

	System.out.println();

  }
}
