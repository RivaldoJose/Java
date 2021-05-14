import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner escolha = new Scanner(System.in);
        Scanner escolhaNome = new Scanner(System.in);

        ContaBanco novaConta = new ContaBanco();
        
        System.out.println("-------------------- HOME -------------------");
        System.out.println(" 0 - Sair");
        System.out.println(" 1 - Criar nova conta");
        System.out.println(" 2 - Fechar conta");
        System.out.println(" 3 - Depositar");
        System.out.println(" 4 - Sacar");
        System.out.println(" 5 - Pagar valor mensal");
        System.out.println(" 6 - Ver o saldo da conta");
        System.out.println(" 7 - Todas as informações da conta");
        System.out.println("---------------------------------------------");

        int opcao = 0;

        do {
            System.out.println(" ");
            System.out.print("-> Informe a opção desejada: ");
            opcao = escolha.nextInt();
            System.out.println(" ");

            switch (opcao) {
                case 1:
                    System.out.print("Informe o tipo da conta [CC - Conta Corrente, CP - Conta Poupança]: ");
                    String tipo = escolha.next();
                    System.out.print("Informe o nome para sua conta: ");
                    String dono = escolhaNome.nextLine();

                    novaConta.abrirConta(tipo, dono);
                    break;
                
                case 2:
                    novaConta.fecharConta();
                    break;

                case 3:
                    System.out.print("Informe o valor para depositar: ");
                    float valor = escolha.nextFloat();
                    novaConta.depositar(valor);
                    break;

                case 4:
                    System.out.print("Informe o valor que deseja sacar: ");
                    valor = escolha.nextFloat();
                    novaConta.sacar(valor);
                 break;

                case 5:
                    novaConta.pagarMensal();
                    break;

                case 6:
                    novaConta.getSaldo();
                    System.out.println(novaConta.getSaldo());
                    break;

                case 7:
                    if (novaConta.getTipo().equals("CC")) {
                        tipo = "Conta corrente";
                    } else {
                        tipo = "Conta poupança";
                    }
                    System.out.println("Tipo da conta: " + tipo);
                    System.out.println("Dono da conta: " + novaConta.getDono());
                    System.out.println("Saldo da conta: " + novaConta.getSaldo());
                    String estado;

                    if (novaConta.getStatus() == true) {
                        estado = "Aberta";
                    } else {
                        estado = "Fechada";
                    }
                    System.out.println("Status da conta: " + estado);
                    break;
            
                default:
                    
                    break;
            }
        } while (opcao != 0);
        System.out.println("--------------------- Sistema encerrado -------------------");
    }
}
