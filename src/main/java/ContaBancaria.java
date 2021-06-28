public abstract class ContaBancaria extends Cliente {

    private String agencia;
    private int numeroConta;
    private String localidade;
    private String tipoConta;


    public String getAgencia() {
        return agencia;
    }

    public ContaBancaria setAgencia(String agencia) {
        this.agencia = agencia;
        return this;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public ContaBancaria setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
        return this;
    }

    public String getLocalidade() {
        return localidade;
    }

    public ContaBancaria setLocalidade(String localidade) {
        this.localidade = localidade;
        return this;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public ContaBancaria setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
        return this;
    }


    public abstract float deposito(float saldoExtra);

    public abstract float saque(float saldoRetirado);

}
