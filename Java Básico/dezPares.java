import java.util.Scanner;

public class dezPares {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        int contPar = 0;
        for (int i = 1; i <= 10; i++){
            System.out.printf("Informe o %dº número: ", i);
            int numero = numeros.nextInt();

            if (numero % 2 == 0) {
                contPar += 1;
            }
        }

        System.out.println("");
        System.out.printf("Existem %d números pares nesta lista.", contPar);
    }
}
