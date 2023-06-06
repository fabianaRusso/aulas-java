package aula9;

public class Automovel extends Terrestre {

	String cor;
	private int numeroRodas;
	private String placa;
	private int marcha;

	public Automovel(int capacidade, int numeroRodas, float velocidade, String cor, String placa, int marcha) {
		super(capacidade, numeroRodas, velocidade);
		this.cor = cor;
		this.numeroRodas = numeroRodas;
		this.placa = placa;
		this.marcha = marcha;
	}
	

		
	

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getNumeroRodas() {
		return numeroRodas;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getMarcha() {
		return marcha;
	}

	public void setMarcha(int marcha) {
		this.marcha = marcha;
	}

	public void visualizar() {

		super.visualizar();
		System.out.println("cor: " + this.cor);
		System.out.println("Placa: " + this.placa);
		System.out.println("Marcha: " + this.marcha);
	}

}
