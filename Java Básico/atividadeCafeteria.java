import java.util.Scanner;

public class atividadeCafeteria {
    public static void main(String[] args) {
        Scanner menuItens = new Scanner(System.in);
        int menu = 0;
        int oi = 0;
        
        int qtdPedidos = 2;
        String pedidos[][] = {
            {"Rivaldo", "TELEFONE", "ENDERECO ENTREGA", "SABOR", "VALOR"},
            {"Renata", "TELEFONE", "ENDERECO ENTREGA", "SABOR", "VALOR"}
        }; 
        int n = pedidos.length;
        String pedidosModelo[] = {"NOME", "TELEFONE", "ENDERECO ENTREGA", "SABOR", "VALOR"};
        System.out.println("--------MENU-------");
        System.out.println("1-Ver Lista Pedidos");
        System.out.println("2-Adicionar um Pedido");
        System.out.println("3-Atualizar um pedido");
        System.out.println("4-Remover um Pedido");
        System.out.println("0-Encerrar Menu");
        System.out.println("");
        do {
            System.out.print("Informe o número do que deseja fazer: ");
            menu = menuItens.nextInt();

            switch (menu) {
                case 0:  
                    break;
                
                case 1:
                    for (int i = 0; i < qtdPedidos; i++) {
                        System.out.printf("%dº Pedido: ", i+1);
                        for (int j = 0; j < 5; j++) {
                           // System.out.print(pedidosModelo[j]);
                            System.out.print(pedidos[i][j]+"/");
                        }
                        System.out.println("");
                    }
                    break;
            
                case 2:
                    System.out.println("Adicionar novo Pedido");
                    int novoPedido[] =  new int[n];
                    n +=1;
                   // for (int i = 0; i < novoPedido.length; i++) {

                        /*for (int j = 0; j < novoPedido.length; j++) {
                            pedidos[qtdPedidos+1][6] = ;
                        }*/
                        System.out.println("Informe seu nome: ");
                        pedidos[n][0] = menuItens.next();
                        //novoPedido[i] = menuItens.nextInt();

                        System.out.println("Informe seu telefone para contato: ");
                        pedidos[n][1] = menuItens.next();
                        //novoPedido[i] = menuItens.nextInt();

                        System.out.println("Informe seu endereço para a entrega: ");
                        pedidos[n][2] = menuItens.next();
                        //novoPedido[i] = menuItens.nextInt();

                        System.out.println("Informe o sabor: ");
                        pedidos[n][3] = menuItens.next();
                        //novoPedido[i] = menuItens.nextInt();

                        System.out.println("Informe o valor do pedido: ");
                        pedidos[n+1][4] = menuItens.next();
                        //novoPedido[i] = menuItens.nextInt();
                   // }
                    qtdPedidos += 1;
                    System.out.println("Pedido adicionado!");
                    System.out.println("");
                     
                    break;
            
                case 3:
                    System.out.println("Atualizar Pedido");
                    
                    break;

                case 4:
                    System.out.println("Remover Pedido");
                    break;
            
                default:
                    break;
            }
            if (menu == 0) {
                break;
            }
        } while(menu != 0);
        System.out.println("Sistema encerrado!");
    }
}


