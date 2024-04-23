## Cliente_ClienteEspecial

O código apresenta uma simulação simples de um sistema bancário em Java, onde são modelados clientes comuns e clientes especiais, cada um com características e comportamentos específicos.

Na classe `Banco`, é criado um array de clientes que inclui instâncias de `ClienteComum` e `Cliente_Especial`. Isso permite simular operações como depósitos e saques em contas bancárias.

A classe `ClienteComum` representa um cliente básico do banco, com atributos como nome, ID e saldo. Essa classe possui métodos para realizar operações como alteração do saldo (para depósito) e saque de dinheiro.

Já a classe `Cliente_Especial` herda de `ClienteComum` e adiciona um atributo de limite de crédito. Isso permite que clientes especiais possam realizar saques mesmo quando seus saldos são insuficientes, desde que o valor do saque não exceda o limite de crédito.

Durante a execução do programa, são realizadas iterações sobre os clientes para demonstrar diferentes operações, como alteração de saldo e saques respeitando os limites de cada tipo de cliente.

Esse código é útil para entender conceitos de herança, polimorfismo e encapsulamento em Java, além de mostrar como modelar e simular operações bancárias básicas em um sistema orientado a objetos.

