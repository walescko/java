import java.io.*;

public class P0226TryWithREsources {
	public static void main(String[] args) {
		
		String s = "Java - Guia do Programador, 4ª Ed.";
		processaRecurso(s);
	}
	
	public static void processaRecurso(String s) {
		StringReader recurso = new StringReader(s);
		
		try (recurso){
			int espacos = 0, c;
			
			while ((c = recurso.read()) != -1 ) { if (c==32) espacos++;}
			System.out.println("Espaços = " +espacos);
		} catch (IOException e1) {
			System.out.println(e1);
		}
		System.out.println("Recurso Processado.");
	}
}