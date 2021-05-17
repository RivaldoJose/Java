public abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.experiencia = 0;
    }

    protected abstract void ganharExp();

    @Override
    public String toString() {
        return "Pessoa [\n    experiencia = " + experiencia + ", \n   idade = " + idade + ", \n   nome = " + nome + ", \n   sexo = " + sexo + "]";
    }

}
