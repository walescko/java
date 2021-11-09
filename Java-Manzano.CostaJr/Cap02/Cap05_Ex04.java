import java.io.*;
import java.util.*;

class Cap05_Ex04{

    public static void main(String args[]){
    
    List<String> lista = new ArrayList<>();
    
    int t;
    String n;
    
    Scanner s1 = new Scanner(System.in);
    Scanner s2 = new Scanner(System.in);
    
    //Entrada dos nomes
    
    System.out.println();
    System.out.println("Quantos nomes irá digitar? ");
    t = s1.nextInt();
    
    System.out.println();
    for (int i =  0; i < t ; i++){
        System.out.print("Entre o "+ (i+1) + "º nome: ");
        n = s2.nextLine();
        lista.add(n);
        }
        
    //Apresentação dos nomes
        
    for (int i = 0 ; i < lista.size(); i++){
        n = lista.get(i);
        System.out.println((i+1)+"º nome = "+n);
        }
    }
        
}
