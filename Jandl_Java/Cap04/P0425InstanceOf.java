package com.company.Jandl_Java.Cap04;

import com.company.Jandl_Java.Cap04.geom.P0407Forma;
import com.company.Jandl_Java.Cap04.geom.P0409Retangulo;
import com.company.Jandl_Java.Cap04.geom.P0410Triangulo;

public class P0425InstanceOf {

    public static void main(String [] args){
        Object  obj = new P0410Triangulo(1.5,1.5,2.0);
        System.out.println(obj);

        System.out.printf("%s instancia de P00410Triangulo.\n", obj instanceof P0410Triangulo ? "Eh": "Nao eh");
        System.out.printf("%s instancia de P0409Retangulo.\n", obj instanceof P0409Retangulo ? "Eh":"Nao eh");
        System.out.printf("%s instancia de P0407Forma.\n", obj instanceof P0407Forma ? "Eh":"Nao eh");
        System.out.printf("%s instancia de Object.\n", obj instanceof Object ? "Eh": "Nao Eh");
        System.out.printf("%s instancia de Runnable.\n", obj instanceof Runnable ? "Eh" : "Nao Eh");
    }
}
