package estudo.pratica.solid.LOD;

public class Pagamento {

	private double valor;
	private MeioPagamento forma;

	public Pagamento(double valor, MeioPagamento forma) {
		this.valor = valor;
		this.forma = forma;
	}

	public double getValor() {
		return valor;
	}

	public MeioPagamento getForma() {
		return forma;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Pagamento)) {
			return false;
		}
		Pagamento outro = (Pagamento) obj;
		if (forma != outro.forma || Double.doubleToLongBits(valor) != Double.doubleToLongBits(outro.valor)) {
			return false;
		}

		return true;
	}

}