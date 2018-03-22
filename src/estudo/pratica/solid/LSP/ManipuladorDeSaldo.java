package estudo.pratica.solid.LSP;

public class ManipuladorDeSaldo {

	private double saldo;

	public void saca(double valor) {
		this.saldo -= valor;
	}
	
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public double getSaldo() {
		return saldo;
	}

	public void rende(double taxa)  { 
	    this.saldo *= taxa;
	}
}