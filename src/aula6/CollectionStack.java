package aula6;

import java.util.Scanner;
import java.util.Stack;

public class CollectionStack {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		Stack<String> pilha = new Stack<String>();

		int menuOpcao = 0;

		System.out.print("\n*---------------------------------*\t");
		System.out.print("\n|  1 - Adicionar livro na pilha   |\t");
		System.out.print("\n|  2 - Listar todos os livros     |\t");
		System.out.print("\n|  3 - Retirar livro da pilha     |\t");
		System.out.print("\n|  0 - Sair                       |\t");
		System.out.print("\n*---------------------------------*\t");
		//menuOpcao = leia.nextInt();
		//leia.nextLine();
		
		do {
			System.out.println("\nEntre com a opção desejada: ");
			menuOpcao = leia.nextInt();
			leia.nextLine();
			// = leia.nextLine();
			

			if (menuOpcao == 1) {
				System.out.println("Digite o nome:");
				String livro = leia.next();
				leia.nextLine();      //quando você chama leia.nextLine() essa quebra de linha é lida e interpretada como uma entrada vazia


				
				
				
				pilha.push(livro);

				System.out.println("\nPilha: ");
				System.out.println(pilha);
				System.out.println("Livro adicionado!");
			}

			if (menuOpcao == 2) {
				System.out.println("Lista de Livros na Pilha:");
				System.out.println(pilha);

			}

			if (menuOpcao == 3) {
				if (pilha.isEmpty()) {
					System.out.println("A Pilha está vazia!");

				} else {
					pilha.pop();
					System.out.println("Pilha:");
					System.out.println(pilha);
					System.out.println("Um Livro foi retirado da pilha!");
				}

			}

		} while (menuOpcao != 0);

		System.out.println("Programa Finalizado!");

	}

}
