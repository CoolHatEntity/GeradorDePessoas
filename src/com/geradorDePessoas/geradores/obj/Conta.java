package com.geradorDePessoas.geradores.obj;

import com.geradorDePessoas.geradores.GeradorCod;

public class Conta {
    private Cliente cliente;
    private String numConta;
    private String numAgencia;

    public Conta(){
        this.setCliente(new Cliente());
        this.setNumConta(GeradorCod.geraCod(5));
        this.setNumAgencia(GeradorCod.geraCod(7));
    }

    public Conta(Cliente cliente, String numConta, String numAgencia) {
        this.setCliente(cliente);
        this.setNumConta(numConta);
        this.setNumAgencia(numAgencia);
    }

    public void atualizaNumConta(){
        setNumConta(GeradorCod.geraCod(5));
    }

    public void atualizaNumAgencia(){
        setNumAgencia(GeradorCod.geraCod(7));
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getNumAgencia() {
        return numAgencia;
    }

    public void setNumAgencia(String numAgencia) {
        this.numAgencia = numAgencia;
    }
}
