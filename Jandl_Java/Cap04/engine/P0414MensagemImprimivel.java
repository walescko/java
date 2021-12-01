package com.company.Jandl_Java.Cap04.engine;

public class P0414MensagemImprimivel extends P0413Mensagem implements P0411Imprimivel {

    public P0414MensagemImprimivel(String conteudo){
        super(conteudo);
    }

    public void imprimir(){
        imprimirNoConsole();
    }

    public void imprimirNoConsole(){
        System.out.println(P0411Imprimivel.INICIO);
        System.out.println(getConteudo());
        System.out.println(P0411Imprimivel.FIM);
    }
}
