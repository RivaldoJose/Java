import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;

    public void marcarLuta(Lutador desafiante, Lutador desafiado) {
        if (desafiante.getCategoria().equals(desafiado.getCategoria())){
            if (desafiante.getNome() != desafiado.getNome()) {
                setAprovada(true);
                setDesafiante(desafiante);
                setDesafiado(desafiado);
            } 
        } else {
                setAprovada(false);
                setDesafiante(null);
                setDesafiado(null);
        }
    }

    public void lutar() {
        if (getAprovada()) {
            desafiado.apresentar();
            desafiante.apresentar();
            int vencedor = new Random().nextInt(3);
            System.out.println("");
            //Thread.sleep(1000);

            switch (vencedor) {
                case 0: // Empatar
                    System.out.println("Empatou!");
                    desafiante.empatarLuta();
                    desafiado.empatarLuta();
                    break;
                
                case 1: // Desafiado ganha
                    System.out.println(desafiado.getNome() + " ganhou a disputa");
                    desafiado.ganharLuta();
                    desafiante.perderLuta();
                    break;

                case 2: // Desafiante ganha
                    System.out.println(desafiante.getNome() + " ganhou a disputa");
                    desafiante.ganharLuta();
                    desafiado.perderLuta();
                    break;
                default:
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }

    // -------------------- Desafiado ------------------
    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    // -------------------- Rounds ------------------
    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    // -------------------- Desafiante ------------------
    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    // -------------------- Aprovada ------------------   
    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
