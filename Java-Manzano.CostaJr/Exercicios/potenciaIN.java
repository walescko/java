import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

class potenciaIN{

    public static void main(String args[]){
    
        int exp; //expoente
        int base; //base
        Scanner s = new Scanner(System.in);
        
        System.out.println();
        System.out.println("WADAJU SOFTWARE SOLUTIONS");
        System.out.println("Potenciação");
        System.out.println();
        System.out.print("Qual a base da potência? ");
        base = s.nextInt();
        System.out.print("Qual o expoente da potência? ");
        exp = s.nextInt();
        
        //chamando a subrotina
        
        potencia(base, exp);
        
        System.out.println();
        System.out.println("Fim do programa");
    }
    
    //subrotina potencia
    
    public static void potencia(int base, int exp){
        float pot;
        DecimalFormat df = new DecimalFormat("0.0");
        
        pot = 1;
        
        for ( int i = 1 ; i <= exp ; i++){
            pot = pot*base;
        }
        
        System.out.println();
        System.out.println("A Potencia ("+base+","+exp+") é "+df.format(pot));
        System.out.println();
        }
        
}
