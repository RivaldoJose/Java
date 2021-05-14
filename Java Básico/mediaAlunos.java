import java.util.Scanner;

public class mediaAlunos {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        Scanner notas = new Scanner(System.in);

        System.out.print("Informe seu nome: ");
        String nomeAluno = nome.next();

        System.out.println("Suas notas: ");
        System.out.print("1º nota: ");
        float nota1 = notas.nextFloat();
        System.out.print("1º nota: ");
        float nota2 = notas.nextFloat();
        System.out.print("1º nota: "); 
        float nota3 = notas.nextFloat();

        float media = ((nota1 + nota2 + nota3) / 3);

        if (media >= 5) {
            System.out.printf("Parabéns %s! Você está aprovado!", nomeAluno);
        } else {
            System.out.printf("%s, você está de recuperação", nomeAluno);
        }
    }
}
