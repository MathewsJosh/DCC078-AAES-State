package padroescomportamentais.state;

public class PedidoEstadoTransporte extends PedidoEstado {

    private PedidoEstadoTransporte() {};
    private static PedidoEstadoTransporte instance = new PedidoEstadoTransporte();
    public static PedidoEstadoTransporte getInstance() {
        return instance;
    }


    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }

    public boolean devolver(Pedido pedido) {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        return true;
    }

    public boolean entregar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        return true;
    }

    public String getEstado() {
        return "Recebido";
    }

}
