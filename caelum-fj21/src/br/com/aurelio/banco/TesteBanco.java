package br.com.aurelio.banco;

import br.com.aurelio.banco.contas.Banco;
import br.com.aurelio.banco.contas.ContaCorrente;
import br.com.aurelio.banco.contas.ContaPoupanca;
import br.com.aurelio.banco.contas.ValorInvalidoException;
import br.com.aurelio.banco.sistema.AtualizadorDeContas;

public class TesteBanco {
	public static void main(String[] args) {
		
		
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		Banco banco = new Banco();
		
		cc.deposita(1000);
		try {
			cp.deposita(1000);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		banco.adiciona(cc);
		banco.adiciona(cp);
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		for(int i = 0; i < banco.pegaTotalDeContas(); i++){
			adc.roda(banco.pegaConta(i));
		}
		
		System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}
}
