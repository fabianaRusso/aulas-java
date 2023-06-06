package aula10;

public abstract class Pessoa { // classe abstrata são classes que não podem ser instanciadas, porém podem ser
								// derivadas (herdadas)
	private String nome;

	public Pessoa(String nome) {
		// super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void falar() {
		System.out.println("Olá");
	}
}
