package padroescomportamentais.state;

public class PedidoEstadoEntregue extends PedidoEstado {

    private PedidoEstadoEntregue() {};
    private static PedidoEstadoEntregue instance = new PedidoEstadoEntregue();
    public static PedidoEstadoEntregue getInstance() {
        return instance;
    }

    public boolean concluir(Pedido pedido) {
        pedido.setEstado(PedidoEstadoConcluido.getInstance());
        return true;
    }

    public boolean devolver(Pedido pedido) {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        return true;
    }

    public String getEstado() {
        return "Entregue";
    }

}
