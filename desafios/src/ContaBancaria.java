//Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico).
// Implemente métodos getters e setters para os atributos privados.
public class ContaBancaria {
    private int numeroConta;
    private double saldoConta;
    String titular;

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }
}
