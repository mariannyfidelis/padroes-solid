package estudo.pratica.solid.LSP;

public interface Conta {

	public void rende();

	public void saca(double valor);

	public void depositar(double valor) ;

	public double getSaldo() ;
	
	public ManipuladorDeSaldo getManipulador();

}
