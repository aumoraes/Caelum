package br.com.aurelio.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.aurelio.banco.contas.Conta;
import br.com.aurelio.banco.contas.ContaPoupanca;
import br.com.aurelio.banco.contas.ValorInvalidoException;

public class TestaOrdenacao {
	public static void main(String[] args) throws ValorInvalidoException {
		
		List<ContaPoupanca> contas = new ArrayList<>();
		
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setNumero(1973);
		c1.setNomeDoCliente("joao");
		c1.deposita( (double) 500 );
		contas.add(c1);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(1462);
		c2.setNomeDoCliente("maria");
		c2.deposita( (double) 50000 );
		contas.add(c2);
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNumero(1854);
		c3.setNomeDoCliente("aurelio");
		c3.deposita( (double) 700 );
		contas.add(c3);
		
		System.out.println(contas.toString());
		
//		Classe ContaPoupança precisa implementar COMPARABLE
//		Para usar o sorts
//		Melhor usar comparator
//		Collections.sort(contas);
//		System.out.println(contas.toString());
		
	}
}
