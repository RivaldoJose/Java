import java.util.Scanner;

public class switchEsmeralda {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Digite o ano: ");
        int x = scan.nextInt();
        int ano = x % 4;
        switch (ano) {
            case 0:
                System.out.println("Ano bissexto"); 
                break;
            case 1:
                System.out.println("Ano não é bissexto");
                break;
        }
    }
}



    
