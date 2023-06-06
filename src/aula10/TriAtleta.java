package aula10;

public class TriAtleta extends Pessoa implements TriAtletaInterface {
	private int idade;

	public TriAtleta(String nome, int idade) {
		super(nome);
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override // anotação para subscrever métodos
	public void falar() {
		System.out.println("Bora treinar...");
	}

	@Override
	public void aquecer() {
		System.out.println("Bora aquecer...");

	}

	@Override
	public void pedalar() {
		System.out.println("Bora pedalar...");

	}

	@Override
	public void correr() {
		System.out.println("Bora correr...");

	}

	@Override
	public void nadar() {
		System.out.println("Bora nadar...");

	}
}
