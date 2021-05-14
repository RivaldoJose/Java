import javax.swing.JOptionPane;

public class telaFlutuante {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome");

        String idadeLida = JOptionPane.showInputDialog("Idade");

        int idade = Integer.parseInt(idadeLida);

        System.out.println(nome + " tem " + idade + " anos de idade");
    }
}
