package org.example;

public abstract class ContaBancaria {
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }

    public abstract void depositar(double valor);

    public abstract void sacar(double valor);

    public abstract void emitirExtrato();
}
