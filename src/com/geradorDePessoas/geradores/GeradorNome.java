package com.geradorDePessoas.geradores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class GeradorNome {
    private List<String> nome = new ArrayList<String>();
    private List<String> sobrenome = new ArrayList<String>();

    public String[] geraNome(){
        Random rand = new Random();
        int index = 0;

        if(getNome().size() == 0){
            addNome(getTesteNome());
        }
        if(getSobrenome().size() == 0){
            addSobrenome(getTesteSobrenome());
        }

        return new String[]{getNome().get(rand.nextInt(getNome().size())),
                                getSobrenome().get(rand.nextInt(getSobrenome().size()))};
    }
    public void addNome(String nameInput){
        getNome().add(nameInput);
    }
    private void addNome(String[] nameInput){
        Collections.addAll(getNome(), nameInput);
    }

    public void addSobrenome(String[] sobrenameInput){
        Collections.addAll(getSobrenome(), sobrenameInput);
    }


    private static String[] getTesteSobrenome() {
        return new String[]{"Barbosa",
                "Rezende",
                "Olivia",
                "Lucca",
                "Maria",
                "Eduardo",
                "Fogaça",
                "Vinicius",
                "Nina",
                "Henrique"};
    }

    private static String[] getTesteNome() {
        return new String[]{"Henrique",
                "Luiz",
                "Bruno",
                "Francisco",
                "Rebeca",
                "Beatriz",
                "Maitê",
                "Fernanda",
                "Lavínia",
                "Valentina"};
    }

    public List<String> getNome() {
        return nome;
    }

    public List<String> getSobrenome() {
        return sobrenome;
    }
}
