package br.com.aurelio.banco.contas;

/**
* Classe responsável por moldar as Contas do Banco
*
* @author Aurelio de Moraes
*/

public abstract class Conta {
	protected double saldo;
	private double saldoReal;
	private double limite;
	
	/**
	* Metodo que incrementa o saldo.
	* @param valor
	*/
	
//	public Conta(double limite) {
//		this.limite = limite;
//	}
	
	public void deposita(double valor) throws ValorInvalidoException {
		if( valor < 0 ){
			//throw new IllegalArgumentException("Você tentou depositar" + " um valor negativo");
			throw new ValorInvalidoException(valor);
			
		}
		this.saldo += valor;
	}
	public boolean saca(double valor) {
		if (!isSaldoSuficiente(valor)) {
			return false;
		} else {
			this.saldoReal = this.saldoReal - valor;
			return true;
		}
	}
	private boolean isSaldoSuficiente(double valor) {
		return (this.saldoReal + this.limite) > valor;
	}
	public double getSaldo() {
		return this.saldo;
	}
	
	public abstract void atualiza(double taxaSelic);
}
