import org.example.Cliente;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void getNome_deveRetornarNomeCorreto() {
        Cliente cliente = new Cliente("João");
        assertEquals("João", cliente.getNome());
    }

    @Test
    void setNome_deveAlterarNomeCorretamente() {
        Cliente cliente = new Cliente("Maria");
        cliente.setNome("Pedro");
        assertEquals("Pedro", cliente.getNome());
    }
}
