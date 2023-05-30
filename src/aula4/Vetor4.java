package aula4;

public class Vetor4 {

	public static void main(String[] args) {
		int vetor[] = {2,5,1,3,4,9,7,8,10,6};
		float soma = 0;
		float media ;
		
		System.out.println("Elementos nos índices ímpares: ");
		for(int i = 0; i< vetor.length; i++) {
			if(i %2 != 0) {
				System.out.print(vetor[i] + " ");
			}
		}
		System.out.println("\nElementos pares: ");
		for(int i = 0; i< vetor.length; i++) {
			
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i] + " ");
			}
			soma = soma + vetor[i];
		}
		System.out.printf("\nSoma: %.0f" ,soma);
		
		System.out.printf("\nMédia: %.2f" , (media = soma / vetor.length));

	}

}
