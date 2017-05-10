package br.com.aurelio.banco;

import java.util.ArrayList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.aurelio.banco.contas.ContaPoupanca;

public class TestaOrdenacao {
	public static void main(String[] args) {
		
		List<ContaPoupanca> contas = new ArrayList<>();
		
		ContaPoupanca c1 = new ContaPoupanca();
		c1.setNumero(1973);
		c1.setNomeDoCliente("joao");
		contas.add(c1);
		
		ContaPoupanca c2 = new ContaPoupanca();
		c2.setNumero(1462);
		c2.setNomeDoCliente("maria");
		contas.add(c2);
		
		ContaPoupanca c3 = new ContaPoupanca();
		c3.setNumero(1854);
		c3.setNomeDoCliente("aurelio");
		contas.add(c3);
		
		System.out.println(contas.toString());
		Collections.sort(contas);
		System.out.println(contas.toString());
	}
}
