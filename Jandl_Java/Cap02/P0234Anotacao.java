package com.company.Jandl_Java.Cap02;

public class P0234Anotacao {

    public static void main(String[] args){

        System.out.println("Valor aleatório: " + Anotacoes.random());

    }
}

class Anotacoes{
    @Deprecated
    public static double random(){return Math.random();}
    @Override
    @SuppressWarnings("unused")
    public String toString(){
        int x;
        return "ExemploAnotação";
    }
}