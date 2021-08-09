package com.geradorDePessoas.executavel;

import com.geradorDePessoas.geradores.GeradorCPF;
import com.geradorDePessoas.geradores.GeradorNome;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
	// write your code here
        GeradorNome gera =  new GeradorNome();
        String[] nome;

        for(int i = 0; i < 10; i++){
            nome = gera.geraNome();
            System.out.println(nome[0] + " " + nome[1]);
        }
        gera.addEntry("Yndaia", 1);
        for(int i = 0; i < 10; i++){
            System.out.println(GeradorCPF.geraCpf());
        }
        File test;
        for(int i = 0; i < 10; i++){
            test = new File("arquivo" + i + ".txt");
            test.createNewFile();
        }
    }
}
