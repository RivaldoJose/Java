public class Garfonhoto extends Pessoa {

    public Garfonhoto(String nome, int idade, String sexo, int experiencia,String login) {
        super(nome, idade, sexo);
        this.login = login;
    }

    private String login;
    private int totAssistido;
    
    @Override
    protected void ganharExp() {
        // TODO Auto-generated method stub
        
    }
    // ----- get e set de totAssistido
    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
    // --------- gete e set de login -------
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    @Override
    public String toString() {
        return "Garfonhoto [\n " + super.toString() + "\n   login = " + login + ", \n   totAssistido = " + totAssistido + "\n]";
    }
    
}
