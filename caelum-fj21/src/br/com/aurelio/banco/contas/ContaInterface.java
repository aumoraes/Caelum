package br.com.aurelio.banco.contas;

public interface ContaInterface {
	
	public void deposita(double valor);
		
		
	public void saca(double valor);	
	
		
	public double getSaldo();
	
		
	public void atualiza(double taxaSelic);
}
