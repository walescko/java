package JandlJrCap03;

import java.lang.Math;

public class P0321SemImportStatic {
    public static void main(String[] args){

        double raio = Double.parseDouble(args[0]);
        double perim = 2*Math.PI *raio;
        System.out.println("raio = " + raio + ", perimetro = " + perim);
    }
}
