package aula4;

import java.util.Scanner;

public class Vetor3 {

	public static void main(String[] args) {

		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 }; 

		int num; // declaração de variável

		int indice = -1;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número que você deseja encontrar: ");
		num = leia.nextInt();

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == num) {
				indice = i;
			}
		}

		if (indice != -1) {
			System.out.println("O número " + num + " está localizado na posição: " + indice);

		} else {
			System.out.println("O número " + num + " não foi encontrado!");
		}

	}
}


