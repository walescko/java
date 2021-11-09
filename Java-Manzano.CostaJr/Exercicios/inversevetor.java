import java.io.*;
import java.util.*;

class inversevetor{
    public static void main(String arg[]){
    
    int A[] = new int[10];
    int B[] = new int[10];
    int i,j;//controle 
    Scanner s = new Scanner(System.in);
    
    System.out.println("WADAJU SOFTWARE SOLUTIONS");
    System.out.println("Inversão do Vetor");
    System.out.println();
    System.out.println("Digite os elementos do vetor a ser invertido:");
    for ( i = 0 ; i < 10 ; i++ ) {
        System.out.print("Digite o "+(i+1)+"º elemento do vetor: ");
        A[i] = s.nextInt();
        }
        
    System.out.println();
    
    for ( i = 0 ; i <= 9 ; i++) { // && (j = 9 ; j >= 0 ; j -=1 )){
            B[i] = A[i];
        }
    
    
    System.out.print("Vetor A: ");
    for ( i = 0 ; i <= 9 ; i++) {
        System.out.print(A[i]+" ");
        }
    
    System.out.println();
    System.out.print("Vetor B: ");
    for ( i = 9 ; i >= 0 ; i -=1 ){
        System.out.print(B[i]+" ");
        }
    
    System.out.println();
    System.out.println("Conseguimos!!!");
    }
}
        
    
