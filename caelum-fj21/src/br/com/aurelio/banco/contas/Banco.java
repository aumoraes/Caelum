package br.com.aurelio.banco.contas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Banco {
	//List<ContaInterface> contas = new ArrayList<ContaInterface>();
	List<Conta> contas = new ArrayList<Conta>();
	private Map<String, Conta> mapaDeContas = new HashMap();
//	public void adiciona(ContaInterface c){
//		contas.add(c);
//	}
	public void adiciona(Conta c){
		mapaDeContas.put(c.getNomeDoCliente(), c);
		contas.add(c);
	}
	
//	public ContaInterface pegaConta(int x){
//		return contas.get(x);
//	}
	public Conta pegaConta(int x){
		return contas.get(x);
	}
	
	public int pegaTotalDeContas(){
		return contas.size();
	}
	public Conta buscaPorNome(String nome){
		return mapaDeContas.get(nome);
	}
}
