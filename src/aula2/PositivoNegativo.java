package aula2;

import java.util.Scanner;

public class PositivoNegativo {

	public static void main(String[] args) {
		int numero;

		Scanner num = new Scanner(System.in);
		System.out.println("Digite um número: \n");
		numero = num.nextInt();

		if (numero % 2 == 0 && numero >= 0) {
			System.out.println("O Número " + numero + " é par e positivo!");

		} else if (numero % 2 != 0 && numero >= 0) {
			System.out.println("O Número " + numero + " é ímpar e positivo!");

		}else if (numero % 2 == 0 && numero < 0) {
			System.out.println("O Número " + numero + " é par e negativo!");

		}else if (numero % 2 != 0 && numero < 0) {
			System.out.println("O Número " + numero + " é ímpar e negativo!");

		}

	}

}
