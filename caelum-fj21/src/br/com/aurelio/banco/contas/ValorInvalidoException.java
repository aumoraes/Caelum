package br.com.aurelio.banco.contas;

public class ValorInvalidoException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ValorInvalidoException(double valor) {
		super("Valor invlálido: " + valor);
	}
}
