public abstract class ClienteBancario extends Pessoa {

    private String agencia;
    private int numeroConta;
    private String localidade;
    private String tipoConta;


    public String getAgencia() {
        return agencia;
    }

    public ClienteBancario setAgencia(String agencia) {
        this.agencia = agencia;
        return this;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public ClienteBancario setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
        return this;
    }

    public String getLocalidade() {
        return localidade;
    }

    public ClienteBancario setLocalidade(String localidade) {
        this.localidade = localidade;
        return this;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public ClienteBancario setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
        return this;
    }


    public abstract float deposito(float saldoExtra);

    public abstract float saque(float saldoRetirado);

}
