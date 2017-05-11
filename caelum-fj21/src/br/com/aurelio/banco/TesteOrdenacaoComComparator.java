package br.com.aurelio.banco;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.aurelio.banco.contas.Conta;
import br.com.aurelio.banco.contas.ContaPoupanca;
import br.com.aurelio.banco.contas.ValorInvalidoException;

public class TesteOrdenacaoComComparator{
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
		
		Comparator<Conta> comparadorNome = new Comparator<Conta>() {
			public int compare(Conta s1, Conta s2) {
				return s1.getNomeDoCliente().compareTo(s2.getNomeDoCliente());
			}
		};
		
		
		Comparator<Conta> comparadorNumero= new Comparator<Conta>() {
			public int compare(Conta s1, Conta s2) {
				return Integer.compare(s1.getNumero(), s2.getNumero() );
				
			}
		};
		
		Comparator<Conta> comparadorSaldo= new Comparator<Conta>() {
			public int compare(Conta s1, Conta s2) {
				return Double.compare(s1.getSaldo(), s2.getSaldo() );
				
			}
		};
			
		
		Collections.sort(contas, comparadorNome);
		//Example usando LAMBDA DO JAVA 8
		//Collections.sort(contas, (s1, s2) -> s1.getNomeDoCliente().compareTo(s2.getNomeDoCliente() ) );
		System.out.println(contas.toString());
		
		Collections.sort(contas, comparadorNumero);
		//Collections.sort(contas, (s1, s2) -> Integer.compare(s1.getNumero(), s2.getNumero()) );
		System.out.println(contas.toString());
		
		Collections.sort(contas, comparadorSaldo);
		//Collections.sort(contas, (s1, s2) -> Double.compare(s1.getSaldo(), s2.getSaldo()) );
		System.out.println(contas.toString());
		
		
		
		
	}
}
