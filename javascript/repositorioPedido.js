class RepositorioPedido {
    salvar(pedido) {
        console.log(`Salvando pedido: ${JSON.stringify(pedido)}`)
    }
}

module.exports = RepositorioPedido;