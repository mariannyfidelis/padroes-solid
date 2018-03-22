package estudo.pratica.solid.LOD;

import java.util.List;

public class ProcessadorDeBoletos {

	public void processa(List<Boleto> boletos, Fatura fatura) {

		for (Boleto boleto : boletos) {
			Pagamento pagamento = new Pagamento(boleto.getValor(), MeioPagamento.BOLETO);
			fatura.adicionaPagamento(pagamento);
		}
	}
}