import java.io.*;
import java.util.Scanner;

class multiplos4for{
	public static void main(String args[]){
	 int i;
	 int mult4;

	 //i = 1;
	 mult4 = 0;

	 for (i = 1 ; i <= 30 ; i++) { 
		 mult4 = i % 4 ;
		 if (mult4 == 0){
			 System.out.println(" "+i);
		 }
		
	 } 

	 System.out.println();
	 System.out.println("Fim");
	}
}
