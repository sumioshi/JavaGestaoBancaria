package org.example;

public class ContaCorrente extends ContaBancaria {
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
        System.out.println("Extrato da Conta Corrente - Saldo: R$" + saldo);
    }
}

