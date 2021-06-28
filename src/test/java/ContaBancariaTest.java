import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    ContaBancaria cliente;

    @BeforeEach
    void setUp(){
        cliente = new ContaBancaria();
    }

    @Test
    void deveRetornarSaldoAposDeposito() {
        cliente.deposito(100);
        assertEquals(100, cliente.getSaldo());
    }

    @Test
    void deveRetornarSaldoAposSaque() {
        cliente.saque(50);
        assertEquals(-50, cliente.getSaldo());
    }

    @Test
    void deveRetornarSaldoAposDepositoeSaque() {
        cliente.deposito(1000);
        cliente.saque(550);
        assertEquals(450, cliente.getSaldo());
    }
}