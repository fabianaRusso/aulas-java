package aula2;

import java.util.Scanner;

public class LacoCondicional {

	public static void main(String[] args) {
		int a, b, c;

		Scanner scan = new Scanner(System.in);
		System.out.println("Digite A: ");
		a = scan.nextInt();

		System.out.println("Digite B: ");
		b = scan.nextInt();

		System.out.println("Digite C: ");
		c = scan.nextInt();

		if ((a + b) > c) {
			System.out.println("A Soma de A + B é Maior do que C");

		} else if ((a + b) < c) {
			System.out.println("A Soma de A + B é Menor do que C");
		}else if((a+b)==c) {
			System.out.println("A Soma de A + B é Igual a C");
		}
		
	}

}
