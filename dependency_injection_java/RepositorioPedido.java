package dependency_injection_java;

public class RepositorioPedido {

    public RepositorioPedido() {

    }

    public void salvar(Pedido pedido) {
        System.out.println(pedido.toString());
    }

}
