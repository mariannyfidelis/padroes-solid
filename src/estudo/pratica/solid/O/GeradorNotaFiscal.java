package estudo.pratica.solid.O;

import java.util.List;

public class GeradorNotaFiscal {

	private final List<AcaoAposGerarNota> acoes;

	public GeradorNotaFiscal(List<AcaoAposGerarNota> acoes) {
		this.acoes = acoes;
	}

	public NotaFiscal gera(Fatura fatura) {

		double valor = fatura.getValorMensal();

		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		for (AcaoAposGerarNota acaoAposGerarNota : acoes) {
			acaoAposGerarNota.executa(nf);
		}

		return nf;
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}