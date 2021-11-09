package JandlJrCap03;

import static java.lang.Math.*;

public class P0322ComImportStatic {

    public static void main(String[] args){
        double raio = Double.parseDouble(args[0]);
        double perim = 2*PI*raio;
        System.out.printf("Raio = "+ raio + ", perimetro =" + perim);
    }
}
