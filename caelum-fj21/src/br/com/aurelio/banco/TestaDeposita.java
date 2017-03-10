package br.com.aurelio.banco;

import br.com.aurelio.banco.contas.Conta;
import br.com.aurelio.banco.contas.ContaPoupanca;
import br.com.aurelio.banco.contas.ValorInvalidoException;

public class TestaDeposita {

	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e);
		}
		

	}

}
