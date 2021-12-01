package com.company.Jandl_Java.Cap04.engine;

public class P0415MensagemEditavel extends P0413Mensagem implements P0411Imprimivel, P0412Editavel{

    public P0415MensagemEditavel(String conteudo){
        super(conteudo);
    }
    public void imprimir(){
        imprimirNoConsole();
    }

    public void imprimirNoConsole(){
        System.out.println(P0411Imprimivel.INICIO +  getConteudo() + P0411Imprimivel.FIM);
    }

    public void editar (String conteudo){
        setConteudo(conteudo);
    }
}
