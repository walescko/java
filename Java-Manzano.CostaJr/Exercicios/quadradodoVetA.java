import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

class quadradodoVetA{
    public static void main(String args[]){
    
    float A[] = new float[15];
    float B[] = new float[15];
    int i; //controle
    DecimalFormat df = new DecimalFormat("00.00");
    Scanner s = new Scanner(System.in);
    
    System.out.println("WADAJU SOFTWARE SOLUTIONS");
    System.out.println("Quadrado do vetor A");
    System.out.println("Entre com os valores do Vetor A: ");
    for ( i = 0 ; i < 15 ; i++ ){
        System.out.print("Digite o "+(i+1)+"º valor do vetor A: ");
        A[i] = s.nextFloat();
        }
        
    //operando o quadrado
    
    for ( i = 0 ; i < 15 ; i++){
        B[i]=A[i]*A[i];
        }
        
    //Apresentando os vetores
    System.out.println();
    System.out.println("Vetor A -- Vetor B");
    for ( i = 0 ; i < 15 ; i++ ){
        System.out.println(" "+df.format(A[i])+ "    " + df.format(B[i]));
        }
    System.out.println();
    System.out.println();
    }
}
