package com.geradorDePessoas.util;

import java.util.Objects;

public class Validador {
    public static boolean validaCPF(String cpf){
        //throw new IllegalArgumentException("CPF Invalido");
        return (cpf.length() == 11) && (calcVeracidade(cpf)) && cmpCPF(cpf);
    }
    public static boolean calcVeracidade(String cpf){
        boolean output = false;
        int testCounter = 0;
        int sum = 0;
        int[] numCPF = new int[(cpf.length())];

        if(cpf.length() < 11){
            return false;
        }

        for(int i = 0; i < cpf.length(); i++){
            numCPF[i] = Integer.parseInt(String.valueOf(cpf.charAt(i)));
            sum = sum + numCPF[i];
        }


        //Verifica por comparar os números da soma dos números individuais do cpf
        int cmpCounter = 1;
        for(int i = 1; i < (Integer.toString(sum)).length(); i++){
            if((Integer.toString(sum)).length() > 1){
                if(Integer.toString(sum).charAt(i) == Integer.toString(sum).charAt(i - 1)){
                    cmpCounter++;
                }else{
                    break;
                }
            }
        }

        //Verifica por calcular os dígitos verificadores
        int[] peso = {1,2,3,4,5,6,7,8,9};
        int[] digito = new int[2];
        int sumD = 0;
        int sumD2 = 0;
        for(int i = 0; i < 9; i++){
            sumD = sumD + (numCPF[i] * peso[i]);
        }
        if((sumD % 11 ) > 9){
            char temp = (Integer.toString(sumD % 11 ).charAt(1));
            digito[0] =  Character.getNumericValue(Integer.toString(sumD % 11).charAt(1));
        }else{
            digito[0] = sumD % 11;
        }
        for(int i = 1; i < 10; i++){
            sumD2 = sumD2 + (numCPF[i] * peso[i - 1]);
        }
        if((sumD2 % 11 ) > 9){
            digito[1] =  Character.getNumericValue(Integer.toString(sumD2 % 11).charAt(1));
        }else{
            digito[1] = sumD2 % 11;
        }
        if((digito[0] == numCPF[9]) && digito[1] == numCPF[10]){
            //System.out.print("Neato");
            output = true;
        }

        return output;
    }
    public static boolean cmpCPF(String cpf){
        String[] base = {"00000000000",
                "11111111111",
                "22222222222",
                "33333333333",
                "44444444444",
                "55555555555",
                "66666666666",
                "77777777777",
                "88888888888",
                "99999999999"};
        for (String s : base) {
            if (Objects.equals(cpf, s)) {
                return false;
            }
        }
        return true;
    }
}
