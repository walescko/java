import java.io.*;
import java.util.Scanner;

class multiplos4do{
	public static void main(String args[]){
	 int i;
	 int mult4;

	 i = 1;
	 mult4 = 0;

	 do {
		 mult4 = i % 4 ;
		 if (mult4 == 0){
			 System.out.println(" "+i);
		 }
		 i = i + 1 ;
	 } while (i <= 30);

	 System.out.println();
	 System.out.println("Fim");
	}
}
