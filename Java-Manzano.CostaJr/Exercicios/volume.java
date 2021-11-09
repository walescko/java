import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

class volume {

   public static void main(String arg[]){

	double Raio;
	double Height;
	double Volume;
	double PI;

	DecimalFormat df = new DecimalFormat();
	Scanner s = new Scanner(System.in);
	PI = 3.14159;

	System.out.println("WADAJU SOFTWARE SOLUTIONS");
	System.out.println("Volume do cilindro");
	System.out.print("Entre com o valor do Raio do cilindro: ");
	Raio = s.nextFloat();
	System.out.print("Entre com o valor da altura do cilindro: ");
	Height = s.nextDouble();
	
	Volume = PI * Height * Raio * Raio;

	System.out.println("O volume do cilintro de raio " + df.format(Raio) + " e altura " + df.format(Height) + " é " +df.format(Volume));
	System.out.println("\nFim do programa");


   }
}
