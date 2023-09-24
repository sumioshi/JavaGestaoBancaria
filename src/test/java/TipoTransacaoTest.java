import org.example.TipoTransacao;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TipoTransacaoTest {

    @Test
    void getCodigo_deveRetornarCodigoCorreto() {
        assertEquals(1, TipoTransacao.DEPOSITO.getCodigo());
        assertEquals(2, TipoTransacao.SAQUE.getCodigo());
        assertEquals(3, TipoTransacao.TRANSFERENCIA.getCodigo());
    }
}
