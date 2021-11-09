import java.io.*;
import java.util.*;

class somavetores{
    public static void main(String args[]){
    
    int A[] = new int[10];
    int B[] = new int[10];
    int C[] = new int[10];
    int i;
    Scanner s = new Scanner(System.in);
    
    System.out.println();
    System.out.println("WADAJU SOFTWARE SOLUTIONS");
    System.out.println("Soma de vetores A e B");
    System.out.println();
    
    //Montando o vetor A
    System.out.println("Vetor A - entre com os valores do vetor: ");
    for (i = 0 ; i < 10 ; i++) {
        System.out.print("Entre com o "+(i+1)+"º valor: ");
        A[i] = s.nextInt();
        }
    
    //Montando o vetor B
    System.out.println("Vetor B - entre com os valores do vetor: ");
    for ( i = 0 ; i < 10 ; i++) {
        System.out.print("Entre com o "+(i+1)+"º valor: ");
        B[i] = s.nextInt();
        }
        
    //Escrevendo os vetores na tela
    System.out.print("Vetor A: ");
    for ( i = 0 ; i < 10 ; i++) {
        System.out.print(A[i]+" ");
        }
    
    System.out.println();
    System.out.print("Vetor B: ");
    for ( i = 0 ; i < 10 ; i++) {
        System.out.print(B[i]+" ");
        }
    
    //operando as matrizes
    System.out.println();
    System.out.print("A - B: ");
    for (i = 0 ; i < 10 ; i++) {
        C[i] = A[i] - B[i];
        System.out.print(C[i]+" ");
        }
    System.out.println();
    System.out.println("Fim");
 
    
    }
}
