const RepositorioPedido = require ('./repositorioPedido');
const ServicoPedido = require('./servicoPedido');


// Criando uma instância do RepositorioPedido
const repositorio = new RepositorioPedido();

// Injetando a dependência no ServicoPedido
const  servico = new ServicoPedido(repositorio);

// Simulando um pedido
const pedido = {id: 1, descricao: "Pedido exemplo"}

// Processando o pedido usando o serviço
servico.processarPedido(pedido);