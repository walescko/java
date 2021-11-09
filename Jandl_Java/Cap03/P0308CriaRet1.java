package JandlJrCap03;

public class P0308CriaRet1 {

    public static void main(String[] args){

        double larg = 5; // Double.parseDouble(args[0]);
        double alt = 6; //Double.parseDouble(args[1]);

        P0307Retangulo retangulo = new P0307Retangulo(larg, alt);

        System.out.println("Retangulo [" + retangulo.getLargura() + " x " + retangulo.getAltura() + " ]");

    }
}
