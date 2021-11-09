package src;

public class P0221TryCatchSeletivo {
	public static void main(String[] args) {
		
		try {
			int j = Integer.parseInt(args[0]);
			while (j >= 0) {
				System.out.println(j);
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Não foi fornecido um argumento.");
		} catch (NumberFormatException e2) {
			System.out.println("Argumento não é um inteiro.");
		}
	
	}
}