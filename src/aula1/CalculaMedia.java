package aula1;

import java.util.Scanner;

public class CalculaMedia {

	public static void main(String[] args) {
		
		float n1, n2,n3, n4, mediaFinal;
		
		
		Scanner nota = new Scanner(System.in);
		System.out.println("Entre com a primeira nota: ");
		n1 = nota.nextFloat();
		
		System.out.println("Entre com a segunda nota: ");
		n2 = nota.nextFloat();
		
		System.out.println("Entre com a terceira nota: ");
		n3 = nota.nextFloat();
		
		System.out.println("Entre com a quarta nota: ");
		n4 = nota.nextFloat();
		
		mediaFinal =(n1 + n2 + n3 + n4)/4;
		System.out.printf("Média Final: %.1f" , mediaFinal );
		
		
		
		
		
		

	}

}
