import java.util.List;

public class InformacaoBanco {

    public static float totalFundoBanco(List<SaldoBancario> fundosBancarios) {
        float totalFundos = 0.0f;
        for (SaldoBancario fundo : fundosBancarios) {
            totalFundos +=fundo.getSaldo();
        }
        return totalFundos;
    }

    public static float totalClientesBanco(List<SaldoBancario> clientesBancarios) {
        float totalClientes = 0.0f;
        for (SaldoBancario cliente : clientesBancarios) {
            totalClientes = clientesBancarios.size();
        }
        return totalClientes;
    }
}
