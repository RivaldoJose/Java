import java.util.Scanner;

public class testeVetor {
    public static void main(String[] args) {
        int n = 5;
        int valores[] = new int[n];

        Scanner scan = new Scanner(System.in);
        
        for (int i = 0; i < valores.length; i++) {
            n +=1;
            System.out.print("informe um número: ");
            valores[n] = scan.nextInt();
        }
        
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i] + " "); 
        }
    }
}
