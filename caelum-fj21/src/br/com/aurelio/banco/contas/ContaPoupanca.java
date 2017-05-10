package br.com.aurelio.banco.contas;

//public class ContaPoupanca implements ContaInterface{
public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca>{
	
	//protected double saldo;
	
	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic;
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		//Alternative
		return this.getNomeDoCliente().compareTo(o.getNomeDoCliente());
		//return Integer.compare(this.getNumero(), outra.getNumero());
//		if (this.getNumero() < o.getNumero()) {
//			return -1;
//		}
//		if (this.getNumero() > o.getNumero()) {
//			return 1;
//		}
//		return 0;
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
	public String toString(){
		return "nome do cliente: " + this.nomeDoCliente + " numero da conta " + this.getNumero();
	}
	
}
