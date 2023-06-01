package aula6;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionQueue {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		Queue<String> cliente = new LinkedList<String>();

		int menu = 0;
		String nome;

		System.out.print("\n*---------------------------------*\t");
		System.out.print("\n|  1 - Adicionar cliente na Fila  |\t");
		System.out.print("\n|  2 - Listar todos os clientes   |\t");
		System.out.print("\n|  3 - Retirar cliente da fila    |\t");
		System.out.print("\n|  0 - Sair                       |\t");
		System.out.print("\n*---------------------------------*\t");
		do {
			System.out.print("\nEntre com a opção desejada: ");
			menu = leia.nextInt();

			if (menu == 1) {
				System.out.println("Digite o nome: ");
				nome = leia.next();
				cliente.add(nome);

				System.out.println("\nFila: ");

				System.out.println(cliente);
				System.out.println("Cliente Adicionado!");
			}

			if (menu == 2) {
				System.out.println("\nLista de Clientes na Fila: ");
				System.out.println(cliente);

			}

			if (menu == 3) {
				if (cliente.isEmpty()) {
					System.out.println("A Fila está vazia!");

				} else {
					cliente.remove();
					System.out.println("\nFila: ");
					System.out.println(cliente);
					System.out.println("O Cliente foi Chamado!");

				}

			}

		} while (menu != 0);
		System.out.println("Programa Finalizado!");

	}
}
