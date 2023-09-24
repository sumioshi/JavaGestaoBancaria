package org.example;

public enum TipoTransacao {
    DEPOSITO(1),
    SAQUE(2),
    EMPRESTIMO(3),
    TRANSFERENCIA(4),
    INVESTIMENTO(5);

    private final int codigo;

    TipoTransacao(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }
}
