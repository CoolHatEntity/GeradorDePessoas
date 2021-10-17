package com.geradorDePessoas.geradores;

import java.util.Random;

public class GeradorCod {
    public static String geraCod(int size){
        Random rand = new Random();
        StringBuilder cod = new StringBuilder();
        while (cod.length() < size){
            cod.append((rand.nextInt(10)));
        }
        return cod.toString();
    }
}
