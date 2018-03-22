package estudo.pratica.solid.LSP;

public class ContaComum implements Conta {

	private ManipuladorDeSaldo manipulador;

	public ContaComum() {
		this.manipulador = new ManipuladorDeSaldo();
	}

	public void rende() {
		this.manipulador.rende(1.1);
	}

	public void saca(double valor) {
		manipulador.saca(valor);
	}

	public void depositar(double valor) {
		manipulador.deposita(valor);
	}

	public double getSaldo() {
		return this.manipulador.getSaldo();
	}

	public ManipuladorDeSaldo getManipulador() {
		return manipulador;
	}
}