public class SaldoBancario extends ContaBancaria {

    private float saldo = 0.f;

    public float getSaldo() {
        return saldo;
    }

    @Override
    public float deposito(float saldoExtra) {
        return this.saldo += saldoExtra;
    }

    @Override
    public float saque(float saldoRetirado) {
        return this.saldo -= saldoRetirado;
    }

}
