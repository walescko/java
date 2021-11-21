package com.company.Jandl_Java.Cap03.exercicios.Ex06;



public class Circulo {

    private Double raio;
    private Double pi = 3.1416;

    public Circulo(Double raio) {
        this.raio = raio;
    }

    public Circulo() {
    }

    public Double Area(Double raio){
        Double area = pi*raio*raio;
        return area;
    }

    public void Saida(Double raio) {
        Double area = Area(raio);
        System.out.println("A area da circunferencia é A = "+  area + "m².");
    }
}
