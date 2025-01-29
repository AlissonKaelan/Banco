# Documentação do Projeto Java: ContaBanco

## Índice
- [Descrição do Projeto](#descrição-do-projeto)
- [Classe ContaBanco](#classe-contabanco)
  - [Atributos](#atributos)
  - [Métodos](#métodos)
  - [Métodos Especiais](#métodos-especiais)
- [Classe Main](#classe-main)
- [Exemplo de Uso](#exemplo-de-uso)

## Descrição do Projeto
Este projeto implementa um sistema simples de gerenciamento de contas bancárias em Java. A classe `ContaBanco` permite a criação de contas, depósitos, saques, fechamento de contas e pagamento de mensalidades. A classe `Main` demonstra como utilizar a classe `ContaBanco`.

## Classe ContaBanco

### Atributos
- `numConta` (int): Número da conta bancária.
- `tipo` (String): Tipo da conta (ex: "CC" para Conta Corrente, "CP" para Conta Poupança).
- `dono` (String): Nome do proprietário da conta.
- `saldo` (float): Saldo atual da conta.
- `status` (boolean): Status da conta (aberta ou fechada).

### Métodos
- `estadoAtual()`: Exibe o estado atual da conta, incluindo número, tipo, dono, saldo e status.
- `abrirConta(String tipo)`: Abre uma nova conta do tipo especificado. Inicializa o saldo com valores padrão (50 para Conta Corrente e 150 para Conta Poupança).
- `fecharConta()`: Fecha a conta se o saldo for zero e não houver débito.
- `depositar(float valor)`: Realiza um depósito na conta, se a conta estiver aberta.
- `sacar(float valor)`: Realiza um saque da conta, se a conta estiver aberta e houver saldo suficiente.
- `pagarMensal()`: Paga a mensalidade da conta, se a conta estiver aberta. O valor da mensalidade varia de acordo com o tipo da conta.

### Métodos Especiais
- `ContaBanco()`: Construtor que inicializa o saldo como 0 e o status como falso (fechado).
- `getNumConta()`: Retorna o número da conta.
- `setNumConta(int numConta)`: Define o número da conta.
- `getTipo()`: Retorna o tipo da conta.
- `setTipo(String tipo)`: Define o tipo da conta.
- `getDono()`: Retorna o nome do dono da conta.
- `setDono(String dono)`: Define o nome do dono da conta.
- `getSaldo()`: Retorna o saldo da conta.
- `setSaldo(float saldo)`: Define o saldo da conta.
- `getStatus()`: Retorna o status da conta.
- `setStatus(boolean status)`: Define o status da conta.

## Classe Main
A classe `Main` contém o método `main`, que é o ponto de entrada do programa. Ela cria instâncias da classe `ContaBanco`, configura suas propriedades e demonstra o uso dos métodos disponíveis.

## Exemplo de Uso
```java
public class Main {
    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();
        conta1.setNumConta(111);
        conta1.setDono("Alisson");
        conta1.abrirConta("CC");

        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(122);
        conta2.setDono("Carol");
        conta2.abrirConta("CP");

        // Mostrar estado na tela antes do depósito
        conta1.estadoAtual();
        conta2.estadoAtual();

        conta1.depositar(2000);
        conta2.depositar(5000);

        // Mostrar estado na tela depois do depósito
        conta1.estadoAtual();
        conta2.estadoAtual();

        conta1.sacar(500);
        conta2.sacar(500);

        // Estado depois do saque
        conta1.estadoAtual();
        conta2.estadoAtual();
    }
}
```

