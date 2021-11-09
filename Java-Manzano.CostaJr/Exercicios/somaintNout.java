import java.io.*;
import java.util.*;

class somaintNout{
    public static void main(String args[]){
    
        byte n; //maior número da soma
        double r; //velor de retorno da subrotina
        Scanner s = new Scanner(System.in);
        
        System.out.println();
        System.out.println("WADAJU SOFTWARE SOLUTIONS");
        System.out.println("Soma dos N números inteiros");
        System.out.println();
        System.out.print("Até que número deseja somar? ");
        n = s.nextByte();
        System.out.println ();
        r = rotinasoma(n);
        System.out.println("A soma de 1 até "+n+" é "+r);
        System.out.println();
        }
    
    public static double rotinasoma(byte n){
        double soma = 0;
        
        for (int i = 1 ; i <= n ; i++){
            soma = soma + i;
            }
       
        return(soma);
        }
}
