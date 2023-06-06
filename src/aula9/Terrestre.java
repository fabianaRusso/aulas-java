package aula9;

public class Terrestre extends Transporte {
	private int numeroRodas;
	protected float velociade;

	public Terrestre(int capacidade, int numeroRodas, float velociade) {
		super(numeroRodas);
		this.numeroRodas = numeroRodas;
		this.velociade = velociade;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public float getVelociade() {
		return velociade;
	}

	public void setVelociade(float velociade) {
		this.velociade = velociade;
	}

	public void visualizar() {

		super.visualizar();
		System.out.println("Número de rodas: " + this.numeroRodas);
		System.out.println("Velocidade: " + this.velociade);

	}
}
