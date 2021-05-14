import java.util.Scanner;

public class numerosPares {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int n1 = numeros.nextInt();
        System.out.print("Informe o segundo número: ");
        int n2 = numeros.nextInt();
        int cont = 0;

        if ((n1 % 2 == 0) || (n2 % 2 == 0)) {
            cont += 1;
        } 

        System.out.printf("Tem %d numero(s) par(es)", cont);
    }
}
