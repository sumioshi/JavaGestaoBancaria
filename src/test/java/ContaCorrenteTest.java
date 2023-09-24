import org.example.ContaCorrente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

    @Test
    void depositar_deveAumentarSaldo_quandoValorPositivo() {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(300.0);
        assertEquals(300.0, conta.getSaldo(), 0.01);
    }

    @Test
    void sacar_deveDiminuirSaldo_quandoValorMenorQueSaldo() {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(300.0);
        conta.sacar(100.0);
        assertEquals(200.0, conta.getSaldo(), 0.01);
    }

    @Test
    void sacar_naoDeveDiminuirSaldo_quandoValorMaiorQueSaldo() {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(300.0);
        conta.sacar(400.0);
        assertEquals(300.0, conta.getSaldo(), 0.01);
    }
}
