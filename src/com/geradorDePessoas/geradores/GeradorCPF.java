package com.geradorDePessoas.geradores;

import java.util.Random;

public class GeradorCPF {
    public static String geraCpf(){
        Random rand = new Random();
        StringBuilder output =  new StringBuilder();
        int[] intOutput = new int[11];

        //Gera os primeiros 9 dígitos
        for(int i = 0; i < 9; i++){
            intOutput[i] = rand.nextInt(10);
        }

        int sum = 0;
        //Gera o primeiro dígito verificador
        for(int i = 0; i < 9; i++){
            sum = sum + (intOutput[i] * (i + 1));
        }
        if(sum % 11 > 9){
            intOutput[9] =  Character.getNumericValue(Integer.toString(sum % 11).charAt(1));
        }else{
            intOutput[9] = sum % 11;
        }

        //Gera o segundo dígito verificador
        sum = 0;
        for(int i = 0; i < 9; i++){
            sum = sum + (intOutput[i + 1] * (i + 1));
        }
        if(sum % 11 > 9){
            intOutput[10] =  Character.getNumericValue(Integer.toString(sum % 11).charAt(1));
        }else{
            intOutput[10] = sum % 11;
        }
        for(int i = 0; i < 11; i++){
            output.append(intOutput[i]);
        }
        return output.toString();
    }
}
