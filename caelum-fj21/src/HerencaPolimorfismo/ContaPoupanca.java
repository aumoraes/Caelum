package HerencaPolimorfismo;

public class ContaPoupanca extends Conta{

	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic;
	}
	
}
