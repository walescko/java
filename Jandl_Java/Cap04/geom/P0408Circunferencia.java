package com.company.Jandl_Java.Cap04.geom;

import static java.lang.Math.*;

public class P0408Circunferencia extends P0407Forma{

    public P0408Circunferencia(double raio) {
        super(1);
        setRaio(raio);
    }

    @Override
    public double area(){
        return PI*Math.pow(getMedida(0), 2);
    }

    public void setRaio(double raio){
        setMedida(0, raio);
    }
}
