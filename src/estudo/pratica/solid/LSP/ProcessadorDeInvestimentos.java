package estudo.pratica.solid.LSP;

import java.util.Arrays;
import java.util.List;

/* A sigla LSP significa Liskov Subtitutive Principle, 
 * Princípio de Substituição de Liskov.*/

public class ProcessadorDeInvestimentos {

	public static void main(String[] args) {

		for (Conta conta : contasDoBanco()) {
			conta.rende();

			System.out.println("Novo Saldo:");
			System.out.println(conta.getSaldo());
		}
	}

	private static List<Conta> contasDoBanco() {
		return Arrays.asList(umaContaCom(100), umaContaCom(150), contaDeEstudanteCom(200));
	}

	private static Conta contaDeEstudanteCom(double amount) {
		Conta c = new ContaDeEstudante();
		c.getManipulador().deposita(amount);
		return c;
	}

	private static Conta umaContaCom(double valor) {
		Conta c = new ContaComum();
		c.getManipulador().deposita(valor);
		return c;
	}
}