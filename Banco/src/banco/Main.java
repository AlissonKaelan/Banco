/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package banco;

/**
 *
 * @author Alisson Kaelan
 */
public class Main {

    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco();

        conta1.setNumConta(111);
        conta1.setDono("Alisson");
        conta1.abrirConta("Conta Corrente");

        ContaBanco conta2 = new ContaBanco();
        conta2.setNumConta(122);
        conta2.setDono("Carol");
        conta2.abrirConta("Conta Poupança");

        //Mostar Estado na Tela antes do deposito
        conta1.estadoAtual();
        conta2.estadoAtual();

        conta1.depositar(2000);
        conta2.depositar(5000);

        //Mostar Estado na Tela depois do deposito
        conta1.estadoAtual();
        conta2.estadoAtual();

        conta1.sacar(500);
        conta2.sacar(500);
        //Etado depois do saque
        conta1.estadoAtual();
        conta2.estadoAtual();
    }

}
