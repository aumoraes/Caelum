package br.com.aurelio.banco.contas;

/**
* Classe responsável por moldar as Contas do Banco
*
* @author Aurelio de Moraes
*/

public abstract class Conta {
	protected double saldo;
	protected int numero;
	protected String nomeDoCliente;
	
	
	
	public String getNomeDoCliente() {
		return nomeDoCliente;
	}
	public void setNomeDoCliente(String nomeDoClient) {
		this.nomeDoCliente = nomeDoClient;
	}
	public int getNumero(){
		return this.numero;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nomeDoCliente == null) ? 0 : nomeDoCliente.hashCode());
		result = prime * result + numero;
		long temp;
		temp = Double.doubleToLongBits(saldo);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (nomeDoCliente == null) {
			if (other.nomeDoCliente != null)
				return false;
		} else if (!nomeDoCliente.equals(other.nomeDoCliente))
			return false;
		if (numero != other.numero)
			return false;
		if (Double.doubleToLongBits(saldo) != Double.doubleToLongBits(other.saldo))
			return false;
		return true;
	}
	
	
}
