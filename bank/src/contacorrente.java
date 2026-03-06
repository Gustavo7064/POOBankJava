public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int numero, Cliente cliente, double limite){
        super(numero, cliente);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor){

        if(valor > saldo + limite){
            System.out.println("Limite insuficiente");
            return;
        }

        saldo -= valor;
        historico.add(new Transacao("Saque", valor));
    }
}