import java.util.Scanner;
public class P0217Break {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Qual o máximo de pares? ");	
		int max = s.nextInt();
		
		int pares = 0;
		for (int i = 1 ; i < 1000; i++) {
			if (i%2 == 0) {
				pares++;
				System.out.printf("i = %d, quantidade de pares = %d\n", i, pares);
				
			}
			if (pares == max ) {
				break;
			}
		}
		s.close();
	}
}
