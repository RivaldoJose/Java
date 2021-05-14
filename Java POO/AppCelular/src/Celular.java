import java.util.ArrayList;
import java.util.List;

public class Celular {
    private String operadora;
    private String numeroTelefone;
    private boolean estadoCelular;

    List<App> apps = new ArrayList<App>();

    public Celular(String operadora, String numeroTelefone) {
        this.operadora = operadora;
        this.numeroTelefone = numeroTelefone;
        this.estadoCelular = false;
    }

    public void addAplicativo(App aplicativo) {
        if (apps.contains(aplicativo)) {
            System.out.printf(" -> O aplicativo %s já está instalado", aplicativo.getNomeApp()); 
        } else {
            apps.add(aplicativo);
            System.out.println(" -> Aplicativo adicionado!");
        }
    }

    public void ligar() {
        if (getEstadoCelular() == false) {
            this.setEstadoCelular(true);
            System.out.println(" -> Celular ligado");  
        } else {
            System.out.println(" -> O celular já está ligado");
        }
        
    }

    public void desligar() {
        this.setEstadoCelular(false);
        System.out.println(" -> Celular desligado");
    }

    public void listarApps() {
        if (this.getEstadoCelular() == true) {
            if (apps.isEmpty()) {
                System.out.println(" -> Não há apps no celular");
                System.out.println("");
            } else {
                System.out.println("");
                System.out.println("------------------ Listando Apps ------------------");
                for (App app : apps) {
                    System.out.printf("%s: %.1fMb\n", app.getNomeApp(), app.getTamanho());
                }
            }
            
        } else {
            System.out.print(" -> Impossível listar os apps com o celular desligado\n");
        }
        System.out.println("");
    }

    // --------------------- Número do Telefone -------------------------
    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    // ------------------------ Operadora -----------------------------
    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
    
    // --------------------- Estado do telefone ------------------------
    public boolean getEstadoCelular() {
        return estadoCelular;
    }

    public void setEstadoCelular(boolean estadoCelular) {
        this.estadoCelular = estadoCelular;
    }
}
