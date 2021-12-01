package com.company.Jandl_Java.Cap04.engine;

public interface P0416Editavel2 extends P0412Editavel{

    static String transformar(String conteudo, int shift){
        char[] array = conteudo.toCharArray();
        for (int p=0; p<array.length; p++){
            array[p] = (char)((array[p] + shift)>122 ? 65 + shift++ : array[p] + shift);
        }
        return new String(array);
    }

    public void anexar (String conteudo);
}
