public class Livro {
    private String tituloLivro;
    private int anoEdicao;
    public Autor[] autores = new Autor[3];
    private int posLastAutor;

    public Livro(String tituloLivro, int anoEdicao) {
        this.tituloLivro = tituloLivro;
        this.anoEdicao = anoEdicao;
        this.autores = null;
    }

    public void mostrarLivro() {
        System.out.println("--------------- Montrando livro ---------------");
        System.out.println(" -> Título do livro: " + getTituloLivro());
        System.out.println(" -> Ano de edição: " + getAnoEdicao());
        for (Autor autor : autores) {
            System.out.println(" -> Autor(a): " + autor.getNomeAutor());
        }
    }

    public void adicionarAutores(Autor autor) {
        System.out.println("----------------- Adicionar autor ---------------");
        for (int i = 0; i < 3; i++) {
            if (autores[i] == null) {
                autores[i] = autor;
                setPosLastAutor(i);
            } else if (autores[2] != null) {
                autores[getPosLastAutor()] = autor;
            }
        }
        System.out.println("");
    }

    public void mostrarAutores() {
        if (autores[0] != null) {
            for (int i = 0; i < autores.length; i++) {
                if (autores[i] != null) {
                    System.out.println(" -> Autor(a): " + autores[i].getNomeAutor());
                }
                
            } 
        }
        
        /*for (Autor autor : autores) {
            System.out.println(" -> Autor(a): " + autor.getNomeAutor());
        }*/
    }


    // --------------- Ano de Edição ---------------------
    public int getAnoEdicao() {
        return anoEdicao;
    }

    public void setAnoEdicao(int anoEdicao) {
        this.anoEdicao = anoEdicao;
    }

    // ----------------- Título do Livro ------------------
    public String getTituloLivro() {
        return tituloLivro;
    }

    public void setTituloLivro(String tituloLivro) {
        this.tituloLivro = tituloLivro;
    }

    // --------------------- Ultimo altor -------------------
    
    public int getPosLastAutor() {
        return posLastAutor;
    }

    public void setPosLastAutor(int posLastAutor) {
        this.posLastAutor = posLastAutor;
    }
}
