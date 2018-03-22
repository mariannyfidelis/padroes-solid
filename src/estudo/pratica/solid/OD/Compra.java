package estudo.pratica.solid.OD;

public class Compra {

	private double valor;
	private String cidade;
	private String produto;
	
	public Compra(double valor, String cidade, String produto) {
		this.valor = valor;
		this.cidade = cidade;
		this.produto = produto;
	}

	public double getValor() {
		return valor;
	}

	public String getCidade() {
		return cidade;
	}
	
	public String getProduto() {
		return produto;
	}
}
