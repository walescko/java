import java.io.*;
import java.util.*;

class Cap05_Ex05{

    public static void main(String args[]){
    
        int A[] = new int[10];
        int i;
        Scanner s = new Scanner(System.in);
        
        //Entrada de Dados
        
        System.out.println();
        for ( i = 0 ; i <= 9 ; i++){
            System.out.print(" Entre o "+ (i+1) + "º elemento: ");
            A[i] = s.nextInt();
            }
            
        //Ordenação - ordenhação
        
        Arrays.sort(A);
        
        //Apresentação do Array 
        
        System.out.println();
        for (i = 0 ; i <= 9 ; i++ ){
            System.out.println(i+"º valor = "+ A[i]);
            }
            
        System.out.println();
        
    }
}
