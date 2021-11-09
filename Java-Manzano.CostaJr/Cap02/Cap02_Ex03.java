import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

class Cap02_Ex03 {
  public static void main(String args[]) {
   
   String NOME;
   int IDADE;
   float ALTURA;

    DecimalFormat df = new DecimalFormat();
    Scanner s = new Scanner(System.in);

    System.out.println("WADAJU SOFTWARE SOLUTIONS");
    System.out.print("Entre com seu nome ...: ");
    NOME = s.nextLine();

    System.out.print("Entre com sua idade ...: ");
    IDADE = s.nextInt();
    
    System.out.print("Entre com sua altura ...: ");
    ALTURA = s.nextFloat();

    System.out.println();
    System.out.println("Nome ........: " + NOME);
    System.out.println("Idade .......: " + IDADE + " anos");
    df.applyPattern("0.00");
    System.out.println("Altura ......: " + df.format(ALTURA));
    System.out.println();
    System.out.println("Fim do programa");

}}
