import java.util.ArrayList;

public class conta {

  protected int numero;
  protected cliente cliente;
  protected double saldo;

  protected ArrayList<transacao> historico = new ArrayList<>();

  public conta(int numero, cliente cliente) {
    this.numero = numero;
    this.cliente = cliente;
  }

  public void depositar(double valor) {
    saldo += valor;
    historico.add(new transacao("Deposito", valor));
  }

  public void sacar(double valor) {

    if (valor > saldo) {
      System.out.println("Saldo insuficiente");
      return;
    }

    saldo -= valor;
    historico.add(new transacao("Saque", valor));
  }

  public void transferir(conta destino, double valor) {

    if (valor > saldo) {
      System.out.println("Saldo insuficiente");
      return;
    }

    saldo -= valor;
    destino.depositar(valor);

    historico.add(new transacao("Transferencia enviada", valor));
  }
}
