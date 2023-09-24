package org.example;

public class Cliente {
    private String nome;
    private ContaBancaria conta;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ContaBancaria getConta() {
        return conta;
    }

    public void setConta(ContaBancaria conta) {
        this.conta = conta;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}

