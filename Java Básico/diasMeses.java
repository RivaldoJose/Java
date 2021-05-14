import java.util.Scanner;

public class diasMeses {
    public static void main(String[] args) {
        Scanner meses = new Scanner(System.in);

        System.out.print("Informe o número de um mês: ");
        int mes = meses.nextInt();
        int qtdDias = 0;

        switch (mes) {
            case 1: //Janeiro
                qtdDias = 30;
                break;
            
            case 2: // Fevereiro
                qtdDias = 28;
                break;

            case 4: // Abril
                qtdDias = 30;
                break;

            case 6: // Junho
                qtdDias = 30;
                break;

            case 9: // Setembro
                qtdDias = 30;
                break;

            case 11: // Novembro
                qtdDias = 30;
                break;

            default:
                qtdDias = 31;
                break;
        }

        System.out.printf("O mês %d tem %d dias.", mes, qtdDias);
    }
}
