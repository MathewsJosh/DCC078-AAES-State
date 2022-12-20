package padroescomportamentais.state;

public class PedidoEstadoCancelado extends PedidoEstado {

    private PedidoEstadoCancelado() {};
    private static PedidoEstadoCancelado instance = new PedidoEstadoCancelado();
    public static PedidoEstadoCancelado getInstance() {
        return instance;
    }

    public boolean devolver(Pedido pedido) {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        return true;
    }

    public String getEstado() {
        return "Cancelado";
    }
}
