import java.io.*;
import java.util.*;
import java.text.*;

class taxaIn{

    //programa principal
    public static void main(String args[]){
    
        int dias;
        float valor, taxa;
        Scanner s = new Scanner(System.in);
        
        System.out.println();
        System.out.println("WADAJU SOFTWARE SOLUTIONS");
        System.out.println("Valor da Prestação");
        System.out.println();
        System.out.print("Qual o valor da prestação? ");
        valor = s.nextFloat();
        System.out.print("Qual a taxa de juros em %? ");
        taxa = s.nextFloat();
        System.out.print("Quantos dias de atraso da prestação? ");
        dias = s.nextInt();
        
        //chamando a sub rotina:
        rotPrestacao(dias, valor, taxa);
        
        }
        
        public static void rotPrestacao(int dias, float valor, float taxa){
            float pagar;
            DecimalFormat df = new DecimalFormat("00.00");
        
            pagar = valor * (1 + taxa*dias/100);
            
            System.out.println("O valor da prestação a pagar é R$ "+df.format(pagar));
            System.out.println();
            }
        
}
        
        
