public class Reptil extends Animal {
    private String corEscama;
    // -----------Getters e Setters----------
    public String getCorEscama() {
        return corEscama;
    }
    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
    // ---------------------------------------
    @Override
    public void locomover() {
        // TODO Auto-generated method stub
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        System.out.println("Comendo vejetais");
    }

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("Som de réptil");
    }
    
}
