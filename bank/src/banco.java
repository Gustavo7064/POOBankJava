import java.util.ArrayList;

public class banco {

  private String nome;
  private ArrayList<conta> contas = new ArrayList<>();

  public banco(String nome) {
    this.nome = nome;
  }

  public void adicionarConta(conta conta) {
    contas.add(conta);
  }

  public conta buscarConta(int numero) {

    for (conta c : contas) {
      if (c.getNumero() == numero) {
        return c;
      }
    }

    return null;
  }

  public void listarContas() {

    for (conta c : contas) {
      System.out.println("Conta: " + c.getNumero());
    }
  }
}