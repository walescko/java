package com.company.Jandl_Java.Cap03;
public class P0305Dobro {

    private static int instancias = 0;

    //armazena o último valor usado por método dobro(int)
    public int ultimoValor;
    //constructor que atualiza o número de instâncias
    public P0305Dobro(){ instancias++;}

    public static int getInstancias() {return instancias;}

    //calcula o dobro
    public int dobro (int valor) {
        ultimoValor = valor;
        return 2*valor;
    }
}
