import java.util.Scanner;

public class impostoSalario {
    public static void main(String[] args) {
        Scanner salarios = new Scanner(System.in);

        System.out.print("Informe seu salário mensal (R$): ");
        float salarioBruto = salarios.nextFloat();
        float salario = 0;

        if (salarioBruto > 5000) {
            salario = salarioBruto * 0.12f;
        } else if ((salarioBruto >= 3000) && (salarioBruto < 5000)) {
            salario = salarioBruto * 0.09f;
        } else if ((salarioBruto >= 1000) && (salarioBruto < 3000)) {
            salario = salarioBruto * 0.065f;
        } else {
            salario = salarioBruto * 0;
        }

        System.out.printf("O valor a ser pago pelo Imposto de Renda é R$%.2f", salario);
    }
}
