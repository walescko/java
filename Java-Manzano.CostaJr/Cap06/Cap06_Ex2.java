import java.io.*;
import java.util.*;
import java.text.*;

class Cap06_Ex2{
    public static void main(String args[]){
    
    byte opcao1 = 0;
    Scanner opcao = new Scanner(System.in);
    
    //Programa Principal
    
    while (opcao1 != 5){
        System.out.println();
        System.out.println();
        System.out.println("------------------------");
        System.out.println("  Programa Calculadora  ");
        System.out.println("     Menu Principal     ");
        System.out.println("------------------------");
        System.out.println();
        System.out.println("[1] ............. Adicão");
        System.out.println("[2] .......... Subtração");
        System.out.println("[3] ...... Multiplicação");
        System.out.println("[4] ............ Divisão");
        System.out.println("[5] .... Fim do Programa");
        System.out.println();
        System.out.print("Escolha uma opção: ");
        opcao1 = opcao.nextByte();
        if (opcao1 !=5 || opcao1 != 0){
            switch (opcao1){
            case 1: rotadicao();        break;
            case 2: rotsubtracao();     break;
            case 3: rotmultiplicacao(); break;
            case 4: rotdivisao();       break;
            }
        }
      }
    }
    
    //Modulo adicao
    public static void rotadicao(){
        double R, A, B;
        DecimalFormat df = new DecimalFormat();
        Scanner s = new Scanner(System.in);
        
        System.out.println();
        System.out.println();
        System.out.println("Rotina de Adição");
        System.out.println("----------------");
        System.out.println();
        System.out.print("Entre com um valor para variável [A]: ");
        A = s.nextDouble();
        System.out.print("Entre com um valor para a variável [B]: ");
        B = s.nextDouble();
        R = A + B;
        System.out.println();
        df.applyPattern("0.00");
        System.out.println("O resultado entre A e B = "+df.format(R));
         pausa();
         }
         
    //Modulo subtração
    public static void rotsubtracao(){
        double R, A, B;
        DecimalFormat df = new DecimalFormat();
        Scanner s = new Scanner(System.in);
        
        System.out.println();
        System.out.println();
        System.out.println("Rotina de Subtração");
        System.out.println("-------------------");
        System.out.println();
        System.out.print("Entre com um valor para variável [A]: ");
        A = s.nextDouble();
        System.out.print("Entre com um valor para a variável [B]: ");
        B = s.nextDouble();
        R = A - B;
        System.out.println();
        df.applyPattern("0.00");
        System.out.println("O resultado entre A e B = "+df.format(R));
         pausa();
         }        
         
         //Modulo Multicação
        public static void rotmultiplicacao(){
        double R, A, B;
        DecimalFormat df = new DecimalFormat();
        Scanner s = new Scanner(System.in);
        
        System.out.println();
        System.out.println();
        System.out.println("Rotina de Multiplicação");
        System.out.println("-----------------------");
        System.out.println();
        System.out.print("Entre com um valor para variável [A]: ");
        A = s.nextDouble();
        System.out.print("Entre com um valor para a variável [B]: ");
        B = s.nextDouble();
        R = A * B;
        System.out.println();
        df.applyPattern("0.00");
        System.out.println("O resultado entre A e B = "+df.format(R));
         pausa();
         }
         
         //Modulo Divisão
        public static void rotdivisao(){
        double R, A, B;
        DecimalFormat df = new DecimalFormat();
        Scanner s = new Scanner(System.in);
        
        System.out.println();
        System.out.println();
        System.out.println("Rotina de Multiplicação");
        System.out.println("-----------------------");
        System.out.println();
        System.out.print("Entre com um valor para variável [A]: ");
        A = s.nextDouble();
        System.out.print("Entre com um valor para a variável [B]: ");
        B = s.nextDouble();
        if (B == 0){
            System.out.println();
            System.out.println("Erro!");
            } else {
                R = A / B;
                System.out.println();
                df.applyPattern("0.00");
                System.out.println("O resultado entre A e B = "+df.format(R));
                pausa();
            }
         }
         
         //Modulo pausa
         
         public static void pausa(){
            byte enter;
            System.out.println();
            System.out.print("Tecle <Enter> para voltar ao menu: ");
            try
                {
                BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));
                enter = Byte.parseByte(br.readLine());
                }
            catch (Exception e)
                {
                    enter = 0;
                }
                
    }
}
