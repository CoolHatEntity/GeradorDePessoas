package com.geradorDePessoas.executavel;

import com.geradorDePessoas.geradores.GeradorJSON;
import com.geradorDePessoas.geradores.obj.Conta;
import com.geradorDePessoas.ui.InterFacePadrao;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Conta conta;
        InterFacePadrao interFacePadrao = new InterFacePadrao("Programa");

        /*Random rand = new Random();
        for(int i = 0; i < 10; i++){
            conta = new Conta();
            System.out.println(GeradorJSON.geraJsonConta(conta));
            System.out.println(GeradorJSON.geraJsonPessoa(conta.getCliente(), 2));
        }*/
    }
}
