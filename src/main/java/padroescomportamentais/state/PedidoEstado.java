package padroescomportamentais.state;

public abstract class PedidoEstado {

    public boolean cancelar(Pedido pedido) {
        return false;
    }

    public boolean concluir(Pedido pedido) {
        return false;
    }

    public boolean devolver(Pedido pedido) {
        return false;
    }

    public boolean emProgresso(Pedido pedido) {
        return false;
    }

    public boolean entregar(Pedido pedido) {
        return false;
    }

    public boolean reservar(Pedido pedido) {
        return false;
    }

    public boolean transportar(Pedido pedido) {
        return false;
    }

    public abstract String getEstado();
}
