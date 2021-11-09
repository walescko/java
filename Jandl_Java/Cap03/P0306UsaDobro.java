package JandlJrCap03;

public class P0306UsaDobro {

    @SuppressWarnings("static-acess")
    public static void main(String[] args){

        System.out.println("Número de Instancias de Dobro = " + P0305Dobro.getInstancias());

        int x = 8 ;

        System.out.println("Instanciando objeto Dobro");
        P0305Dobro d = new P0305Dobro();

        System.out.println("Número de instancias de Dobro = " + d.getInstancias());
        System.out.println("O dobro de " + x + " = " + d.dobro(x));
        System.out.println("Ultimo valor usado: " + d.ultimoValor);

    }
}
