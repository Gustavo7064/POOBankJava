import java.util.ArrayList;

public class banco {

  private String nome;
  private ArrayList<conta> contas = new ArrayList<>();

  public banco(String nome) {
    this.nome = nome;
  }
}