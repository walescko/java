package com.company.Jandl_Java.Cap04.geom;

public abstract class P0407Forma {
    private double medida[];

    public P0407Forma(int numMedidas) {
        medida = new double[numMedidas];
    }

    public double getMedida(int i) {
        if (i < 0 || i >= medida.length) {
            throw new RuntimeException("Numero invalido de medidas.");
        }
        return medida[i];
    }

    public int getNumMedidas() {
        return medida.length;
    }

    protected void setMedida(int i, double m) {
        if (i < 0 || i >= medida.length) {
            throw new RuntimeException("Numero invalido de medida.");
        }
        if (m < 0) {
            throw new RuntimeException("Medida #" + i + " invalida.");
        }
        medida[i] = m;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer(getClass().getName());
        sb.append("[medida: ");
        for (int i = 0; i < medida.length - 1; i++) {
            sb.append(medida[i]);
            sb.append(", ");
        }
        sb.append(medida[medida.length - 1]);
        sb.append("]");
        return sb.toString();

    }
        public abstract double area();

}
