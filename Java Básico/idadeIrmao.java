import java.util.Scanner;

public class idadeIrmao {
    public static void main(String[] args) {
        Scanner idades = new Scanner(System.in);

        System.out.print("Idade do primeiro irmão: ");
        int firstAge = idades.nextInt();
        
        System.out.print("Idade do primeiro irmão: ");
        int secondAge = idades.nextInt();
        
        System.out.print("Idade do primeiro irmão: ");
        int thirdAge = idades.nextInt();
        
        System.out.print("Idade do primeiro irmão: ");
        int fourthAge = idades.nextInt();

        int faixaIdades = 0;

        if (firstAge > 15) {
            faixaIdades += firstAge;
        } else if (secondAge > 15) {
            faixaIdades += secondAge;
        } else if (thirdAge > 15) {
            faixaIdades += thirdAge;
        } else if (fourthAge > 15){
            faixaIdades += fourthAge;
        }

        System.out.printf("A soma das idades dos irmãos que possuem mais de 15 anos é %d.", faixaIdades);
    }
}
