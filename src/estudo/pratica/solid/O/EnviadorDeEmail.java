package estudo.pratica.solid.O;

public class EnviadorDeEmail implements AcaoAposGerarNota {

	public void executa(NotaFiscal nf) {
		System.out.println("enviando email ;) ...");
	}
}
