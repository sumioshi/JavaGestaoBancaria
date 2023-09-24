package org.example;

public class ContaPoupanca extends ContaBancaria {
    private static final double SALDO_MINIMO_POUPANCA = 50.00;

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (saldo - valor >= SALDO_MINIMO_POUPANCA) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente para saque.");
        }
    }

    @Override
    public void emitirExtrato() {
        System.out.println("Extrato da Conta Poupança - Saldo: R$" + saldo);
    }
}
