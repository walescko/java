package com.company.Jandl_Java.Cap04;

import com.company.Jandl_Java.Cap04.geom.P0407Forma;
import com.company.Jandl_Java.Cap04.geom.P0408Circunferencia;
import com.company.Jandl_Java.Cap04.geom.P0409Retangulo;
import com.company.Jandl_Java.Cap04.geom.P0410Triangulo;

public class P0424TestaFormas {

    public static void main(String[] args){

        P0408Circunferencia c = new P0408Circunferencia(1.5);
        System.out.println("areaCirc = " + c.area());

        P0409Retangulo r = new P0409Retangulo(2.5, 4.0);
        System.out.println("areaRet = " + r.area());

        P0407Forma formas[] = new P0407Forma[3];
        forma[0] = c;
        forma[1] = r;
        forma[2] = new P0410Triangulo(1.0,2.0,2.0);
        for (int i = 0 ; i < formas.length; i++){
            System.out.println(forma[i]);
            System.out.println("area = " + formas[i].area());
        }
    }
}
