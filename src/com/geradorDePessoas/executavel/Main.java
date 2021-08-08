package com.geradorDePessoas.executavel;

import com.geradorDePessoas.geradores.GeradorCPF;
import com.geradorDePessoas.geradores.GeradorNome;
import com.geradorDePessoas.util.FileManager;

public class Main {

    public static void main(String[] args) {
	// write your code here
        GeradorNome gera =  new GeradorNome();
        String[] nome;

        for(int i = 0; i < 10; i++){
            nome = gera.geraNome();
            System.out.println(nome[0] + " " + nome[1]);
        }
        gera.addNome("Carlinhos");
        for(int i = 0; i < 10; i++){
            System.out.println(GeradorCPF.geraCpf());
        }
        FileManager.fileCreator("Arquivo");
        FileManager.fileWriter("Arquivo", gera.getNome());
    }
}
