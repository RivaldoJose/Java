public class App {
    public static void main(String[] args) throws Exception {
        Autor a1 = new Autor("Rivaldo Jose", 17);

        a1.mostrarAutor();

        Livro l1 = new Livro("O andarilho", 2021);

        
        l1.adicionarAutores(a1);
        l1.mostrarAutores();
    }
}
