import java.io.*;
import java.util.*;
import java.text.*;

class taxaOUT{

    //programa principal
    public static void main(String args[]){
    
        int dias;
        float valor, taxa, r;
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("00.00");
        
        
        
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
        r = rotPrestacao(dias, valor, taxa);
        
        System.out.println();
        System.out.println("O valor da prestação a pagar é R$ "+df.format(r));
        
        }
        
        public static float rotPrestacao(int dias, float valor, float taxa){
            float pagar;
            DecimalFormat df = new DecimalFormat("00.00");
        
            pagar = valor * (1 + taxa*dias/100);
            
            //System.out.println("Subrotina R$ "+df.format(pagar));
            //System.out.println();
            return(pagar);
            }
        
}
        
        
