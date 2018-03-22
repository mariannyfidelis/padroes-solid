package estudo.pratica.solid.OD;

public class TabelaPrecoDiferenciada implements TabelaPreco {
	
	public double descontoPara(double valor) {
		if (valor > 15000)
			return 0.05;
		if (valor > 2000)
			return 0.06;
		return 0;
	}
}