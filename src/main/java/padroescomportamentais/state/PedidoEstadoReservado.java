package padroescomportamentais.state;

public class PedidoEstadoReservado extends PedidoEstado {

    private PedidoEstadoReservado() {};
    private static PedidoEstadoReservado instance = new PedidoEstadoReservado();
    public static PedidoEstadoReservado getInstance() {
        return instance;
    }

    public boolean cancelar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        return true;
    }

    public boolean transportar(Pedido pedido) {
        pedido.setEstado(PedidoEstadoTransporte.getInstance());
        return true;
    }


    public String getEstado() {
        return "Reservado";
    }
}

