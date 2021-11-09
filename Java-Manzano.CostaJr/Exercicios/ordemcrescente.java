import java.io.*;
import java.util.Scanner;

  class ordemcrescente{
    public static void main(String args[]){
	    int a,b,c;
	    int maior,meio,menor;
	    Scanner s = new Scanner(System.in);
	    
	    System.out.println("WADAJU SOFTWARE SOLUTIONS");
	    System.out.println("Ordenando números inteiros");
	    System.out.println("Entre com os valores");
	    System.out.print("A = ");
	    a = s.nextInt();
	    System.out.print("B = ");
	    b = s.nextInt();
	    System.out.print("C = ");
	    c = s.nextInt();
		maior =0; //olha aqui a variavel maior
	    if ((a > b) && (a > c)) {
	       maior = a;
	    } if (b>c){
	       meio = b;
	       menor =c;
	      } else {
		  meio = c;
	      	  menor = b;	  
	      }
		  
		  if ((b > c) && (b > a)){
		  maior = b;
		  } if (a>c){
		  meio = a;
		  menor =c;
		  } else {
	       	  	meio = c;
			menor = a;
		  }

		  /*if ((c>a) && (c>b)){
		      maior = c; 
		  }if ((a>b)){
		        meio = a;
			menor = b;
		  } else {
			  meio = b;
			  meio = a;
		  }*/

		  System.out.println("Vamos ver se conseguimos o objetivo");
		  System.out.println("A = "+a+", B = " +b+ ", C = " +c);
		  System.out.println("Maior = "+maior+ " Meio =  "+meio+ ", Menor = "+menor);
		  System.out.println("FIM!");
    }
  }
	 

