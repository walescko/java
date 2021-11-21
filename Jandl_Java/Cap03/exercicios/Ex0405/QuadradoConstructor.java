package com.company.Jandl_Java.Cap03.exercicios.Ex0405;

public class QuadradoConstructor {
    private double lado;

    public QuadradoConstructor(double lado) {
        this.lado = lado;
    }

    public QuadradoConstructor(){
        this.lado = lado;
    }

    public void setLado(double l){
        if (l < 0 ) throw new RuntimeException("Lado invalido");
        lado = l;
    }
    public double area() { return lado*lado;}
}
