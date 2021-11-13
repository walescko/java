package com.company.Jandl_Java.Cap02;

import java.io.*;

public class P0225TryWithResources {

	public static void main(String[] args) {
		
		try (InputStream recurso = new FileInputStream(args[0]);){
			System.out.println("Arquivo " + args[0] + " aberto.");
		} catch (IOException e1) {
			System.out.println(e1);
		}
		System.out.println("Arquivo " + args[0] + " fechado.");
	
	}
}