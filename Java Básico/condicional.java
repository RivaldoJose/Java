import java.util.Scanner;

public class condicional {
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int n1 = numbers.nextInt();

        System.out.print("Informe o segundo numero: ");
        int n2 = numbers.nextInt();

        if (n1 > n2){
            System.out.printf("O primerio número informado (%d) é maior do que o segundo (%d)", n1, n2);
        } if (n1 == n2) {
            System.out.println("Os números informados são iguais");
        }else {
            System.out.printf("O segundo número informado (%d) é maior do que o primeiro (%d)", n2, n1);
        }
    }
}
