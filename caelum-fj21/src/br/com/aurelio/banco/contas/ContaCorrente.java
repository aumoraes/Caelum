package br.com.aurelio.banco.contas;

//public class ContaCorrente implements ContaTributavel{
public class ContaCorrente extends Conta{
	
	//protected double saldo;
	
	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic * 2;	
	}
	
	@Override
	public void deposita(double valor) throws ValorInvalidoException {
		if( valor < 0 ){
			//throw new IllegalArgumentException("Você tentou depositar" + " um valor negativo");
			throw new ValorInvalidoException(valor);
			
		}
		this.saldo += valor - 0.10;
	}
//	@Override
//	public double calculaTributos() {
//		return this.getSaldo() * 0.01;
//	}
//	@Override
//	public void saca(double valor) {
//		this.saldo -= valor;		
//	}
//	@Override
//	public double getSaldo() {
//		return this.saldo;
//	}
	
}
