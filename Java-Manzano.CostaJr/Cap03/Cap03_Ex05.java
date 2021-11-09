import java.io.*;
import java.util.Scanner;

class Cap03_Ex05 {
	public static void main(String args[]){
	  
	  int codigo;
	  Scanner s = new Scanner(System.in);

	  System.out.println("WADAJU SOFTWARE SOLUTIONS");
	  System.out.println("Entre o código de acesso: ");
	  codigo = s.nextInt();

	  if (codigo == 1 || codigo == 2 || codigo == 3 ){
		  if (codigo == 1){
			  System.out.println("Um");
		  } if (codigo == 2){
			  System.out.println("Dois");
		  } if (codigo == 3){
			  System.out.println("Três");
		  }} else {
			  System.out.println("Invalide Code");
		  }
		  System.out.println("Fim do programa!");

	  }}
