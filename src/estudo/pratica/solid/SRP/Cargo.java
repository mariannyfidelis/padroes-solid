package estudo.pratica.solid.SRP;

public enum Cargo {
	
	DESENVOLVEDOR(new DezOuVintePorCento()),
	DBA(new DezOuVintePorCento()),
	TESTER(new QuinzeOuVinteCincoPorCento());
	
	private RegraDeCalculo regra;

	Cargo(RegraDeCalculo regra) {
		this.regra = regra;
	}

	public RegraDeCalculo getRegra() {
		return regra;
	}
}
