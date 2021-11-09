import java.io.*;
import java.util.*;

class diagonal_nxn{
    public static void main(String args[]) {
        
        int n; //ordem da matriz quadrada

        int i,j; //variaveis de controle
        Scanner s = new Scanner(System.in);
        
        System.out.println();
        System.out.println("WADAJU SOFTWARE SOLUTIONS");
        System.out.println("Diagonal Principal");
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
        System.out.println();
        System.out.println();
        System.out.print("Elementos da Diagonal Principal:");
        for ( i = 0 ; i < n ; i++ ) {
            for ( j = 0 ; j < n ; j++ ) {
                if ( i == j ) {
                System.out.print(A[i][j]+" ");
            }
        }
        }
        
        System.out.println();
        System.out.println("Fim do código");
    }
}
