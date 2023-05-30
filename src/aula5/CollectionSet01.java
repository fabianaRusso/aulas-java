package aula5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;



public class CollectionSet01 {

	public static void main(String[] args) {
		
		Set<Integer> setNumeros = new HashSet<Integer>();
		
		Integer num = Integer.valueOf(10);
		
		Scanner leia = new Scanner(System.in);
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Entre com um número: \n");
			num = leia.nextInt();
			setNumeros.add(num);
			
			
			
		}
		
		System.out.println("Listar dados do set: \n" + setNumeros);
		System.out.println("Listar dados do set: \n" + setNumeros.iterator());
		
		
		
		//Collections.sort(setNumeros);
		for (Integer numero : setNumeros) {
			System.out.println(num);

		}
		
		//Iterator<Integer>isetNumeros = setNumeros.iterator();
		
		
		

	}

}
