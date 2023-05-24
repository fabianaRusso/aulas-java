package aula1;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		float salario, abono, novoSalario;
		
		Scanner leia = new Scanner(System.in);
		System.out.println("Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = leia.nextFloat();
		
		 novoSalario = salario + abono;
		System.out.printf("Novo Salário: " +"%.2f" , novoSalario);
	}

}
