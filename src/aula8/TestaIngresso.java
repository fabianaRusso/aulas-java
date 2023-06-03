package aula8;

public class TestaIngresso {

	public static void main(String[] args) {
		Ingresso ingresso1 = new Ingresso("Inteira", 600.50, "22/09/2023", "Espaço Unimed", 10);

		Ingresso ingresso = new Ingresso(null, 0, null, null, 0);
		ingresso.setDataEvento("23/09/2023");
		ingresso.setLocalEvento("Espaço Unimed");
		ingresso.setNumeroAssento(5);
		ingresso.setTipo("Meia");
		ingresso.setValor(300.50);

		

		ingresso.visualizar(ingresso);
		ingresso1.visualizar(ingresso1);

	}

}
