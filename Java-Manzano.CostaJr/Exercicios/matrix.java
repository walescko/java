import java.io.*;
import java.util.*;

class matrix{
    public static void main(String args[]) {
        
        int A[][] = new int[4][5];
        int i,j; //variaveis de controle
        Scanner s = new Scanner(System.in);
        
        System.out.println();
        System.out.println("WADAJU SOFTWARE SOLUTIONS");
        System.out.println("The Matrix");
        System.out.println();
        
        System.out.println("Matriz A de ordem 4x5");
        System.out.println("Digite os valores de cada elemento:");
        for ( i = 0 ; i < 4 ; i++ ) {
            for (j = 0 ; j < 5 ; j++) {
            System.out.print("Digite o elemento a"+(i+1)+(j+1)+": ");
            A[i][j]=s.nextInt();
            }
        }
        
        System.out.println();
        System.out.print("Matriz A 4x5:");
        for ( i = 0 ; i < 4 ; i++ ) {
            System.out.println();
            for ( j = 0 ; j < 5 ; j++ ) {
            System.out.print(A[i][j]+" ");
            }
        } 
        System.out.println();
        System.out.println("Fim do código");
    }
}
