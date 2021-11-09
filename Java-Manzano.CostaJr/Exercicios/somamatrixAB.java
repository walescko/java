import java.io.*;
import java.util.*;

class somamatrixAB{
    public static void main(String args[]) {
        
        int A[][] = new int[5][3];
        int B[][] = new int[5][3];
        int i,j; //variaveis de controle
        Scanner s = new Scanner(System.in);
        
        System.out.println();
        System.out.println("WADAJU SOFTWARE SOLUTIONS");
        System.out.println("Soma de matrizes de mesmo tamanho");
        System.out.println();
        
        System.out.println("Matriz A de ordem 5x3");
        System.out.println("Digite os valores de cada elemento:");
        for ( i = 0 ; i < 5 ; i++ ) {
            for (j = 0 ; j < 3 ; j++) {
            System.out.print("Digite o elemento a"+(i+1)+(j+1)+": ");
            A[i][j]=s.nextInt();
            }
        }
        System.out.println("Matriz B de ordem 5x3");
        System.out.println("Digite os valores de cada elemento:");
        for ( i = 0 ; i < 5 ; i++ ) {
            for ( j = 0 ; j < 3 ; j++ ) {
            System.out.print("Digite o elemento b"+(i+1)+(j+1)+":");
            B[i][j] = s.nextInt();
            }
        }
        int C[][] = new int[5][3];
        
        for ( i = 0 ; i < 5 ; i++) {
            for ( j = 0 ; j < 3 ; j++) {
            C[i][j] = A[i][j]+B[i][j];
            }
        }
        
        System.out.println();
        System.out.print("Matriz A 5x3:");
        for ( i = 0 ; i < 5 ; i++ ) {
            System.out.println();
            for ( j = 0 ; j < 3 ; j++ ) {
            System.out.print(A[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.print("Matriz B 5x3:");
        for ( i = 0 ; i < 5 ; i++ ) {
            System.out.println();
            for ( j = 0 ; j < 3 ; j++ ) {
            System.out.print(B[i][j]+" ");
            }
        }
        System.out.println();
        System.out.println();
        System.out.print("Matriz A + B");
        for ( i = 0 ; i < 5 ; i++ ) {
            System.out.println();
            for ( j = 0 ; j < 3 ; j++ ) {
            System.out.print(C[i][j]+" ");
            }
        }
        
        System.out.println();
        System.out.println("Fim e o código tem só 71 linhas");
    }
}
