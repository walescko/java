package com.company;

import java.util.Scanner;

public class menu {

    Scanner scan = new Scanner(System.in);
    WadaJu logo;

    {
        logo = new WadaJu();
    }

    protected int opcao;


    //Menu da Calculadora
    public void menuCalculadora() {

        logo.logo();
        System.out.println("------ MENU CALCULADORA ------");
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("Adição ..................... 1");
        System.out.println("Subtração .................. 2");
        System.out.println("Multiplicação .............. 3");
        System.out.println("Divisão .................... 4");
        System.out.println("Resto da Divisão ........... 5");
        System.out.print("Opção: ");
        opcao = scan.nextInt();

        dados dados = new dados();
        //operacoes operacoes = new operacoes();
        switch (opcao) {

            case 1:
                dados.dadosenter();
                dados.adicao();
                dados.dadosexit();
                break;
            case 2:
                dados.dadosenter();
                dados.subtracao();
                dados.dadosexit();
                break;
            case 3:
                dados.dadosenter();
                dados.multiplicacao();
                dados.dadosexit();
                break;
            case 4:
                dados.dadosenter();
                dados.divisao();
                break;
            case 5:
                dados.dadosenter();
                dados.restodivisao();
                break;
            default:
                System.out.println("Opcao inválida");
                break;
        }
    }

}
