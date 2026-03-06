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
}
