import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner escolha = new Scanner(System.in);
        Scanner escolhaNome = new Scanner(System.in);

        List<Pedido> pedidos = new ArrayList<Pedido>();
        List<Usuario> usuarios = new ArrayList<Usuario>();

        Usuario rivaldo = new Usuario();
        rivaldo.setNomeUsuario("Rivaldo");
        rivaldo.setTelefone("123");
        rivaldo.setDataNascimento("06/05/2003");
        rivaldo.setEndereco("Pov. Bonfim");
        usuarios.add(rivaldo);

        Usuario matheus = new Usuario();
        matheus.setNomeUsuario("Matheus");
        matheus.setTelefone("124");
        matheus.setDataNascimento("28/04/2003");
        matheus.setEndereco("Pov. Bonfim");
        usuarios.add(matheus);

        System.out.println("-------------------- HOME -------------------");
        System.out.println(" 0 - Sair");
        System.out.println(" 1 - Listar pedidos");
        System.out.println(" 2 - Adicionar pedido");
        System.out.println(" 3 - Atualizar pedido");
        System.out.println(" 4 - Remover pedido");
        System.out.println(" ");
        System.out.println(" 5 - Listar usuários");
        System.out.println(" 6 - Adicionar usuário");
        System.out.println(" 7 - Atualizar usuário");
        System.out.println(" 8 - Remover usuário");
        System.out.println(" ");
        System.out.println(" 9 - Listar aniversariantes do mês");
        System.out.println(" 10 - Faturamento por Usuário (Ainda não configurado)");
        System.out.println("---------------------------------------------");

        int opcao = 0;
        int qtdPedidos = 0;

        try {
            do {
                System.out.println(" ");
                System.out.print("-> Informe a opção desejada: ");
                opcao = escolha.nextInt();
                System.out.println(" ");

                switch (opcao) {
                case 1: // Listar Pedidos
                    if (!pedidos.isEmpty()) {
                        System.out.println("------------------ Lista de Pedidos ----------------");
                        for (Pedido pedido : pedidos) {
                            System.out.printf("ID do pedido: %d\n", pedido.getIdPedido());
                            System.out.printf("Sabor: %s\n", pedido.getSabor());
                            System.out.printf("Valor: %s\n", pedido.getValor());
                            System.out.printf("Telefone: %s\n", pedido.getTelefone());
                            System.out.println("");
                        }
                    } else {
                        System.out.println("Não há pedidos cadastrados no sistema");
                    }

                    break;

                case 2: // Adicionar um Pedido
                    if (!usuarios.isEmpty()) {
                        boolean podeGerarPedido = false;

                        System.out.print(" --> Informe o sabor do pedido: ");
                        String sabor = escolhaNome.nextLine();

                        System.out.print(" --> Informe o valor do pedido: ");
                        int valor = escolha.nextInt();

                        System.out.print(" --> Informe o telefone: ");
                        String telefonePedido = escolhaNome.nextLine();

                        for (Usuario usuario : usuarios) {
                            if (usuario.getTelefone().equals(telefonePedido)) {
                                podeGerarPedido = true;
                                Pedido novoPedido = new Pedido();

                                novoPedido = new Pedido();
                                qtdPedidos += 1;

                                novoPedido.setIdPedido(qtdPedidos);
                                novoPedido.setTelefone(telefonePedido);
                                novoPedido.setSabor(sabor);
                                novoPedido.setValor(valor);

                                pedidos.add(novoPedido);
                                System.out.println(" ");
                                System.out.println("------------------- Pedido Adicionado -------------------");
                            }
                        }
                        if (!podeGerarPedido) {
                            System.out.println("");
                            System.out.println(
                                    " O nº de telefone informado para o pedido não pertence a nenhum dos usuários cadastrados.");
                            System.out.println(" Favor adicionar um novo usuário com esse nº de telefone");
                        }

                    } else {
                        System.out.println(" É necessário haver usuários cadastrados para poder adicionar um pedido");
                        System.out.println(" Favor adicionar um usuário antes de fazer um pedido.");
                    }

                    break;
                case 3: // Atualizar um Pedido

                    if (!pedidos.isEmpty()) {
                        System.out.println("------------------ Lista de Pedidos ----------------");
                        for (Pedido pedido : pedidos) {
                            System.out.printf("ID do pedido: %d\n", pedido.getIdPedido());
                            System.out.printf("Sabor: %s\n", pedido.getSabor());
                            System.out.printf("Valor: %s\n", pedido.getValor());
                            System.out.printf("Telefone: %s\n", pedido.getTelefone());
                            System.out.println("");
                        }

                        System.out.print(" --> Informe o Id do pedido que você deseja alterar: ");
                        int idPedido = escolha.nextInt();

                        boolean podeAtualizar = false;
                        int atributoModi = 0;

                        for (Pedido pedido : pedidos) {
                            if (pedido.getIdPedido() == idPedido) {
                                podeAtualizar = true;

                                System.out.println(" Tem um pedido com esse ID");
                                System.out.println("");

                                System.out.println("[1] - Sabor do pedido");
                                System.out.println("[2] - Número do telefone");
                                System.out.println("[3] - Valor do pedido");
                                System.out.println(" ");
                                System.out.print(" --> O que você deseja modificar: ");
                                atributoModi = escolha.nextInt();

                                int escolhaParametroPedido[] = new int[3];

                                for (int i = 0; i < 3; i++) {
                                    escolhaParametroPedido[i] = i + 1;
                                }

                                for (int i = 0; i < escolhaParametroPedido.length; i++) {
                                    if (escolhaParametroPedido[i] == atributoModi) {
                                        switch (atributoModi) {
                                        case 1:
                                            System.out.print("Informe o novo sabor do pedido: ");
                                            String novoSabor = escolhaNome.nextLine();
                                            pedido.setSabor(novoSabor);

                                            System.out.println(
                                                    "------------------ Sabor do pedido alterado ------------------");
                                            break;
                                        case 2:
                                            System.out.print("Informe o novo telefone do pedido: ");
                                            String novoTelefone = escolhaNome.nextLine();
                                            pedido.setTelefone(novoTelefone);
                                            System.out.println(
                                                    "----------------- Telefone do pedido alterado -----------------");
                                            break;
                                        case 3:
                                            System.out.print("Informe o novo valor do usuário: ");
                                            int novoValor = escolha.nextInt();
                                            pedido.setValor(novoValor);
                                            System.out.println(
                                                    "----------------- Valor do pedido alterado -----------------");
                                            break;

                                        default:

                                            break;
                                        }
                                    } else {
                                        System.out.println("Erro! A opção informada não está disponível.");
                                    }
                                }
                                break;
                            }
                        }

                        if (!podeAtualizar) {
                            System.out.println(" Não existe nenhum pedido com esse ID");
                        }
                    } else {
                        System.out.println("Não há pedidos cadastrados no sistema");
                        break;
                    }

                    break;
                case 4: // Remover Pedido
                    boolean existeId = false;
                    if (!pedidos.isEmpty()) {
                        System.out.println("------------------ Lista de Pedidos ----------------");
                        for (Pedido pedido : pedidos) {
                            System.out.printf("ID do pedido: %d\n", pedido.getIdPedido());
                            System.out.printf("Sabor: %s\n", pedido.getSabor());
                            System.out.printf("Valor: %s\n", pedido.getValor());
                            System.out.printf("Telefone: %s\n", pedido.getTelefone());
                            System.out.println("");
                        }

                        System.out.print(" --> Informe o ID do pedido que você deseja remover: ");
                        int idPedido = escolha.nextInt();

                        for (Pedido pedido : pedidos) {
                            if (pedido.getIdPedido() == idPedido) {
                                existeId = true;
                                pedidos.remove(pedido);
                                System.out.println(" ");
                                System.out.println(" Pedido removido com sucesso");
                                break;
                            }
                        }
                        if (!existeId) {
                            System.out.println(" Não existe nenhum pedido com esse ID");
                        }
                    } else {
                        System.out.println("Não há pedidos cadastrados para serem excluídos");
                    }
                    break;

                case 5: // Listar Usuários
                    if (!usuarios.isEmpty()) {
                        System.out.println("------------------ Lista de Usuários ----------------");
                        for (Usuario usuario : usuarios) {
                            System.out.printf("Nome: %s\n", usuario.getNomeUsuario());
                            System.out.printf("Telefone: %s\n", usuario.getTelefone());
                            System.out.printf("Endereço: %s\n", usuario.getEndereco());
                            System.out.printf("Data de nascimento: %s\n", usuario.getDataNascimento());
                            System.out.println("");
                        }
                    } else {
                        System.out.println("Nunhum usuário cadastrado");
                    }
                    break;
                case 6: // Adicionar Usuário
                    System.out.print(" --> Informe o nome do usuário (Não ponha acentos): ");
                    String nome = escolhaNome.nextLine();

                    System.out.print(" --> Informe o telefone: ");
                    String telefone = escolhaNome.nextLine();

                    System.out.print(" --> Informe o endereço do usuário: ");
                    String endereco = escolhaNome.nextLine();

                    System.out.print(" --> Informe a data de nascimento (dia/mês/ano): ");
                    String dataNascimento = escolhaNome.nextLine();

                    if (!usuarios.isEmpty()) {
                        for (Usuario usuario : usuarios) {
                            if (!usuario.getTelefone().equals(telefone)) {
                                Usuario novoUser = new Usuario();
                                novoUser.setNomeUsuario(nome);

                                novoUser.setDataNascimento(dataNascimento);
                                novoUser.setTelefone(telefone);
                                novoUser.setEndereco(endereco);

                                usuarios.add(novoUser);
                                System.out.println(" ");
                                System.out.println("------------------- Usuário Adicionado -------------------");
                                break;
                            } else {
                                System.out.println(" ");
                                System.out.println(
                                        "Erro! Já existe um usuário com este telefone, informe um número de telefone dif");
                                break;
                            }
                        }
                    } else {
                        Usuario novoUser = new Usuario();
                        novoUser.setNomeUsuario(nome);

                        novoUser.setDataNascimento(dataNascimento);
                        novoUser.setTelefone(telefone);
                        novoUser.setEndereco(endereco);

                        usuarios.add(novoUser);
                        System.out.println(" ");
                        System.out.println("------------------- Usuário Adicionado -------------------");
                    }

                    break;

                case 7: // Atualizar Usuário

                    if (!usuarios.isEmpty()) {
                        System.out.println("------------------ Lista de Usuários ----------------");
                        for (Usuario usuario : usuarios) {
                            System.out.printf("Nome: %s\n", usuario.getNomeUsuario());
                            System.out.printf("Telefone: %s\n", usuario.getTelefone());
                            System.out.printf("Endereço: %s\n", usuario.getEndereco());
                            System.out.printf("Data de nascimento: %s\n", usuario.getDataNascimento());
                            System.out.println("");
                        }

                        System.out.print(" --> Informe o numero de telefone do usuário que vc deseja alterar: ");
                        telefone = escolhaNome.nextLine();
                        boolean podeAtualizar = false;
                        int atributoModi = 0;
                        for (Usuario usuario : usuarios) {
                            if (usuario.getTelefone().equals(telefone)) {
                                podeAtualizar = true;
                                System.out.println(" ");
                                System.out.println("Tem um usuário com esse ID");
                                System.out.println("");

                                System.out.println("[1] - Nome do usuário");
                                System.out.println("[2] - Número do telefone");
                                System.out.println("[3] - Endereço");
                                System.out.println("[4] - Data de nascimento");
                                System.out.println(" ");
                                System.out.print(" --> O que você deseja modificar: ");
                                atributoModi = escolha.nextInt();

                                int escolhaAlterarUsuario[] = new int[4];

                                for (int i = 0; i < 4; i++) {
                                    escolhaAlterarUsuario[i] = i + 1;
                                }

                                boolean temOpcao = false;

                                for (int i = 0; i < 4; i++) {
                                    if (escolhaAlterarUsuario[i] == atributoModi) {
                                        temOpcao = true;
                                        System.out.println(" ");
                                        switch (atributoModi) {
                                        case 1:
                                            System.out.print("Informe o novo nome do usuário: ");
                                            String novoNome = escolhaNome.nextLine();
                                            
                                            usuario.setNomeUsuario(novoNome);
                                            System.out.println(" ");
                                            System.out.println(
                                                    "------------------- Nome do usuário alterado -------------------");
                                            break;
                                        case 2:
                                            System.out.print("Informe o novo telefone do usuário: ");
                                            String novoTelefone = escolhaNome.nextLine();

                                            usuario.setTelefone(novoTelefone);
                                            System.out.println(" ");
                                            System.out.println(
                                                    "----------------- Telefone do usuário alterado -----------------");
                                            break;
                                        case 3:
                                            System.out.print("Informe o novo endereço do usuário: ");
                                            String novoEndereco = escolhaNome.nextLine();
                                            usuario.setEndereco(novoEndereco);
                                            System.out.println(" ");
                                            System.out.println(
                                                    "----------------- Endereço do usuário alterado -----------------");
                                            break;
                                        case 4:
                                            System.out.print(
                                                    "Não sei como isso é possível mas... informe o nova data de nascimento do usuário: ");
                                            String novoDataNascimento = escolhaNome.nextLine();
                                            usuario.setDataNascimento(novoDataNascimento);
                                            System.out.println(" ");
                                            System.out.println(
                                                    "----------- Data de nascimento do usuário alterado -------------");
                                            break;

                                        default:
                                            break;
                                        }
                                        break;
                                    }
                                }
                                if (!temOpcao) {
                                    System.out.println("Erro! A opção informada não está disponível.");
                                }
                            } else {
                                podeAtualizar = false;
                            }
                        }

                        if (!podeAtualizar) {
                            System.out.println(" Não tem nenhum usuário com esse ID");
                            break;
                        }
                    } else {
                        System.out.println("Nunhum usuário cadastrado");
                    }

                    break;
                case 8: // Remover Usuários
                    boolean existeTelefone = false;
                    if (!usuarios.isEmpty()) {
                        System.out.println("------------------ Lista de Usuários ----------------");
                        for (Usuario usuario : usuarios) {
                            System.out.printf("Nome: %s\n", usuario.getNomeUsuario());
                            System.out.printf("Telefone: %s\n", usuario.getTelefone());
                            System.out.printf("Endereço: %s\n", usuario.getEndereco());
                            System.out.printf("Data de nascimento: %s\n", usuario.getDataNascimento());
                            System.out.println("");
                        }

                        System.out.print(" --> Informe o telefone do usuário que você deseja remover: ");
                        telefone = escolhaNome.nextLine();

                        for (Usuario usuario1 : usuarios) {
                            if (usuario1.getTelefone().equals(telefone)) {
                                System.out.println(" Se você deletar este usuário, todos os pedidos associados a ele também serão excluídos...");
                                System.out.print(" Você tem certeza que deseja excluir este usuário [S/N]: ");
                                String certezaEsclusao = escolhaNome.nextLine();

                                if (certezaEsclusao.strip().equalsIgnoreCase("S")) {
                                    existeTelefone = true;
                                    usuarios.remove(usuario1);
                                    System.out.println(" ");
                                    System.out.println("Usuário removido com sucesso");
                                    
                                    for (Pedido pedido : pedidos) {
                                        if (pedido.getTelefone().equals(usuario1.getTelefone())) {
                                            pedidos.remove(pedido); 
                                        }
                                        if (pedidos.isEmpty()) {
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                        }
                        if (!existeTelefone) {
                            System.out.println(" Não existe nenhum usuário com esse nº de telefone");
                        }
                    } else {
                        System.out.println("Não tem usuários para serem excluidos");
                    }
                    break;

                case 9: // Listar os aniversariantes do mês
                    Date d = new Date();

                    if (!usuarios.isEmpty()) {
                        boolean temAniversariante = false;
                        System.out.println(" -------------------- Aniversariantes do mês -------------------");
                        for (Usuario usuario : usuarios) {
                            if (usuario.getDataNascimento().getMonth() == d.getMonth()) { 
                                temAniversariante = true;
                                System.out.printf(" %s: %s", usuario.getNomeUsuario(), usuario.getDataNascimento());
                                System.out.println(" ");
                            }         
                        }
                        if (temAniversariante == false) {
                            System.out.println("Detre o usuários cadastrados, não tem nenhum aniversáriante neste mês");
                        }
                    } else {
                        System.out.println("Não há usuários cadastrados no sistema, portanto não há aniversariantes neste mês");
                    }
                    break;

                case 10: // Faturamento de cada usuário
                    float faturamentoPorUsuario = 0;
                    if (!usuarios.isEmpty()) {
                        System.out.println(" ----------------- Faturamento por Usuário --------------");
                        for (Usuario usuario : usuarios) {
                            faturamentoPorUsuario = 0;
                            System.out.println(" ");

                            for (Pedido pedido : pedidos) {
                                if (usuario.getTelefone().equals(pedido.getTelefone())) {
                                    faturamentoPorUsuario += pedido.getValor(); 
                                }
                            }
                            System.out.printf(" Faturamento do(a) usuário(a) %s: %.2f", usuario.getNomeUsuario(), faturamentoPorUsuario);
                            System.out.println("");
                        }
                    } else {
                        System.out.println(" Não há usuários cadastrados no sistema, portando também não há faturamento ainda");
                    }

                    break;

                default:
                    break;
                }
            } while (opcao != 0);

            System.out.println("--------------------------- Sistema encerrado -------------------------");
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
