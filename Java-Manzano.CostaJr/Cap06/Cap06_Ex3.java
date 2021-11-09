import java.io.*;
import java.util.*;

class Cap06_Ex3{
    public static void main(String args[]){
        byte x;
        Scanner s = new Scanner(System.in);
        System.out.println();
        System.out.println("-------------------------");
        System.out.println("    Programa Fatorial    ");
        System.out.println("-------------------------");
        System.out.println();
        System.out.print("Entre um valor inteiro até 25: ");
        x = s.nextByte();
        System.out.println();
        fatorial(x);
        System.out.println();
        System.out.println("Fim do programa");
    }
    
    public static void fatorial(byte n){
        long fat = 1;
        if ( n == 0 ) {
            fat = 0;
        } else {
          for (int i = 1 ; i <=n ; i++ ) {
            fat *= i;
            }
        }
        
        System.out.println("Fatorial de "+ n + " = " + fat);
        }
        
    }
        
