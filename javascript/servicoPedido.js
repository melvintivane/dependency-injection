class ServicoPedido {
    constructor(repositorio) {
        this.repositorio = repositorio;
    }

    processarPedido(pedido){
        // Usa o repositório para salvar o pedido
        this.repositorio.salvar(pedido);
    }
}

module.exports = ServicoPedido;