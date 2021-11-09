import java.io.*;
import java.text.DecimalFormat;
import java.util.*;

class potenciaOUT{

    public static void main(String args[]){
    
        int exp; //expoente
        int base; //base
        float r;
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        
        System.out.println();
        System.out.println("WADAJU SOFTWARE SOLUTIONS");
        System.out.println("Potenciação");
        System.out.println();
        System.out.print("Qual a base da potência? ");
        base = s.nextInt();
        System.out.print("Qual o expoente da potência? ");
        exp = s.nextInt();
        
        //chamando a subrotina
        
        r = potencia(base, exp);
        
        System.out.println();
        System.out.println("A Potencia ("+base+","+exp+") é "+df.format(r));
        System.out.println();
        System.out.println("Fim do programa");
    }
    
    //subrotina potencia
    
    public static float potencia(int base, int exp){
        float pot;
        
        pot = 1;
        
        for ( int i = 1 ; i <= exp ; i++){
            pot = pot*base;
        }
        return(pot);
        //System.out.println();
         }
        
}
