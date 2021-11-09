package src;

public class P0223TryCatchFinally {
	public static void main(String[] args) {
		
		int j = 5;
		
		try {
			j = Integer.parseInt(args[0]);	
		} catch (Exception e) {
			System.out.println("Argumento inválido ou ausente. Usando default.");
		} finally {
			while (j >= 0) {
				System.out.println(j);
				j--;
			}
		}
		
	}
}
