import org.example.TipoTransacao;
import org.example.Transacao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TransacaoTest {

    @Test
    void getTipo_deveRetornarTipoCorreto() {
        Transacao transacao = new Transacao(TipoTransacao.DEPOSITO, 100.0);
        assertEquals(TipoTransacao.DEPOSITO, transacao.getTipo());
    }

    @Test
    void setTipo_deveAlterarTipoCorretamente() {
        Transacao transacao = new Transacao(TipoTransacao.SAQUE, 50.0);
        transacao.setTipo(TipoTransacao.TRANSFERENCIA);
        assertEquals(TipoTransacao.TRANSFERENCIA, transacao.getTipo());
    }

    @Test
    void getValor_deveRetornarValorCorreto() {
        Transacao transacao = new Transacao(TipoTransacao.SAQUE, 50.0);
        assertEquals(50.0, transacao.getValor(), 0.01);
    }

    @Test
    void setValor_deveAlterarValorCorretamente() {
        Transacao transacao = new Transacao(TipoTransacao.SAQUE, 50.0);
        transacao.setValor(30.0);
        assertEquals(30.0, transacao.getValor(), 0.01);
    }
}
