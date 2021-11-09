import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

class consumo {
	
	public static void main(String args[]){
	  
         float velocidade;
	 float tempo;
	 float distancia;
	 float consumo;
	 float litro;

	DecimalFormat df = new DecimalFormat();
	Scanner s = new Scanner(System.in);

	System.out.println("WADAJU SOFTWARE SOLUTIONS");
	System.out.println("Exercício 1 Cap 3 - Consumo de litros");

	System.out.print("Quanto tempo durou a viagem, em horas? ");
	tempo = s.nextFloat();

	System.out.print("Qual a velocidade média da viagem, em km/h? ");
	velocidade = s.nextFloat();

	litro = 12; 
	distancia = velocidade * tempo;
	consumo = distancia / litro;
	
	System.out.println();
	df.applyPattern("0.00");
	System.out.println("Velocidade média Vm = " + df.format(velocidade) + " km/h");
	System.out.println("Tempo de viagem t = " + df.format(tempo) + " h");
	System.out.println("A distância percorrida durante a viagem foi d = " + df.format(distancia) + " km");
	System.out.println("O Consumo de combustível foi de " +df.format(consumo) + " L\n");
	System.out.println("Fim do programa");
}}
