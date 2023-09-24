package org.example;

import java.util.Scanner;

public class AppBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao aplicativo bancário!");

        // Criando um cliente
        System.out.print("Digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        Cliente cliente = new Cliente(nomeCliente);

        // Criando uma conta poupança para o cliente
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        cliente.setConta(contaPoupanca);

        // Realizando operações bancárias
        while (true) {
            System.out.println("\nEscolha uma operação:");
            System.out.println("1. Ver saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Emitir extrato");
            System.out.println("0. Sair");
            System.out.print("Opção: ");

            int opcao = scanner.nextInt();
            double valor;

            switch (opcao) {
                case 1:
                    System.out.println("Saldo atual: R$" + contaPoupanca.getSaldo());
                    break;

                case 2:
                    System.out.println("Saldo atual: R$" + contaPoupanca.getSaldo());
                    System.out.print("Digite o valor para depositar: R$");
                    valor = scanner.nextDouble();
                    contaPoupanca.depositar(valor);
                    System.out.println("Depósito realizado com sucesso.");
                    break;

                case 3:
                    System.out.println("Saldo atual: R$" + contaPoupanca.getSaldo());
                    System.out.print("Digite o valor para sacar: R$");
                    valor = scanner.nextDouble();
                    contaPoupanca.sacar(valor);
                    break;

                case 4:
                    System.out.println("Extrato da Conta Poupança - Saldo: R$" + contaPoupanca.getSaldo());
                    break;

                case 0:
                    System.out.println("Obrigado por usar nosso aplicativo bancário. Até a próxima!");
                    return;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }

            // Pergunta ao usuário se deseja voltar ao menu principal
            System.out.print("Pressione qualquer tecla para voltar ao menu principal...");
            scanner.nextLine(); // Limpa o buffer
            scanner.nextLine(); // Aguarda o usuário pressionar qualquer tecla
        }
    }
}

