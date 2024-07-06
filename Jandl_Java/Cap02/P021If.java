package com.company.Jandl_Java.Cap02;


public class P021If {
   
	public static void main(String[] args) {
    
		if (args.length > 0) {
        
			int max = Integer.parseInt(args[0]);
            for (int j = 0; j < max; j++) {
                System.out.println(j + " ");
            }
            
            System.out.println("\nFim da Contagem.");
        }
        
		System.out.println("Fim do Programa!");
    
	}
}