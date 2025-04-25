package Ex_03;

import java.util.Scanner;

public class MainConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        String numeroConta = scanner.nextLine();

        System.out.print("Digite o nome do titular: ");
        String nomeTitular = scanner.nextLine();

        System.out.print("Digite o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldoInicial);

        conta.exibirInfoConta();

        System.out.print("\nDigite o valor para depósito: ");
        double valorDeposito = scanner.nextDouble();
        conta.depositar(valorDeposito);

        System.out.print("Digite o valor para saque: ");
        double valorSaque = scanner.nextDouble();
        conta.sacar(valorSaque);

        System.out.println("Saldo final: R$" + conta.consultarSaldo());

        scanner.close();
    }
}
