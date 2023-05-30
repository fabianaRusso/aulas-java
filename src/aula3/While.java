package aula3;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		int idade = 0;
		int menorIdade = 0;
		int maiorIdade = 0;

		while (idade >= 0) {
			System.out.println("Digite uma idade: ");
			Scanner leia = new Scanner(System.in);
			idade = leia.nextInt();

			if (idade < 21) {
				menorIdade++;
			} else if (idade > 50) {
				maiorIdade++;
			}

		}
		System.out.println("Total de pessoas menores de 21 anos: " + menorIdade);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiorIdade);

	}

}
