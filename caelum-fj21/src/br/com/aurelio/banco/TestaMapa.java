package br.com.aurelio.banco;

import java.util.HashMap;
import java.util.Map;

import br.com.aurelio.banco.contas.Conta;
import br.com.aurelio.banco.contas.ContaCorrente;
import br.com.aurelio.banco.contas.ValorInvalidoException;

public class TestaMapa {

	public static void main(String[] args) {
		Conta c1 = new ContaCorrente();
		Conta c2 = new ContaCorrente();
		try {
			c1.deposita(10000);
			c2.deposita(3000);
		} catch (ValorInvalidoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// cria o mapa
		Map<String, Conta> mapaDeContas = new HashMap<>();
		// adiciona duas chaves e seus valores
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		// qual a conta do diretor?
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());

	}

}
