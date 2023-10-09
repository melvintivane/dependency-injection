package dependency_injection_java;

public class ServicoPedido {
    private RepositorioPedido repositorio;

    // Injeção de dependência por meio de um construtor
    public ServicoPedido(RepositorioPedido repositorio) {
        this.repositorio = repositorio;
    }

    public void ProcessarPedido(Pedido pedido) {
        // Usa o repositório para salvar o pedido
        repositorio.salvar(pedido);
    }
}