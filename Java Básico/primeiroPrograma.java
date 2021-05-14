import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.Date;
import java.util.Locale;

import javax.tools.Tool;

public class primeiroPrograma {
    public static void main(String[] args) {
        String nome = "Rivaldo";
        System.out.print("Olá " + nome+", ");

        Date data = new Date();
        System.out.println("a data de hoje é " + data);

        System.out.println();

        Toolkit loc = Toolkit.getDefaultToolkit();
        Dimension resolution = loc.getScreenSize();

        System.out.println("Esse sistema está em " + resolution.width + " x " + resolution.height);

    }
}
