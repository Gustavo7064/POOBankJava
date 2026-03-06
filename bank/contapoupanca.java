public class ContaPoupanca extends Conta {
  private double rendimento;

  public ContaPoupanca(int numero, Cliente cliente, double rendimento) {
    super(numero, cliente);
    this.rendimento = rendimento;
  }

  public void aplicarRendimento() {
    saldo += saldo * rendimento;
  }

}