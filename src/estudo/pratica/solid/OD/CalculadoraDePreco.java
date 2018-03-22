package estudo.pratica.solid.OD;

public class CalculadoraDePreco {

	private TabelaPreco tabela;
	private ServicoEntrega entrega;

	public CalculadoraDePreco(TabelaPreco tabela, ServicoEntrega entrega) {
		this.tabela = tabela;
		this.entrega = entrega;
	}
	
	public double calcula(Compra produto) {
		
		double desconto = tabela.descontoPara(produto.getValor());
		double frete = entrega.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}
}