import java.util.Scanner;

public class OlaMundoSwing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
        String nome = scan.next();

        System.out.print("Informe sua idade: ");
        int idade = scan.nextInt();

        System.out.println(nome + " tem " + idade + " de idade");
    }
}
