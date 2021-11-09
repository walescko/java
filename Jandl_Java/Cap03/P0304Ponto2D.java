package JandlJrCap03;

public class P0304Ponto2D {

    public double x,y;

    //constructor default: point def origin
    public P0304Ponto2D(){
        x = 0; y = 0;
    }
     //constructor parametrized - point instanciad
    public P0304Ponto2D(double px, double py){
        x = px; y = py;
    }

    //distancia entre a origem e o ponto dado
    public double distancia (P0304Ponto2D p){
        return Math.sqrt(Math.pow(x - p.x,2) + Math.pow(y - p.y, 2));
    }
    //representação textual dos objetos
    public String toString(){
        return " P0304Ponto2D [ x = " + x + ", y = " + y + "]";
    }
}
