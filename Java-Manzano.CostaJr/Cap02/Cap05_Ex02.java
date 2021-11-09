import java.io.*;
import java.util.Scanner;

class Cap05_Ex02{
	public static void main(String args[]){
	 
	 int A[]= new int[5];
	 int i, soma = 0;
	 Scanner s = new Scanner(System.in);

	 //Entrada de dados
	 System.out.println();
	 
	 for ( i = 0 ; i <= 4 ; i++){
		 System.out.print("Entre o "+(i+1)+"o. elemento: ");
		 A[i]=s.nextInt();
	 }

	 //Processamento par ou ímpar
	 
	 for ( i = 0 ; i <= 4 ; i++){
		 if (A[i]%2 != 0){
			 soma += A[i];
		 }
	 }
	 
	//Apresentação do arrays
	
	 System.out.println();
	 System.out.println("Soma dos ímpares = "+soma);


	}
}
