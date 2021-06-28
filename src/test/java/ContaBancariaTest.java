import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    ContaBancaria cliente;

    @BeforeEach
    void setUp(){
        cliente = new SaldoBancario();
    }

    @Test
    void deveRetornarNomeCliente() {
        cliente.setNome("Vinicius Fortes");
        assertEquals("Vinicius Fortes", cliente.getNome());
    }

    @Test
    void deveRetornarCpfCliente() {
        cliente.setCpf(1597896423);
        assertEquals(1597896423, cliente.getCpf());
    }

    @Test
    void deveRetornarIdadeCliente() {
        cliente.setIdade(20);
        assertEquals(20, cliente.getIdade());
    }

    @Test
    void deveRetornarAgenciaBanco() {
        cliente.setAgencia("Nubank");
        assertEquals("Nubank", cliente.getAgencia());
    }

    @Test
    void deveRetornarTipoContaBanco() {
        cliente.setTipoConta("Corrente");
        assertEquals("Corrente", cliente.getTipoConta());
    }

    @Test
    void deveRetornarNumeroContaBanco() {
        cliente.setNumeroConta(40028922);
        assertEquals(40028922, cliente.getNumeroConta());
    }

    @Test
    void deveRetornarLocalidadeBanco() {
        cliente.setLocalidade("Juiz de Fora");
        assertEquals("Juiz de Fora", cliente.getLocalidade());
    }
}