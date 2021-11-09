public class P0232MatrizTriang {
    public static void main(String[] args){

        double[][] m;
        m = new double[4][];
        int aux = 0;

        for (int l = 0 ; l < m.length ; l++){
            m[l] = new double[l+1];
            for (int c = 0 ; c <m[l].length ; c++){
                m[l][c] = aux++;
            }
        }
        for (int l = 0 ; l < m.length ; l++){
            for (int c = 0 ; c < m[l].length ; c++){
                System.out.print(m[l][c] + "\t");
            }
        System.out.println();
        }
    }
}