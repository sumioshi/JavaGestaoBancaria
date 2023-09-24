package org.example;

public class ContaConjunta extends ContaBancaria {
    private Cliente[] titulares = new Cliente[2];

    public ContaConjunta(Cliente titular1, Cliente titular2) {
        titulares[0] = titular1;
        titulares[1] = titular2;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (saldo - valor >= 0) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void emitirExtrato() {
        System.out.println("Extrato da Conta Conjunta - Saldo: R$" + saldo);
    }
}

