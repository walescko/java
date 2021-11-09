import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

class Fahrenheit {

  public static void main(String args[]) {
    
   float C;
   float F;

   DecimalFormat df = new DecimalFormat();
   Scanner s = new Scanner(System.in);

   System.out.println("WADAJU SOFTWARE SOLUTIONS");
   System.out.println(" Fahrenheit >> Celsius");
   System.out.print("Digite o valor da temperatura em Fahrenheit: ");
   F = s.nextFloat();

   C = ((F-32)*5/9);

   System.out.println("A temperatura de " +df.format(F) +"ºF em Celsius é " +df.format(C) + "ºC\n");
   System.out.println("Fim do Programa");

   }
}
	
