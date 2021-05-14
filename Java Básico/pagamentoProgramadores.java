import java.util.Scanner;

public class pagamentoProgramadores {
    public static void main(String[] args) {
        Scanner nomes = new Scanner(System.in);
        Scanner salarios = new Scanner(System.in);

        System.out.println("Programador 1: ");
        System.out.print("Nome: ");
        String nome1 = nomes.next();
        System.out.print("Pagamento (R$): ");
        float sal1 = salarios.nextFloat();

        System.out.println("");

        System.out.println("Programador 2: ");
        System.out.print("Nome: ");
        String nome2 = nomes.next();
        System.out.print("Pagamento (R$): ");
        float sal2 = salarios.nextFloat();

        System.out.println("");
        
        if (sal1 > sal2) {
            System.out.printf("%s tem o salário maior.", nome1);
        } else if (sal1 < sal2) {
            System.out.printf("%s tem o salário maior.", nome2);
        } else {
            System.out.println("Os salários do programadores são iguais.");
        }
    }
}
