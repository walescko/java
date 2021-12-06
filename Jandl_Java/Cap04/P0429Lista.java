package com.company.Jandl_Java.Cap04;

import java.util.Scanner;

public class P0429Lista {

    public static void main(String[] args){
        Nodo lista = null;
        Scanner sc = new Scanner(System.in);

        String aux;

        do {
            System.out.println("Digite uma palavra (. encerra): ");
            aux = sc.next();
            if (!aux.equals(".")) {
                Nodo novo = new Nodo(aux, lista);
                lista = novo;
            }
        } while (!aux.equals("."));
        sc.close();

        System.out.println("Lista de Palavras:\n");
        Nodo nodo = lista;

        while (nodo!=null){
            System.out.print(nodo.nome + " ");
            nodo = nodo.proximo;
        }
        System.out.println("<.>");
    }

    private static class Nodo{

        public String nome;
        public Nodo proximo;

        @SuppressWarnings("unused")
        public Nodo(){
            this(null, null);
        }
        public Nodo(String n, Nodo p){
            nome = n;
            proximo = p;
        }
    }
}
