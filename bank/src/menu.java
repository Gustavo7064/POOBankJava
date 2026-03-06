import java.util.Scanner;

public class menu {

  public static void iniciar(banco banco) {

    Scanner sc = new Scanner(System.in);

    while (true) {

      System.out.println("\n1 - Criar Conta");
      System.out.println("2 - Depositar");
      System.out.println("3 - Sacar");
      System.out.println("4 - Extrato");
      System.out.println("5 - Sair");

      int opcao = sc.nextInt();

      if (opcao == 1) {

        System.out.println("Numero da conta:");
        int numero = sc.nextInt();

        sc.nextLine();

        System.out.println("Nome cliente:");
        String nome = sc.nextLine();

        System.out.println("CPF:");
        String cpf = sc.nextLine();

        cliente cliente = new cliente(nome, cpf);

        conta conta = new conta(numero, cliente);

        banco.adicionarConta(conta);

        System.out.println("Conta criada!");

      }

      if (opcao == 2) {

        System.out.println("Conta:");
        int numero = sc.nextInt();

        conta conta = banco.buscarConta(numero);

        System.out.println("Valor:");
        double valor = sc.nextDouble();

        conta.depositar(valor);
      }

      if (opcao == 3) {

        System.out.println("Conta:");
        int numero = sc.nextInt();

        conta conta = banco.buscarConta(numero);

        System.out.println("Valor:");
        double valor = sc.nextDouble();

        conta.sacar(valor);
      }

      if (opcao == 4) {

        System.out.println("Conta:");
        int numero = sc.nextInt();

        conta conta = banco.buscarConta(numero);

        conta.extrato();
      }

      if (opcao == 5) {
        break;
      }

    }

  }
}