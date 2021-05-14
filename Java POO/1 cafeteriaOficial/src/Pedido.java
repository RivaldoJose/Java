
public class Pedido {
    private String telefone;
    private String sabor;
    private int valor;
    private int idPedido;

    public Pedido() {

    }

    // Valor do pedido
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    // Sabor do pedido
    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    // Telefone
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Quantidade de pedidos
    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setQtdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

}
