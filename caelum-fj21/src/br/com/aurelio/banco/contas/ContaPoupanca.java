package br.com.aurelio.banco.contas;

//public class ContaPoupanca implements ContaInterface{
//public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {
//Melhor usar comparator do que comparable;
public class ContaPoupanca extends Conta {

	// protected double saldo;

	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic;
	}
//	Melhor usar COMPARATOR
//	@Override
//	public int compareTo(ContaPoupanca o) {
//		return this.getNomeDoCliente().compareTo(o.getNomeDoCliente());
//	}

	// @Override
	// public void deposita(double valor) {
	// this.saldo += valor - 0.10;
	// }

	// @Override
	// public void saca(double valor) {
	// this.saldo -= valor;
	// }

	// @Override
	// public double getSaldo() {
	// return this.saldo;
	// }
	public String toString() {
		return "nome do cliente: " + this.nomeDoCliente + " numero da conta " + this.getNumero();
	}

}
