import java.io.*;
import java.text.DecimalFormat;

class Cap02_Ex02 {
  public static void main(String args[]) {
    
    String NOME;
    int IDADE;
    float ALTURA;

    DecimalFormat df = new DecimalFormat();
    
    System.out.println("WADAJU SOFTWARE SOLUTIONS");
    System.out.print("Entre com o seu nome: ...: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      NOME = br.readLine();
      }
     catch (Exception e)
     {
      NOME = " ";
     }

    System.out.print("Entre com a sua idade ...: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      IDADE = Integer.parseInt(br.readLine());
      }
      catch (Exception e)
      {
       IDADE = 0;
      }

    System.out.print("Entre com a sua altura ...: ");
    try {
      BufferedReader br = new BufferedReader(
      new InputStreamReader(System.in));
      ALTURA = Float.parseFloat(br.readLine());
      }
      catch (Exception e)
      {
       ALTURA = 0;
      }

    System.out.println();
    System.out.print("Nome ............: " + NOME);
    System.out.print("\nIdade ...........: " + IDADE + " anos");
    df.applyPattern("0.00");
    System.out.print("\nAltura ..........: " + df.format(ALTURA));
    System.out.println();
}}		
