public class Ave extends Animal{
    private String corPena;
    // -----------Getters e Setters----------
    public String getCorPena() {
        return corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    // ---------------------------------------
    @Override
    public void locomover() {
        // TODO Auto-generated method stub
        System.out.println("Voando");
    }

    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        System.out.println("Comendo frutas");
    }

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("Som de ave");
    }

    public void fazerNinho() {
        System.out.println("Construiu um ninho");
    }
    
}
