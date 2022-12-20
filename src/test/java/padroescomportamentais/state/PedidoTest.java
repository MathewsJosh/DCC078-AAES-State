package padroescomportamentais.state;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    Pedido pedido;

    @BeforeEach
    public void setUp() {
        pedido = new Pedido();
    }


    /////////////////////////////////////////////////////////////////////// Pedido Cancelado

    @Test
    public void naoDeveCancelarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveConcluirPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.concluir());
    }

    @Test
    public void deveDevolverPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertTrue(pedido.devolver());
        assertEquals(PedidoEstadoDevolvido.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEntregarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveReservarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.reservar());
    }

    @Test
    public void naoDeveTransportarPedidoCancelado() {
        pedido.setEstado(PedidoEstadoCancelado.getInstance());
        assertFalse(pedido.transportar());
    }


    /////////////////////////////////////////////////////////////////////// Pedido Concluido

    @Test
    public void naoDeveCancelarPedidoConcluido() {
        pedido.setEstado(PedidoEstadoConcluido.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveConcluirPedidoConcluido() {
        pedido.setEstado(PedidoEstadoConcluido.getInstance());
        assertFalse(pedido.concluir());
    }

    @Test
    public void naoDeveDevolverPedidoConcluido() {
        pedido.setEstado(PedidoEstadoConcluido.getInstance());
        assertFalse(pedido.devolver());
    }

    @Test
    public void naoDeveEntregarPedidoConcluido() {
        pedido.setEstado(PedidoEstadoConcluido.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveReservarPedidoConcluido() {
        pedido.setEstado(PedidoEstadoConcluido.getInstance());
        assertFalse(pedido.reservar());
    }

    @Test
    public void naoDeveTransportarPedidoConcluido() {
        pedido.setEstado(PedidoEstadoConcluido.getInstance());
        assertFalse(pedido.transportar());
    }


    /////////////////////////////////////////////////////////////////////// Pedido Devolvido

    @Test
    public void naoDeveCancelarPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.cancelar());
    }

    @Test
    public void naoDeveConcluirPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.concluir());
    }

    @Test
    public void naoDeveDevolverPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.devolver());
    }

    @Test
    public void naoDeveEntregarPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveReservarPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.reservar());
    }

    @Test
    public void naoDeveTransportarPedidoDevolvido() {
        pedido.setEstado(PedidoEstadoDevolvido.getInstance());
        assertFalse(pedido.transportar());
    }



    /////////////////////////////////////////////////////////////////////// Pedido Entregue

    @Test
    public void naoDeveCancelarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.cancelar());

    }

    @Test
    public void deveConcluirPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertTrue(pedido.concluir());
        assertEquals(PedidoEstadoConcluido.getInstance(), pedido.getEstado());
    }

    @Test
    public void deveDevolverPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertTrue(pedido.devolver());
        assertEquals(PedidoEstadoDevolvido.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveEntregarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveReservarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.reservar());
    }

    @Test
    public void naoDeveTransportarPedidoEntregue() {
        pedido.setEstado(PedidoEstadoEntregue.getInstance());
        assertFalse(pedido.transportar());
    }




    /////////////////////////////////////////////////////////////////////// Pedido Reservado

    @Test
    public void deveCancelarPedidoReservado() {
        pedido.setEstado(PedidoEstadoReservado.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveConcluirPedidoReservado() {
        pedido.setEstado(PedidoEstadoReservado.getInstance());
        assertFalse(pedido.concluir());
    }

    @Test
    public void naodeveDevolverPedidoReservado() {
        pedido.setEstado(PedidoEstadoReservado.getInstance());
        assertFalse(pedido.devolver());
    }

    @Test
    public void naoDeveEntregarPedidoReservado() {
        pedido.setEstado(PedidoEstadoReservado.getInstance());
        assertFalse(pedido.entregar());
    }

    @Test
    public void naoDeveReservarPedidoReservado() {
        pedido.setEstado(PedidoEstadoReservado.getInstance());
        assertFalse(pedido.reservar());
    }

    @Test
    public void deveTransportarPedidoReservado() {
        pedido.setEstado(PedidoEstadoReservado.getInstance());
        assertTrue(pedido.transportar());
        assertEquals(PedidoEstadoTransporte.getInstance(), pedido.getEstado());
    }




    /////////////////////////////////////////////////////////////////////// Pedido Transporte

    @Test
    public void deveCancelarPedidoTransporte() {
        pedido.setEstado(PedidoEstadoTransporte.getInstance());
        assertTrue(pedido.cancelar());
        assertEquals(PedidoEstadoCancelado.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveConcluirPedidoTransporte() {
        pedido.setEstado(PedidoEstadoTransporte.getInstance());
        assertFalse(pedido.concluir());
    }

    @Test
    public void deveDevolverPedidoTransporte() {
        pedido.setEstado(PedidoEstadoTransporte.getInstance());
        assertTrue(pedido.devolver());
        assertEquals(PedidoEstadoDevolvido.getInstance(), pedido.getEstado());
    }

    @Test
    public void DeveEntregarPedidoTransporte() {
        pedido.setEstado(PedidoEstadoTransporte.getInstance());
        assertTrue(pedido.entregar());
        assertEquals(PedidoEstadoEntregue.getInstance(), pedido.getEstado());
    }

    @Test
    public void naoDeveReservarPedidoTransporte() {
        pedido.setEstado(PedidoEstadoTransporte.getInstance());
        assertFalse(pedido.reservar());
    }

    @Test
    public void naoDeveTransportarPedidoTransporte() {
        pedido.setEstado(PedidoEstadoTransporte.getInstance());
        assertFalse(pedido.transportar());
    }
}