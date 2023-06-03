package aula8;

public class Ingresso {

	private String tipo;
	private double valor;
	private String dataEvento;
	private String localEvento;
	private int numeroAssento;

	public Ingresso(String tipo, double valor, String dataEvento, String localEvento, int numeroAssento) {
		// super();
		this.tipo = tipo;
		this.valor = valor;
		this.dataEvento = dataEvento;
		this.localEvento = localEvento;
		this.numeroAssento = numeroAssento;

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataEvento() {
		return dataEvento;
	}

	public void setDataEvento(String dataEvento) {
		this.dataEvento = dataEvento;
	}

	public String getLocalEvento() {
		return localEvento;
	}

	public void setLocalEvento(String localEvento) {
		this.localEvento = localEvento;
	}

	public int getNumeroAssento() {
		return numeroAssento;
	}

	public void setNumeroAssento(int numeroAssento) {
		this.numeroAssento = numeroAssento;
	}

	public void visualizar(Ingresso ingresso) {
		System.out.println("Tipo do Ingresso : " + ingresso.getTipo());
		System.out.println("Valor do Ingresso : " + ingresso.getValor());
		System.out.println("Data do Evento: " + ingresso.dataEvento);
		System.out.println("Local do Evento: " + ingresso.localEvento);
		System.out.println("Número do Assento: " +ingresso.numeroAssento);
		
	}

}
