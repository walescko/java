import java.io.*;
import java.util.Scanner;
import java.text.DecimalFormat;

class Cap05_Ex01 {

	public static void main(String args[]){

	float MDG[] = new float[8];
	float soma =0, MEDIA;
	int I;
	DecimalFormat df = new DecimalFormat("0.00");
	Scanner s = new Scanner(System.in);

	System.out.println();

	for (I = 0; I <=7;I++){
		System.out.print("Nota do "+(I+1)+"º aluno: ");
		MDG[I] = s.nextFloat();
		soma += MDG[I];
	}

	MEDIA = soma/8;

	System.out.println();
	System.out.println("Média Geral = "+df.format(MEDIA));
	System.out.println("Fim");


	}
}
