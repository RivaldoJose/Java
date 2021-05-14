import java.util.Scanner;

public class calcFatorial {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);

        System.out.print("Informe o número que deseja calcular o fatorial: ");
        int num = numeros.nextInt();
        int fatorial = 1;

        for (int i = 1; i <= num; i++) {
            fatorial = fatorial * i;
        }

        System.out.printf("!%d = %d", num, fatorial);
    }
}
