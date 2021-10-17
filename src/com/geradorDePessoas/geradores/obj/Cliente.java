package com.geradorDePessoas.geradores.obj;

import com.geradorDePessoas.geradores.GeradorNome;

import static com.geradorDePessoas.geradores.GeradorCPF.geraCpf;

public class Cliente {
    private String nome;
    private String sobrenome;
    private String nome_social;
    private String cpf;

    GeradorNome gera =  new GeradorNome();

    public Cliente(){
        setNome(gera.geraNome()[0]);
        setSobrenome(gera.geraNome()[1]);
        setNome_social(gera.geraNome()[0]);
        setCpf(geraCpf());
    }

    public Cliente(String nome, String sobrenome,String nome_social, String cpf) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        this.setNome_social(nome_social);
        this.setCpf(cpf);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome_social() {
        return nome_social;
    }

    public void setNome_social(String nome_social) {
        this.nome_social = nome_social;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void atualizaCpf(){
        setCpf(geraCpf());
    }
    public void atualizaNome(){
        setNome(gera.geraNome()[0]);
    }
    public void atualizaSobrenome(){
        setSobrenome(gera.geraNome()[1]);
    }
    public void atualizaNomeSocial(){
        setNome_social(gera.geraNome()[0]);
    }


}
