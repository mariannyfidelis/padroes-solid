package estudo.pratica.solid.O;

public class NotaFiscalDao implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("salvando no banco ;) ...");
	}
}
