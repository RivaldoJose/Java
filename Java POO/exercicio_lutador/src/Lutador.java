public class Lutador {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nacionalidade, int idade, float altura, 
    float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        //this.categoria = categoria;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public void apresentar() {
        System.out.println("---------------------------------------");
        System.out.println("Lutador: " + getNome());
        System.out.println("Categoria: " + getCategoria());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + " m de altura");
        System.out.println("Pesando " + getPeso() + " Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }

    public void status() {
        System.out.print(getNome());
        System.out.print(" é um peso " + getCategoria());
        System.out.println(getVitorias() + " vitórias,");
        System.out.println(getDerrotas() + " derrotas,");
        System.out.println(getEmpates() + " empates,");
    }

    public void ganharLuta() {
        this.setVitorias(getVitorias() + 1);
    }
    
    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);
    }

    // --------------- Nome ----------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // --------------- Nacionalidade ----------------
    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    // ------------------- Idade --------------------
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    // ------------------- Altura --------------------
    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    // --------------------- Peso ----------------------
    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    // ------------------- Categoria --------------------
    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (getPeso() < 52.2) {
            this.categoria = "Inválido";
        } else if (getPeso() <= 70.3) {
            this.categoria = "Leve";
        } else if (getPeso() <= 83.9) {
            this.categoria = "Medio";
        } else if (getPeso() <= 120.2) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }
    }

    // ------------------- Vitórias --------------------
    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    // ------------------- Derrotas --------------------
    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    // ------------------- Empates --------------------
    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
}
