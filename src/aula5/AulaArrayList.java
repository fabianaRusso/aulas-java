package aula5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AulaArrayList {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		
	ArrayList<Double> notas = new ArrayList<Double>();
	
	Double num = 0.0;
	
	for(int i =0; i<= 5; i++) {
		System.out.println("Digite numeros positivos: ");
		num = Ler.nextDouble();
		notas.add(num);
	}
		System.out.println("\nNotas cadastradas: " + notas);
		
		System.out.println("\nPosição de notas: " + notas.indexOf(5d));
		
		Collections.sort(notas);
		
		for (Double nota : notas) {
			System.out.println(nota);
			
		}
		
		System.out.println("\nNotas cadastradas - Interface Iterator");

		

	}

}
