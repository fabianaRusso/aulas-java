package aula11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExemploTryCatch {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int dividendo = 0;
		int divisor = 0;

		try {
			System.out.println("Digite o dividendo: ");
			dividendo = ler.nextInt();

			System.out.println("Digite o divisor: ");
			divisor = ler.nextInt();

			divide(dividendo, divisor);

		} catch (InputMismatchException e) {
			System.out.println("Por favor, digite apenas valores numéricos");
			System.out.println("Nome da Exceção Disparada: " + e);
		} catch (ArithmeticException a) {
			System.out.println("\nO número digitado precisa ser diferente de 0");
			System.err.println("Nome da exceção Disparada: " + a);
		}
	}

	private static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));

	}

}
