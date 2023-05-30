package aula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CollectionList01 {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);

		// declarando e instanciando lista de cores
		ArrayList<String> cores = new ArrayList<String>();

		String lista;

		// usando o método add() para gravar 5 cores
		cores.add("Azul");
		cores.add("Verde");
		cores.add("Amarelo");
		cores.add("Branco");
		cores.add("Laranja");

		int i;

		// mostrando os "n" p/ cores da lista (usando o índice)
		// número de elementos da lista: método size()

		int n = cores.size();

		for (i = 0; i < n; i++) {
			System.out.println("Digite uma cor: \n");
			lista = Ler.next();
			cores.add(lista);
		}

		System.out.println("\nListar todas as cores: " + cores);

		System.out.println("Ordenar as cores: \n" + cores.get(i));

		Collections.sort(cores);
		for (String cor : cores) {
			System.out.println(cor);

		}

	}

}
