package com.geradorDePessoas.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileManager {
    public static boolean fileCreator(String fileName){
        try{
            File arquivo = new File(fileName + ".txt");
            if(arquivo.createNewFile()){
                System.out.println("|==>Arquivo criado com sucesso!");
                System.out.println("|==>"+arquivo.getName());
                System.out.println("|==>"+arquivo.getPath());
                return false;
            }else{
                System.out.println("|==>Arquivo já existente");
                return true;
            }
        }catch (IOException e){
            System.out.println("Um erro foi encontrado");
            e.printStackTrace();
        }
        return false;
    }
    public static void fileWriter(String fileName, List<String> listNames){
        try{
            FileWriter arquivo = new FileWriter(fileName + ".txt");
            if(fileCreator(fileName)){
                arquivo.append(String.valueOf(listNames));
            }else{
                arquivo.write(String.valueOf(listNames));
            }
            arquivo.close();
        }catch (IOException e){
            System.out.println("Um erro foi encontrado");
            e.printStackTrace();
        }
    }
    public List<String> fileReader(String fileName){
        /*
        TODO Implementar a capacidade de ler os nomes de um arquivo .txt
         e passar para uma List<String>
        */
        return null;
    }
}
