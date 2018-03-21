package estudo.pratica.solid.observer;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("enviando email ;) ...");
	}
}
