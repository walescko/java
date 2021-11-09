import java.io.*;
import java.util.*;

class fibonacciIN{

    public static void main(String args[]){
    
        int n; //número do termo
        Scanner s = new Scanner(System.in);
        
        System.out.println("WADAJU SOFTWARE SOLUTIONS");
        System.out.println("Série de Fibonacci dos n termos");
        System.out.println();
        System.out.print("Quantos termos terá a série de Fibonacci? ");
        n = s.nextInt();
        System.out.println();
        fibonacci(n);
        System.out.println();
        System.out.println("Finale");
        
    }
    
    //Subrotina Fibonacci
        
    public static void fibonacci(int n){
        int f1 = 0, f2 = 1;
        
        //System.out.print(f1+ " ");
        //System.out.print(f2+ " ");
        
        for (int i = 1 ; i <=n ; i++){
            System.out.print(f1+ " ");
            f1 = f1 + f2;
            f2 = f1 - f2;
            //System.out.print(f1+ " ");
        }
    }
}
