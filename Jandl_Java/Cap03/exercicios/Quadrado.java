package com.company.Jandl_Java.Cap03.exercicios;

public class Quadrado {

    private double lado;

    public void setLado(double l){
        if (l < 0 ) throw new RuntimeException("Lado invalido");
        lado = l;
    }
    public double area() { return lado*lado;}
}

