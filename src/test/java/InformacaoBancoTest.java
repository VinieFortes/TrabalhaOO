import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InformacaoBancoTest {


    @Test
    void DeveRetornartotalFundoBanco() {
        SaldoBancario cliente1 = new SaldoBancario();
            cliente1.deposito(1000.f);

        SaldoBancario cliente2 = new SaldoBancario();
            cliente2.deposito(500.f);

        SaldoBancario cliente3 = new SaldoBancario();
            cliente3.deposito(2500.f);

        List<SaldoBancario> lista = new ArrayList<SaldoBancario>();
        lista.add(cliente1);
        lista.add(cliente2);
        lista.add(cliente3);

        assertEquals(4000.f, InformacaoBanco.totalFundoBanco(lista));
    }

    @Test
    void DeveRetornartotalClintesBanco() {
        SaldoBancario cliente1 = new SaldoBancario();
        SaldoBancario cliente2 = new SaldoBancario();
        SaldoBancario cliente3 = new SaldoBancario();


        List<SaldoBancario> lista = new ArrayList<SaldoBancario>();
        lista.add(cliente1);
        lista.add(cliente2);
        lista.add(cliente3);

        assertEquals(3, InformacaoBanco.totalClientesBanco(lista));
    }
}