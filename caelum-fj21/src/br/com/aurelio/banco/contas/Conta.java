package br.com.aurelio.banco.contas;

/**
* Classe responsável por moldar as Contas do Banco
*
* @author Aurelio de Moraes
*/

public abstract class Conta {
	
	private double saldoReal;
	private double limite;
	protected Cliente cliente;
	
	
	public Conta(double limite) {
		this.limite = limite;
	}
	
	public void deposita(double valor) throws ValorInvalidoException {
		if( valor < 0 ){
			//throw new IllegalArgumentException("Você tentou depositar" + " um valor negativo");
			throw new ValorInvalidoException(valor);
			
		}
		this.saldoReal += valor;
	}
	public boolean saca(double valor) {
		if (!isSaldoSuficiente(valor)) {
			return false;
		} else {
			this.saldoReal = this.saldoReal - valor;
			return true;
		}
	}

	public double getSaldo() {
		return this.saldoReal;
	}
	
	private boolean isSaldoSuficiente(double valor) {
		return (this.saldoReal + this.limite) > valor;
	}
	
	public String getClienteNome(){
		return cliente.getNome();
	}
	public String getClienteTelefone(){
		return cliente.getNome();
	}
	public String getCliente(){
		return cliente.getNome();
	}
	
	public String getClienteToString(){
		return "Nome: " + cliente.getNome() + ", Telefone: " + cliente.getTelefone();
	}
	
	public abstract void atualiza(double taxaSelic);
}
