package br.com.aurelio.banco;

import br.com.aurelio.banco.contas.Conta;
import br.com.aurelio.banco.contas.ContaCorrente;
import br.com.aurelio.banco.contas.ContaPoupanca;
import br.com.aurelio.banco.contas.ValorInvalidoException;
import br.com.aurelio.banco.sistema.AtualizadorDeContas;

public class TestaAtualizadorDeContas{
	public static void main(String[] args) {
		
		
//		ContaCorrente cc = new ContaCorrente();
//		ContaPoupanca cp = new ContaPoupanca();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupanca();
		
		
		try {
			cc.deposita(1000);
			cp.deposita(1000);
		} catch (ValorInvalidoException e) {
			e.printStackTrace();
		}
		
		
		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		
		
		adc.roda(cc);
		
		adc.roda(cp);
		
		System.out.println("Saldo Total: " + adc.getSaldoTotal());
	}

//	@Override
//	public void atualiza(double taxaSelic) {
//		// TODO Auto-generated method stub
//		
//	}
}
