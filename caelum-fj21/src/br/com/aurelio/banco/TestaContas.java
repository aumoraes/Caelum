package br.com.aurelio.banco;

import br.com.aurelio.banco.contas.ContaCorrente;
import br.com.aurelio.banco.contas.ContaPoupanca;
import br.com.aurelio.banco.contas.ValorInvalidoException;

public class TestaContas {
	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		cc.deposita(1000);
		try {
			cp.deposita(1000);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cc.atualiza(0.01);
		cp.atualiza(0.01);
		
		System.out.println(cc.getSaldo());
		System.out.println(cp.getSaldo());
	}
}