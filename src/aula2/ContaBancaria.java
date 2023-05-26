package aula2;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {

		double saldo, saque, deposito, novoSaldo;

		int operacao;

		saldo = 1000.00;

		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o código da operação: 1 = saldo, 2 = saque e 3 = depósito: \n ");
		operacao = leia.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("Operação - Saldo\n");
			System.out.printf("Saldo: R$ " + "%.2f", saldo);
			break;
		case 2:
			System.out.println("saque");
			Scanner valorSaque = new Scanner(System.in);
			System.out.println("Digite o valor para Saque: \n");
			saque = valorSaque.nextDouble();
			if (saque > saldo) {
				System.out.println("Operação - Saque \n");
				System.out.printf("Saldo Insuficiente!");
			} else {
				novoSaldo = saldo - saque;
				System.out.println("Operação - Saque \n");
				System.out.printf("Novo Saldo: R$ " + "%.2f", novoSaldo);
			}
			break;
		case 3:
			System.out.println("depósito");
			Scanner valorDeposito = new Scanner(System.in);
			System.out.println("Digite o valor para o Depósito: \n");
			deposito = valorDeposito.nextDouble();
			novoSaldo = saldo + deposito;
			System.out.println("Operação - Depósito \n");
			System.out.printf("Novo Saldo: R$ " + "%.2f", novoSaldo);
			break;

		default:
			System.out.println("Operação Inválida");
		}

	}

}
