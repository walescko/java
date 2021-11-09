import java.io.*;
import java.util.Scanner;

class multiplo4do{
	public static void main(String args[]){
	 int i;
	 int mult4;

	 i = 1;
	 mult4 = 0;

	 while (i <= 30) {
		 mult4 = i % 4 ;
		 if (mult4 == 0){
			 System.out.println(" "+i);
		 }
		 i = i + 1 ;
	 } 

	 System.out.println();
	 System.out.println("Fim");
	}
}
