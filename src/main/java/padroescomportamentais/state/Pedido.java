package padroescomportamentais.state;

public class Pedido {
    
    private String nome;
    private PedidoEstado estado;

    public Pedido() {
        this.estado = PedidoEstadoTransporte.getInstance();
    }
    
    public void setEstado(PedidoEstado estado) {
        this.estado = estado;
    }
    
    public boolean cancelar() {
        return estado.cancelar(this);
    }
    
    public boolean concluir() {
        return estado.concluir(this);
    }

    public boolean devolver() {
        return estado.devolver(this);
    }

    public boolean entregar() {
        return estado.entregar(this);
    }
    public boolean reservar() {
        return estado.reservar(this);
    }

    public boolean transportar() {
        return estado.transportar(this);
    }



    public String getNomeEstado() {
        return estado.getEstado();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PedidoEstado getEstado() {
        return estado;
    }    
}
