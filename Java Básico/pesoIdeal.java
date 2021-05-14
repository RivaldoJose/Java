import java.util.Scanner;

public class pesoIdeal {
    public static void main(String[] args) {
        Scanner alturas = new Scanner(System.in);
        Scanner sexos = new Scanner(System.in);

        System.out.println("Informe o sexo[M - masculino, F - feminino]: ");
        String sexo = sexos.next();

        System.out.println("Informe sua altura [metros]: ");
        float altura = alturas.nextFloat();

        float pesoPerfeito = 0f;

        switch (sexo) {
            case "M":
                pesoPerfeito = (72.7f * altura) - 58;
                break;
        
            case "F":
                pesoPerfeito = (66.1f * altura) - 44.7f;
                break;
            default:
                break;
        }

        System.out.printf("O peso ideal seria %.2f.", pesoPerfeito);
    }
}
