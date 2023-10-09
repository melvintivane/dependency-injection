package dependency_injection_java;

public class App {
    public static void main(String[] args) {
        int id = 1;
        String descricao = "Exemplo descricao";

        Pedido pedido = new Pedido(id, descricao);
       
        RepositorioPedido repositorioPedido = new RepositorioPedido();

        ServicoPedido servicoPedido = new ServicoPedido(repositorioPedido);

        servicoPedido.ProcessarPedido(pedido);
    }
}
