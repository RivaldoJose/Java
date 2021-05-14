
public class Biblioteca {
    private Livro[] livros = new Livro[10];
    public Biblioteca() {
        
    }

    public void inserirLivro(Livro novoLivro) {
        System.out.println("--------------------- Inserindo Livro --------------------");
        for (int i = 0; i < livros.length; i++) {
            if (livros[i] == null) {
                livros[i] = novoLivro;
                System.out.println("Livro adicionado à biblioteca");
            }
        }
    }

    public void procurarLivro(String tituloLivro) {
        for (Livro livro : livros) {
            if (livro.getTituloLivro().toUpperCase().equals(tituloLivro.toUpperCase())) {
                System.out.println("--------------------- Temos esse livro ----------------------");
                System.out.println(" -> Título do livro: " + livro.getTituloLivro());
                System.out.println(" -> Ano de edição: " + livro.getAnoEdicao());
                livro.mostrarAutores();
            }
        }
    }

    // ----------------- Lista de livros ---------------
    public Livro[] getLivros() {
        return livros;
    }

    public void setLivros(Livro[] livros) {
        this.livros = livros;
    }
}
