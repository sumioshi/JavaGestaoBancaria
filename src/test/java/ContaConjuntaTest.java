import org.example.Cliente;
import org.example.ContaConjunta;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaConjuntaTest {

    @Test
    void depositar_deveAumentarSaldo_quandoValorPositivo() {
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
        ContaConjunta contaConjunta = new ContaConjunta(cliente1, cliente2);
        contaConjunta.depositar(400.0);
        assertEquals(400.0, contaConjunta.getSaldo(), 0.01);
    }

    @Test
    void sacar_deveDiminuirSaldo_quandoValorMenorQueSaldo() {
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
        ContaConjunta contaConjunta = new ContaConjunta(cliente1, cliente2);
        contaConjunta.depositar(400.0);
        contaConjunta.sacar(100.0);
        assertEquals(300.0, contaConjunta.getSaldo(), 0.01);
    }

    @Test
    void sacar_naoDeveDiminuirSaldo_quandoValorMaiorQueSaldo() {
        Cliente cliente1 = new Cliente("Cliente 1");
        Cliente cliente2 = new Cliente("Cliente 2");
        ContaConjunta contaConjunta = new ContaConjunta(cliente1, cliente2);
        contaConjunta.depositar(400.0);
        contaConjunta.sacar(500.0);
        assertEquals(400.0, contaConjunta.getSaldo(), 0.01);
    }
}
