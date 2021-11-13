package com.company.Jandl_Java.Cap03;

import java.lang.Exception;

public class P0312Retangulo {

    private double largura, altura;

    public P0312Retangulo() throws Exception {this (2,1);}

    public P0312Retangulo ( double largura, double altura) throws Exception {
        if (largura >=0 && altura >=0 ){
            this.largura = largura;
            this.altura = altura;
        } else {
            throw new Exception("Dimensões Inválidas.");
        }
    }

    public double getLargura(){ return largura; }
    public double getAltura(){ return altura; }

    public String toString(){
        return "P0312Retangulo [ largura =" + largura + ", altura = " + altura + "]";
    }
}
