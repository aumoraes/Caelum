package br.com.aurelio.banco.contas;

//public class ContaPoupanca implements ContaInterface{
public class ContaPoupanca extends Conta{
	
	protected double saldo;
	
	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic;
	}
	
//	@Override
//	public void deposita(double valor) {
//		this.saldo += valor - 0.10;
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
