
public class App {
    private String nomeApp;
    private double tamanho;

    public App(String nome, double tamanho) {
        this.setNomeApp(nome);
        this.setTamanho(tamanho);
    }

    // --------------- Nome do aplicativo -------------------
    public String getNomeApp() {
        return nomeApp;
    }
    public void setNomeApp(String nome) {
        this.nomeApp = nome;
    }

    // --------------- Tamanho ------------------
    public double getTamanho() {
        return tamanho;
    }
    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    
}
