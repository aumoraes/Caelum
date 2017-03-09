package HerencaPolimorfismo;

public class TesteBanco {
	public static void main(String[] args) {
		
		
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		Banco banco = new Banco();
		
		cc.deposita(1000);
		cp.deposita(1000);
		
		
		banco.adiciona(cc);
		banco.adiciona(cp);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		for(int i = 0; i < banco.pegaTotalDeContas(); i++){
			adc.roda(banco.pegaConta(i));
		}
		
		System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}
}
