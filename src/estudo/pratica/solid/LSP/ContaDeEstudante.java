package estudo.pratica.solid.LSP;

public class ContaDeEstudante implements Conta {

	private ManipuladorDeSaldo manipulador;
	private int milhas;

	public ContaDeEstudante() {
		this.manipulador = new ManipuladorDeSaldo();
	}

	public void saca(double valor) {
		manipulador.saca(valor);
	}

	public void depositar(double valor) {
		manipulador.deposita(valor);
		this.milhas += (int) valor;
	}

	public int getMilhas() {
		return this.milhas;
	}

	public double getSaldo() {
		return this.manipulador.getSaldo();
	}
	
	public ManipuladorDeSaldo getManipulador() {
		return manipulador;
	}

	@Override
	public void rende() {
	}
}
