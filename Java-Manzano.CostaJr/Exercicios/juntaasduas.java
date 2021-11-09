import java.io.*;
import java.util.*;

class jundaasduas{
    public static void main(String args[]){
    
    int A[] = new int[5];
    int B[] = new int[15];
    int C[] = new int[15];
    int i; //Controle
    Scanner s = new Scanner(System.in);
    
    System.out.println("WADAJU SOFTWARE SOLUTIONS");
    System.out.println("União de vetores");
    System.out.println();
    
    System.out.println("Vetor A: ");
    for ( i = 0 ; i <=4 ; i++){
        System.out.print("Entre com o "+(i+1)+"º valor do vetor A: ");
        A[i] = s.nextInt();
        }
        
    System.out.println("Vetor B");
    for ( i = 5 ; i <= 14 ; i++){
        System.out.print("Entre com o "+(i-4)+"º valor do vetor B: ");
        B[i] = s.nextInt();
        }
    
    //Apresentando os vetores A e B
    System.out.print("Vetor A: ");
    for (i = 0 ; i <=4; i++) {
        System.out.print(A[i]+" ");
        }
    System.out.println();
    System.out.print("Vetor B: ");
    for (i = 5 ; i <=14 ; i++){
        System.out.print(B[i]+" ");
        }
        
    //Unindo as matrizes A e B
    for (i = 0 ; i < 15 ; i++) {
        if (i<5){
        C[i] = A[i];
        } else {
        C[i] = B[i];
        }}
    System.out.println();
    System.out.print("A U B = ");
    for (i = 0 ; i < 15; i++){
    System.out.print(C[i]+ " ");
    }
    
    System.out.println();
    }
}
