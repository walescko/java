/*Até esse exercício estava usando a JVM do openJDK 11, porém nesse exercício
 * instalei o JAVA 16, e agora usando a JVM do Java 16, esse programa não rodou 
 * no Eclipse, somente no terminal e no intellij com Java 17.
 */

package com.company.Jandl_Java.Cap02;

import java.util.*;

public class P0216SwitchExpression {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Digite o número do mês[1-12]: ");
		int mes = s.nextInt();
		int ndias = switch(mes) {
		case 1, 3, 5, 7, 8, 10, 12 -> 31;
		case 4, 6, 9, 11 -> 30;
		default -> 28 + (Calendar.getInstance().get(Calendar.YEAR)%4==0 ? 1:0);
		};
		System.out.printf("Mes #%d tem %d dias. \n", mes, ndias);
	}
}
