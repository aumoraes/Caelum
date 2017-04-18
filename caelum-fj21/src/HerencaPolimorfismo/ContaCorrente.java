package HerencaPolimorfismo;

public class ContaCorrente extends Conta{
	

	@Override
	public void deposita(double valor) {
		this.saldo += valor - 0.10;
	}

	@Override
	public void atualiza(double taxaSelic) {
		this.saldo += this.saldo * taxaSelic * 2;
	}
		
}
