import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InformacaoBancoTest {


    @Test
    void DeveRetornartotalFundoBanco() {
        ContaBancaria cliente1 = new ContaBancaria();
            cliente1.deposito(1000.f);

        ContaBancaria cliente2 = new ContaBancaria();
            cliente2.deposito(500.f);

        ContaBancaria cliente3 = new ContaBancaria();
            cliente3.deposito(2500.f);

        List<ContaBancaria> lista = new ArrayList<ContaBancaria>();
        lista.add(cliente1);
        lista.add(cliente2);
        lista.add(cliente3);

        assertEquals(4000.f, InformacaoBanco.totalFundoBanco(lista));
    }

    @Test
    void DeveRetornartotalClintesBanco() {
        ContaBancaria cliente1 = new ContaBancaria();
        ContaBancaria cliente2 = new ContaBancaria();
        ContaBancaria cliente3 = new ContaBancaria();


        List<ContaBancaria> lista = new ArrayList<ContaBancaria>();
        lista.add(cliente1);
        lista.add(cliente2);
        lista.add(cliente3);

        assertEquals(3, InformacaoBanco.totalClientesBanco(lista));
    }
}