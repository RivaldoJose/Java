public class AppCelular {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Celular c = new Celular("Vivo", "91234-1234");
        c.ligar();

        App app1 = new App("Whatsapp", 15.2); // nome e tamanho
        c.addAplicativo(app1);
        c.addAplicativo(app1);

        App app2 = new App("Instagram", 20.0);
        c.addAplicativo(app2);

        c.listarApps();

        c.ligar();
        c.desligar();
    }
}

