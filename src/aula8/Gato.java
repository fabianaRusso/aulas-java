package aula8;

public class Gato {
	private String nome;
	private String raca;
	private int idade;
	private float peso;
	
	
	
	public Gato(String nome, String raca, int idade, float peso) {    //método construtor
		//super(); // só usa quando utilizamos herança
		this.nome = nome;
		this.raca = raca;
		this.idade = idade;
		this.peso = peso;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getRaca() {
		return raca;
	}



	public void setRaca(String raca) {
		this.raca = raca;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public float getPeso() {
		return peso;
	}



	public void setPeso(float peso) {
		this.peso = peso;
	}



	public void miar() {
		System.out.println("Miaaaauuuu");
	}

}
