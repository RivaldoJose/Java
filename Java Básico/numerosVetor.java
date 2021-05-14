import java.util.Scanner;

public class numerosVetor {
    public static void main(String[] args) {
        Scanner numerosVetor = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int qtdN = new Scanner(System.in).nextInt(); 
        int numeros[] = new int[qtdN];
        int numero = 0;

        for (int i = 0; i < qtdN; i++) {
            System.out.printf("Valor: ", i);
            numero = numerosVetor.nextInt();
           numeros[i] = numero; 
        }


        System.out.println("O vetor informado é: ");

        for (int i = 0; i < qtdN; i++) {
            System.out.printf("[%d] = ", i);
            System.out.println(numeros[i]);
        }
    }
}
