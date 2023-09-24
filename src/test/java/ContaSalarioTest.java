import org.example.ContaSalario;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaSalarioTest {

    @Test
    void depositar_deveAumentarSaldo_quandoValorPositivo() {
        ContaSalario conta = new ContaSalario();
        conta.depositar(200.0);
        assertEquals(200.0, conta.getSaldo(), 0.01);
    }

    @Test
    void sacar_deveDiminuirSaldo_quandoValorMenorQueSaldo() {
        ContaSalario conta = new ContaSalario();
        conta.depositar(200.0);
        conta.sacar(50.0);
        assertEquals(150.0, conta.getSaldo(), 0.01);
    }

    @Test
    void sacar_naoDeveDiminuirSaldo_quandoValorMaiorQueSaldo() {
        ContaSalario conta = new ContaSalario();
        conta.depositar(200.0);
        conta.sacar(300.0);
        assertEquals(200.0, conta.getSaldo(), 0.01);
    }
}
