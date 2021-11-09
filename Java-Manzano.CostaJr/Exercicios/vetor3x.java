import java.io.*;
import java.util.*;

class vetor3x{
    public static void main(String args[]){
    
    int A[] = new int[8]; //vetor de entrada
    int i; //variavel de controle
    Scanner s = new Scanner(System.in);
    
    System.out.println("WADAJU SOFTWARE SOLUTIONS");
    System.out.println("Vetor A - entrada de dados: ");
    for (i = 0 ; i < 8 ; i++) {
        System.out.print("Entre com o "+(i+1)+"º valor do vetor A: ");
        A[i] = s.nextInt();
        }
        
    System.out.println();
    System.out.println("Vetor A:");
    for (i = 0; i < 8 ; i++){
        System.out.print(A[i]+" ");
        }
    System.out.println();
    System.out.println("A.3 = Vetor B: ");
    int B[] = new int[8]; //vetor B = 3.A
    for ( i = 0 ; i < 8 ; i++){
        B[i] = 3*A[i];
        System.out.print(B[i]+" ");
        }
        
        
        
        
    System.out.println();    
    System.out.println("Fim");    
    }
}
