package com.geradorDePessoas.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileManager {
    public static boolean fileCreator(String fileName){
        try{
            File arquivo = new File(fileName + ".txt");
            if(arquivo.createNewFile()){
                System.out.println("|==>Arquivo criado com sucesso!");
                System.out.println("|==>"+arquivo.getName());
                System.out.println("|==>"+arquivo.getAbsolutePath());
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
            for (String listName : listNames) {
                arquivo.write(listName);
                arquivo.write("\n");
            }
            arquivo.close();
        }catch (IOException e){
            System.out.println("Um erro foi encontrado");
            e.printStackTrace();
        }
    }

    public static List<String> fileReader(String fileName){
        List<String> listNames = new ArrayList<>();
        try{
            File arquivo = new File(fileName + ".txt");
            Scanner scan = new Scanner(arquivo);
            while (scan.hasNextLine()){
                listNames.add(scan.nextLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("Erro encontrado");
            e.printStackTrace();
        }
        return listNames;
    }
}
