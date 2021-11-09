import java.io.*;
import java.util.*;

class Cap05_Ex07 {

    public static void main(String args[]){
      
      String A[] = new String[5], pesq;
      int i;
      Scanner s = new Scanner(System.in);
      
      //Entrada dos nomes
      
      System.out.println();
      
      for ( i = 0 ; i < 5 ; i++) {
        System.out.print("Entre o "+(i+1)+"º nome: ");
        A[i] = s.nextLine();
        }
        
      //Ordenação
        
      Arrays.sort(A);
        
      //Apresentação dos nomes
        
      System.out.println();
         for ( i = 0 ; i < 5 ; i ++){
            System.out.println((i+1)+"º nome: "+A[i]);
            }
      System.out.println();
        
      System.out.print("Entre com o nome a pesquisar: ");
      pesq = s.nextLine();
      i = Arrays.binarySearch(A,pesq);
      if (i>=0){
        System.out.println(pesq+" foi encontrado na posição "+ (i+1));
        } else {
            System.out.println(pesq+" não foi localizado");
        }
      System.out.println();
      System.out.println("FIM");
      System.out.println();

    }
}
