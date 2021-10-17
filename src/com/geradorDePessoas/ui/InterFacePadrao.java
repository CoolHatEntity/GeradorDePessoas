package com.geradorDePessoas.ui;

import com.geradorDePessoas.geradores.obj.Cliente;
import com.geradorDePessoas.geradores.obj.Conta;

import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

import static com.geradorDePessoas.geradores.GeradorJSON.geraJsonConta;
import static com.geradorDePessoas.geradores.GeradorJSON.geraJsonPessoa;

public class InterFacePadrao extends JFrame{
    private JTabbedPane tabbedPane1;
    private JPanel panel1;
    private JTextField campoSobrenomeCliente;
    private JTextField campoNomeSocialCliente;
    private JTextField campoCpfCliente;
    private JTextField campoJsonCliente;
    private JButton copiarButton;
    private JButton gerarNovoButton;
    private JRadioButton manterNomeRadioButton;
    private JRadioButton manterNomeSocialRadioButton;
    private JRadioButton manterSobrenomeRadioButton;
    private JRadioButton manterCPFRadioButton;
    private JTextField campoNumeroConta;
    private JTextField campoNumeroAgencia;
    private JTextField campoNomeConta;
    private JTextField campoSobrenomeConta01;
    private JTextField campoNomeSocialConta;
    private JTextField campoSobrenomeConta02;
    private JTextField campoCpfConta;
    private JTextField campoJsonConta;
    private JButton copiarButton1;
    private JButton gerarNovoButton1;
    private JRadioButton manterRadioButton1;
    private JRadioButton manterRadioButton;
    private JTextField campoNomeCliente;

    public void interFacePadrao() {
        Cliente cliente = new Cliente();
        Conta conta = new Conta();
        conta.setCliente(cliente);

        copiarButton.addActionListener(e -> {
            Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
            clip.setContents(new StringSelection(campoJsonCliente.getText()), null);
            System.out.println("|=| Campo Json: " + campoJsonCliente.getText());
        });
        gerarNovoButton.addActionListener(e -> {
            String nome = cliente.getNome();
            String nomeSocial = cliente.getNome_social();
            String cpf = cliente.getCpf();
            String sobrenome = cliente.getSobrenome();

            System.out.println(geraJsonPessoa(cliente, 1));

            cliente.atualizaCpf();
            cliente.atualizaNome();
            cliente.atualizaNomeSocial();
            cliente.atualizaSobrenome();

            if(manterNomeRadioButton.isSelected()){
                cliente.setNome(nome);
            }
            if(manterNomeSocialRadioButton.isSelected()){
                cliente.setNome_social(nomeSocial);
            }
            if(manterCPFRadioButton.isSelected()){
                cliente.setCpf(cpf);
            }
            if(manterSobrenomeRadioButton.isSelected()){
                cliente.setSobrenome(sobrenome);
            }

            campoCpfCliente.setText(cliente.getCpf());
            campoNomeCliente.setText(cliente.getNome());
            campoNomeSocialCliente.setText(cliente.getNome_social());
            campoSobrenomeCliente.setText(cliente.getSobrenome());

            campoJsonCliente.setText(geraJsonPessoa(cliente, 2));
        });
        gerarNovoButton1.addActionListener(e -> {
            String numAgencia = conta.getNumAgencia();
            String numConta = conta.getNumConta();

            String nome = conta.getCliente().getNome();
            String nomeSocial = conta.getCliente().getNome_social();
            String cpf = conta.getCliente().getCpf();
            String sobrenome = conta.getCliente().getSobrenome();

            System.out.println(geraJsonConta(conta));

            conta.atualizaNumConta();
            conta.atualizaNumAgencia();

            if(manterRadioButton1.isSelected()){
                conta.setNumConta(numConta);
            }

            if(manterRadioButton.isSelected()){
                conta.setNumAgencia(numAgencia);
            }

            campoNomeConta.setText(nome);
            campoNomeSocialConta.setText(nomeSocial);
            campoSobrenomeConta01.setText(sobrenome);
            campoSobrenomeConta02.setText(sobrenome);
            campoCpfConta.setText(cpf);
            campoNumeroConta.setText(numConta);
            campoNumeroAgencia.setText(numAgencia);

            campoJsonConta.setText(geraJsonConta(conta));
        });
        copiarButton1.addActionListener(e -> {
            Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
            clip.setContents(new StringSelection(campoJsonConta.getText()), null);
            System.out.println("|=| Campo Json: "+ campoJsonConta.getText());
        });

    }
    public InterFacePadrao(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(panel1);
        this.pack();
        this.setVisible(true);

        interFacePadrao();
    }
}
