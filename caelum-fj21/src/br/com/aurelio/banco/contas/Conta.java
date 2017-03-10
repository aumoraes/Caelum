package br.com.aurelio.banco.contas;

/**
* Classe responsável por moldar as Contas do Banco
*
* @author Aurelio de Moraes
*/

public abstract class Conta {
	protected double saldo;
	
	/**
	* Metodo que incrementa o saldo.
	* @param valor
	*/
	
	public void deposita(double valor) throws ValorInvalidoException {
		if( valor < 0 ){
			//throw new IllegalArgumentException("Você tentou depositar" + " um valor negativo");
			throw new ValorInvalidoException(valor);
			
		}
		this.saldo += valor;
	}
	public void saca(double valor) {
		this.saldo -= valor;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public abstract void atualiza(double taxaSelic);
}
