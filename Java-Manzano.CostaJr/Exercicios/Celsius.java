import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

class Celsius {

  public static void main(String args[]) {
    
   float C;
   float F;

   DecimalFormat df = new DecimalFormat();
   Scanner s = new Scanner(System.in);

   System.out.println("WADAJU SOFTWARE SOLUTIONS");
   System.out.println("Celsius >> Fahrenheit");
   System.out.print("Digite o valor da temperatura em Celsius: ");
   C = s.nextFloat();

   F = ((C*9)/5) + 32;

   System.out.println("A temperatura de " +df.format(C) +"ºC em Fahrenheit é " +df.format(F) + "ºF\n");
   System.out.println("Fim do Programa");

   }
}
	
