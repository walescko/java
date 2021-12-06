package com.company.Jandl_Java.Cap04;

public class P0427EmMetodo {

    public static void main(String[] args) {

        Extra extra = new Extra();
        extra.info();
        extra.operacao(33);
        extra.info();
    }
}

    class Extra{
        private int total = 0;
        public void operacao(int v){
            class Somador{
                public void soma (int v){
                    total += v;
                }
            }
            Somador s = new Somador();
            s.soma(v);
        }
        public void info(){
            System.out.println("total = " + total);
        }
    }


