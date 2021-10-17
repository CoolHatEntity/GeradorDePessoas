package com.geradorDePessoas.geradores;

import com.geradorDePessoas.geradores.obj.Cliente;
import com.geradorDePessoas.geradores.obj.Conta;

import java.util.Random;

public class GeradorJSON {
    public static String geraJsonPessoa(Cliente cliente, int op){
        //{"nome":"+nome[0]+","cpf":"+cpf+","nomeSocial":"nome[0]"}
        if(op == 1){
            return ("{\"nome\":\""+cliente.getNome()+"\",\"cpf\":\""+cliente.getCpf()+"\",\"nomeSocial\":\""+cliente.getNome_social()+"\"}");
        }else{
            return ("{\"nome\":\""+cliente.getNome()+" "+cliente.getSobrenome()+"\",\"cpf\":\""+cliente.getCpf()+"\",\"nomeSocial\":\""+cliente.getNome_social()+" "+cliente.getSobrenome()+"\"}");
        }
    }
    public static String geraJsonConta(Conta conta){
        //{
        //    "numeroConta": "056218",
        //    "numeroAgencia": "1657",
        //    "cliente": {
        //        "nome": "Alana",
        //        "cpf": "05339803363",
        //        "nomeSocial": "Alana"
        //    }
        //}

        return "{ \"numeroConta\": \""+conta.getNumConta()+"\"," +
                                "\"numeroAgencia\": \""+conta.getNumAgencia()+"\"," +
                                "\"cliente\":"+geraJsonPessoa(conta.getCliente(), 2)+""+
                              "}";
    }
}
