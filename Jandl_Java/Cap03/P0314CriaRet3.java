package JandlJrCap03;

public class P0314CriaRet3 {
	public static void main(String[] args) {
		
		try {
			double larg = 8; //Double.parseDouble(args[0]);
			double alt = 0; //Double.parseDouble(args[1]);
			
			P0312Retangulo retangulo = new P0312Retangulo(larg, alt);
			
			System.out.println(retangulo);
		} catch (ArrayIndexOutOfBoundsException exc) {
			System.out.println("Número insuficente de argumentos.");	
		} catch (NumberFormatException exc) {
			System.out.println("Argumento(s) inválido(s)");
		} catch (Exception exc) {
			System.out.println("Dimensões Inválidas");
		}
	}
}