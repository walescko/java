import java.util.Scanner;

public class P0205SaidaFormatada {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número final: ");
		int limite = sc.nextInt();
		
		int soma = 0;
		for (int i = 1 ; i <= limite ; i++) {
			soma += i;
			System.out.printf("%3da. soma parcial = %6d%n", i, soma);
		}
		System.out.printf("Soma total[0 ...%3d] = %6d%n", limite, soma);
		sc.close();
	}
}
