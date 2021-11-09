import java.io.*;
import java.util.*;

class subtractionmatrixAB{
    public static void main(String args[]) {
        
        int A[][] = new int[4][4];
        int B[][] = new int[4][4];
        int i,j; //variaveis de controle
        Scanner s = new Scanner(System.in);
        
        System.out.println();
        System.out.println("WADAJU SOFTWARE SOLUTIONS");
        System.out.println("Soma de matrizes de mesmo tamanho");
        System.out.println();
        
        System.out.println("Matriz A de ordem 4x4");
        System.out.println("Digite os valores de cada elemento:");
        for ( i = 0 ; i < 4 ; i++ ) {
            for (j = 0 ; j < 4 ; j++) {
            System.out.print("Digite o elemento a"+(i+1)+(j+1)+": ");
            A[i][j]=s.nextInt();
            }
        }
        System.out.println("Matriz B de ordem 4x4");
        System.out.println("Digite os valores de cada elemento:");
        for ( i = 0 ; i < 4 ; i++ ) {
            for ( j = 0 ; j < 4 ; j++ ) {
            System.out.print("Digite o elemento b"+(i+1)+(j+1)+":");
            B[i][j] = s.nextInt();
            }
        }
        int C[][] = new int[4][4];
        
        for ( i = 0 ; i < 4 ; i++) {
            for ( j = 0 ; j < 4 ; j++) {
            C[i][j] = A[i][j]-B[i][j];
            }
        }
        
        System.out.println();
        System.out.print("Matriz A 4x4:");
        for ( i = 0 ; i < 4 ; i++ ) {
            System.out.println();
            for ( j = 0 ; j < 4 ; j++ ) {
            System.out.print(A[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.print("Matriz B 4x4:");
        for ( i = 0 ; i < 4 ; i++ ) {
            System.out.println();
            for ( j = 0 ; j < 4 ; j++ ) {
            System.out.print(B[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.print("Matriz A - B");
        for ( i = 0 ; i < 4 ; i++ ) {
            System.out.println();
            for ( j = 0 ; j < 4 ; j++ ) {
            System.out.print(C[i][j]+" ");
            }
        }
        
        System.out.println();
        System.out.println("Fim e o código tem só 71 linhas");
    }
}
