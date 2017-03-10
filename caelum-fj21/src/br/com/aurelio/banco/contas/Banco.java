package br.com.aurelio.banco.contas;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	//List<ContaInterface> contas = new ArrayList<ContaInterface>();
	List<Conta> contas = new ArrayList<Conta>();
	
//	public void adiciona(ContaInterface c){
//		contas.add(c);
//	}
	public void adiciona(Conta c){
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
}
