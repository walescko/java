import java.io.*;
import java.util.*;

class somaintNin{
    public static void main(String args[]){
    
        byte n; //maior número da soma
        float r; //velor de retorno da subrotina
        Scanner s = new Scanner(System.in);
        
        System.out.println();
        System.out.println("WADAJU SOFTWARE SOLUTIONS");
        System.out.println("Soma dos N números inteiros");
        System.out.println();
        System.out.print("Até que número deseja somar? ");
        n = s.nextByte();
        System.out.println ();
        System.out.println("Saimos da subrotina");
        }
    
    public static void soma(byte n){
        float soma = 0;
        
        for (int i = 0 ; i <= n ; i++){
            soma = soma + i;
            }
            
        System.out.println("A soma de 1 até "+n+" é "+soma);

        }
}
