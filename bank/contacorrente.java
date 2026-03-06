public class ContaCorrente extends Conta {
private double limite;

 public ContaCorrente(int numero, Cliente cliente, double limite){
        super(numero, cliente);
        this.limite = limite;
}