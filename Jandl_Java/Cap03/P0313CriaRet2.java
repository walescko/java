package JandlJrCap03;

public class P0313CriaRet2 {
	public static void main(String[] args) {
		
		try {
			
			double larg = 3;//= Double.parseDouble(args[0]);
			double alt = 5.5;// Double.parseDouble(args[1]);
			
			P0311Retangulo retangulo = new P0311Retangulo(larg, alt);
			
			System.out.println(retangulo);
			
		} catch (Exception exc) {
			System.out.println("Erro durante a excecução:\n " + exc);
		}
	}
}
