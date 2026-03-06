public class contapoupanca extends conta {
  private double rendimento;

  public contapoupanca(int numero, cliente cliente, double rendimento) {
    super(numero, cliente);
    this.rendimento = rendimento;
  }

  public void aplicarRendimento() {
    saldo += saldo * rendimento;
  }

}