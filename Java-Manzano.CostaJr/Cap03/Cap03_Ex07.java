import java.io.*;
import java.util.Scanner;

  class Cap03_Ex07{ 
   public static void main(String args[]){
   int n, r4,r5;
   Scanner s = new Scanner(System.in);

   System.out.println("WADAJU SOFTWARE SOLUTIONS");
   System.out.println("Entre com um número natural: ");
   n = s.nextInt();

   r4 = n%4;
   r5 = n%5;

   if (r4 == 0 && r5 == 0){
     System.out.println(n);
    } else {
	System.out.println("O número não é divisível por 4 e 5.");
    }
  }
}
