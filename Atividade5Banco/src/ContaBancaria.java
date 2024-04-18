//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ContaBancaria {
    private Double Saldo;
    private String numeroDaConta;

    public ContaBancaria(Double Saldo, String numeroDaConta) {
        this.Saldo = Saldo;
        this.numeroDaConta = numeroDaConta;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double saldo) {
        Saldo = saldo;
    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
}
