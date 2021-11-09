import java.io.*;
import java.util.Scanner;

class media {
	public static void main(String args[]){

	 double nota1,nota2,nota3,nota4;
	 double media;
	 Scanner s = new Scanner(System.in);

	 System.out.println("WADAJU SOFTWARE SOLUTIONS");
	 System.out.println("Aprovado ou reprovado");
	 System.out.println("Digite as quatro notas do aluno:");
	 System.out.println("Nota 1: ");
	 nota1 = s.nextDouble();
	 System.out.println("Nota 2: ");
	 nota2 = s.nextDouble();
	 System.out.println("Nota 3: ");
	 nota3 = s.nextDouble();
	 System.out.println("Nota 4: ");
	 nota4 = s.nextDouble();

	 media = 0;

	 media = (nota1 + nota2 + nota3 + nota4)/4;

	 if (media >= 5 ){
		 System.out.println("O aluno está APROVADO com média "+ media);
	 } else {
		 System.out.println("O aluno está REPROVADO, sua média foi "+media);
	 }

	 System.out.println("Fim");

	}
}
