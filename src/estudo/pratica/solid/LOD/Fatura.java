package estudo.pratica.solid.LOD;

import java.util.ArrayList;
import java.util.List;

public class Fatura {

	private String cliente;
	private double valor;
	private List<Pagamento> pagamentos;
	private boolean pago;

	public Fatura(String cliente, double valor) {
		this.cliente = cliente;
		this.valor = valor;
		this.pagamentos = new ArrayList<Pagamento>();
		this.pago = false;
	}

	public String getCliente() {
		return cliente;
	}

	public double getValor() {
		return valor;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public boolean isPago() {
		return pago;
	}

	public void adicionaPagamento(Pagamento pagamento) {

		pagamentos.add(pagamento);
		double total = 0;
		for (Pagamento pag : pagamentos) {
			total += pag.getValor();
		}

		if (total >= valor) {
			pago = true;
		}
	}
}
