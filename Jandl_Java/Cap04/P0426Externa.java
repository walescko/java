package com.company.Jandl_Java.Cap04;

public class P0426Externa {
    private int valor;

    public P0426Externa(int valor){
        this.valor = valor;
    }

    public class Aninhada{
        public void exibir(){
            System.out.printf("valor = " + valor);
        }
    }
}
