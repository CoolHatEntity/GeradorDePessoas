package com.geradorDePessoas.geradores;

import com.geradorDePessoas.util.FileManager;

import java.util.*;

public class GeradorNome {
    private final List<String> nome;
    private final List<String> sobrenome;

    public GeradorNome(){
        sobrenome = getList("Sobrenomes");
        nome = getList("Nomes");
    }

    public String[] geraNome(){
        Random rand = new Random();
        int index = 0;

        return new String[]{getNome().get(rand.nextInt(getNome().size())),
                                getSobrenome().get(rand.nextInt(getSobrenome().size()))};
    }
    public void addEntry(String nameInput, int op){
        Set<String> comp;
        if(op == 1){comp = new HashSet<>(nome);
        }else{comp = new HashSet<>(sobrenome);}

        if(!comp.add(nameInput)){
            System.out.println("==>Nome já existente");
        }else{
            if(op == 1){
                nome.add(nameInput);
                FileManager.fileWriter("Nomes", nome);
            }else{
                sobrenome.add(nameInput);
                FileManager.fileWriter("Sobrenomes", sobrenome);
            }
        }

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

    public List<String> getList(String fileName){
        List<String> returnList;

        returnList = FileManager.fileReader(fileName);

        return returnList;
    }

    public List<String> getNome() {
        return nome;
    }

    public List<String> getSobrenome() {
        return sobrenome;
    }
}
