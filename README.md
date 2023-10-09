# Projeto de Exemplo de Dependency Injection com Java e JavaScript

Este é um pequeno projeto de exemplo que demonstra o conceito de injeção de dependência usando as linguagens Java e JavaScript. A injeção de dependência é uma técnica fundamental no desenvolvimento de software, que visa tornar o código mais modular, flexível e testável, permitindo que as dependências de um componente sejam injetadas em vez de serem criadas dentro do próprio componente.

## Estrutura do Projeto

O projeto consiste em três classes Java e dois módulos JavaScript:

### Classes Java

#### 1. `Pedido`

A classe `Pedido` representa um pedido com um ID e uma descrição.

#### 2. `RepositorioPedido`

A classe `RepositorioPedido` é responsável por salvar um pedido.

#### 3. `ServicoPedido`

A classe `ServicoPedido` depende do `RepositorioPedido` para processar um pedido. A dependência é injetada por meio de um construtor.

### Módulos JavaScript

#### 1. `repositorioPedido.js`

Este módulo JavaScript define a classe `RepositorioPedido`, que é semelhante à classe Java equivalente e também é responsável por salvar um pedido.

#### 2. `servicoPedido.js`

Este módulo JavaScript define a classe `ServicoPedido`, que depende do `RepositorioPedido` e usa a injeção de dependência para processar um pedido.

## Executando o Projeto

Para executar este projeto, você pode seguir estas etapas:

1. Certifique-se de ter o ambiente de desenvolvimento Java e Node.js instalado em seu sistema.

2. Clone este repositório em sua máquina local:

   ```bash
   git clone https://github.com/melvintivane/nome-do-repositorio.git

3. Navegue até a pasta raiz do projeto:
   ```bash
   cd dependency_injection_java

### Usando Java

4. Compile as classes Java:
   ```
   javac dependency_injection_java/*.java
5. Execute o aplicativo Java:
   ```
   java dependency_injection_java.App
### Usando JavaScript
4. Execute o módulo JavaScript
   ```
   node pedido.js
