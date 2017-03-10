package br.com.aurelio.banco.contas;

public interface ContaInterface {	
	//protected double saldo;
		
	public void deposita(double valor);
		
		
	public void saca(double valor);
		
	
		
	public double getSaldo();
		//return this.saldo;
		
	public void atualiza(double taxaSelic);
}
