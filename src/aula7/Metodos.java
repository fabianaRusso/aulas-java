package aula7;

public class Metodos {

	public static void main(String[] args) {
		int resultado = 0;
		String texto;

		resultado = somar(7, 5);

		System.out.println("Resultado: " + resultado);
		exibir();

	}

	public static int somar(int num1, int num2) {    
		return num1 + num2;

	}

	public static void exibir() {
		System.out.println("Olá turma! "); // quando usamos void não usa return

	}

}
