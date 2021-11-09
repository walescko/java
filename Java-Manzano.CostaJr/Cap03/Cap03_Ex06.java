import java.io.*;
import java.util.Scanner;

  class Cap03_Ex06{
    public static void main(String args[]){
	int a,b,c,x;
	Scanner s = new Scanner(System.in);

	System.out.println("WADAJU SOFTWARE SOLUTIONS");
	System.out.println("Entre com o valor de <A>: ");
	a = s.nextInt();
	System.out.println("Entre com o valor de <B>: ");
	b = s.nextInt();
	System.out.println("Entre com o valor de <C>: ");
	c = s.nextInt();

	if (!(c>5)){
	  x = (a+b)*c;
	} else{
	  x = (a-b)*c;
	}
	System.out.println("O resultado de X equivale a: " +x);
	System.out.println("Fim");

    }

  }
