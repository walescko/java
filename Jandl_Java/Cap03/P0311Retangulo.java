package JandlJrCap03;

public class P0311Retangulo {
    private double largura, altura;

    public P0311Retangulo(){this (2, 1);}

    public P0311Retangulo(double largura, double altura){
        if (largura >= 0 && altura >= 0) {
            this.largura = largura;
            this.altura = altura;
        } else {
            throw new RuntimeException("Dimensões Invalidas");
        }
    }

    public double getLargura(){ return largura;}
    public double getAltura(){ return altura;}

    @Override
    public String toString(){
        return "P0311Retangulo [ largura = " + largura + ", altura = " + altura + "]";
    }
}
