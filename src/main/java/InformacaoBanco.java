import java.util.List;

public class InformacaoBanco {

    public static float totalFundoBanco(List<ContaBancaria> fundosBancarios) {
        float totalFundos = 0.0f;
        for (ContaBancaria fundo : fundosBancarios) {
            totalFundos +=fundo.getSaldo();
        }
        return totalFundos;
    }

    public static float totalClientesBanco(List<ContaBancaria> clientesBancarios) {
        float totalClientes = 0.0f;
        for (ContaBancaria cliente : clientesBancarios) {
            totalClientes = clientesBancarios.size();
        }
        return totalClientes;
    }
}
