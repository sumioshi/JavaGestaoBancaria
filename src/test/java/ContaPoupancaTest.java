import org.example.ContaPoupanca;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaPoupancaTest {

    @Test
    void depositar_deveAumentarSaldo_quandoValorPositivo() {
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(100.0);
        assertEquals(100.0, conta.getSaldo(), 0.01);
    }

    @Test
    void sacar_deveDiminuirSaldo_quandoValorMenorQueSaldo() {
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(100.0);
        conta.sacar(50.0);
        assertEquals(50.0, conta.getSaldo(), 0.01);
    }

    @Test
    void sacar_naoDeveDiminuirSaldo_quandoValorMaiorQueSaldo() {
        ContaPoupanca conta = new ContaPoupanca();
        conta.depositar(100.0);
        conta.sacar(200.0);
        assertEquals(100.0, conta.getSaldo(), 0.01);
    }
}
