import java.util.Arrays;
import java.util.Scanner;

public class P0230UsoArrays{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Número de elementos? ");
        int tamanho = sc.nextInt();

        System.out.print("Preenchimento Real? ");
        double valor = sc.nextDouble();

        double[] arranjo1 = new double[tamanho];

        Arrays.fill(arranjo1, valor);

        System.out.println(Arrays.toString(arranjo1));

        System.out.print("Posição inicial da cópia? ");
        int de = sc.nextInt();

        System.out.print("Posição final da cópia? ");
        int para = sc.nextInt();

        double[] arranjo2 = Arrays.copyOfRange(arranjo1, de, para);
        double[] arranjo3 = Arrays.copyOf(arranjo1, arranjo1.length);

        System.out.println("Cópia parcial:\n" + Arrays.toString(arranjo2));
        System.out.println("Cópia total:\n" + Arrays.toString(arranjo3));
        sc.close();

    }
}