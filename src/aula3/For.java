package aula3;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {

		int numero;
		int numPar = 0;
		int numImpar = 0;

		for (int i = 1; i <= 10; i++) {
			System.out.println("Digite o " + i + "º número: ");

			Scanner leia = new Scanner(System.in);
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				numPar++;
			} else {
				numImpar++;
			}
		}

		System.out.println("Total de números pares: " + numPar);
		System.out.println("Total de números ímpares: " + numImpar);

	}

}
