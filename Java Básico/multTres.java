import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class multTres {
    public static void main(String[] args) {
        String leitura = JOptionPane.showInputDialog("Informe um número");
        int num = Integer.parseInt(leitura);

        int multTres = 0;

        while (num != 0) {
            leitura  = JOptionPane.showInputDialog("Infome outro número [Para cancelar digie 0]");
            num = Integer.parseInt(leitura);

            if (num % 3 == 0) {
                multTres += num;
            }
        }

        System.out.println("");
        System.out.printf("A soma dos multiplos de três são %d", multTres);
    }
}
