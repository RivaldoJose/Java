public class Video implements AcoesVideo {
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.titulo = titulo;
        this.avaliacao = 1;
        this.curtidas = 0;
        this.views = 0;
        this.reproduzindo = false;
    }

    // métodos da interface AcoesVideo
    @Override
    public void play() {
        // TODO Auto-generated method stub
        System.out.println("Assitindo ao video");
        this.reproduzindo = true;
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        System.out.println("Vídeo pausado");
        this.reproduzindo = false;
    }

    @Override
    public void like() {
        // TODO Auto-generated method stub
        System.out.println("Obrigado pelo seu like!");
        setCurtidas(curtidas + 1);
    }
    // ------------ Título -----------
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    // ---------- Avaliação --------------
    public int getAvaliacao() {
        return avaliacao;
    }
    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }
    // -------------- Views ---------------
    public int getViews() {
        return views;
    }
    public void setViews(int views) {
        this.views = views;
    }
    // ------------- Curtidas --------------
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }
    // ----------- Reproduzindo ----------
    public boolean isReproduzindo() {
        return reproduzindo;
    }
    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public String toString() {
        return "Video [\n   avaliacao = " + avaliacao + ",\n   curtidas = " + curtidas + ", \n   reproduzindo = " + reproduzindo
                + ", \n   titulo = " + titulo + ", \n   views = " + views + "\n]";
    }

}
