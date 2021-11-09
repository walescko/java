import java.io.*;
import java.util.*;

class matrixdig2dem3{
    public static void main(String args[]) {
        
        int n; //ordem da matriz quadrada

        int i,j; //variaveis de controle
        Scanner s = new Scanner(System.in);
        
        System.out.println();
        System.out.println("WADAJU SOFTWARE SOLUTIONS");
        System.out.println("Diagonal Principal x2 e demais x3");
        System.out.println();
        
        System.out.print("Qual será a ordem da Matriz quadrada?");
        n = s.nextInt();
                
        int A[][] = new int[n][n];
                
        System.out.println("Matriz A de ordem "+ n + "x" + n +":");
        for ( i = 0 ; i < n ; i++ ) {
            for (j = 0 ; j < n ; j++) {
            System.out.print("Digite o elemento a"+(i+1)+(j+1)+": ");
            A[i][j]=s.nextInt();
            }
        }
        
        System.out.println();
        System.out.print("Matriz A de ordem "+ n + "x" + n +":");
        for ( i = 0 ; i < n ; i++ ) {
            System.out.println();
            for ( j = 0 ; j < n ; j++ ) {
            System.out.print(A[i][j]+" ");
            }
        }
        
        int B[][] = new int[n][n];
        
        System.out.println();
        System.out.println();
        for ( i = 0 ; i < n ; i++ ) {
            for ( j = 0 ; j < n ; j++ ) {
                if ( i == j ) {
                B[i][j] = 2*A[i][j];
                } else {
                B[i][j] = 3*A[i][j];
                }
                
            }
        }
        
        System.out.print("Matriz B:");
        for ( i = 0 ; i < n ; i++){
            System.out.println();
            for ( j = 0 ; j < n ; j++){
                System.out.print(B[i][j]+ " ");
                }
            }
        
        System.out.println();
        System.out.println("Fim do código");
    }
}
