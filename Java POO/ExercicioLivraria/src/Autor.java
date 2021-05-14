public class Autor {
    private String nomeAutor;
    private int idade;

    public Autor(String nomeAutor, int idade) {
        this.nomeAutor = nomeAutor;
        this.idade = idade;
    }

    public void mostrarAutor() {
        System.out.println(" ------------ Dados do Autor ----------");
        System.out.println(" -> Nome: " + getNomeAutor());
        System.out.println(" -> Idade: " + getIdade());
        System.out.println(" --------------------------------------");
        System.out.println("");
    }

    // ------------------ Idade ---------------------
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // ------------------ Autor ---------------------
    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
}
