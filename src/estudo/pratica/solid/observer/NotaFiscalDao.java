package estudo.pratica.solid.observer;

public class NotaFiscalDao implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("salvando no banco ;) ...");
	}
}
