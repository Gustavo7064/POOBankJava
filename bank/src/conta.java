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
}
