public class App {
    public static void main(String[] args) throws Exception {

        Video v = new Video("Como rebocar uma parede com JavaScript");
        v.like();
        v.play();
        System.out.println(v.toString());

        System.out.println();
        Garfonhoto g = new Garfonhoto("Paulo", 22, "M", 8, "Paulão");
        System.out.println(g.toString());

        Visualizacao vis = new Visualizacao(g, v);
        System.out.println(vis.toString());
    }
}
