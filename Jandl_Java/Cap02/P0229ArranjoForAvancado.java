import java.util.Scanner;

public class P0229ArranjoForAvancado{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Número de elementos? ");
        int tamanho = sc.nextInt();
        assert tamanho > 0 ;

        int array[] = new int[tamanho];

        for (int i = 0 ; i < tamanho ; i++ ){
            System.out.print("Elemento [" + i + "]? ");
            array[i] = sc.nextInt();
        }
        sc.close();

        int soma = 0;

        System.out.print("[ ");
        for (int elemento: array){
            soma += elemento;
            System.out.print(elemento + " ");
        }

        System.out.println("] soma = " + soma);
    }
}