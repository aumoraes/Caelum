package br.com.aurelio.banco.contas;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	List<Conta> contas = new ArrayList<Conta>();
	
	public void adiciona(Conta c){
		contas.add(c);
	}
	
	public Conta pegaConta(int x){
		return contas.get(x);
	}
	
	public int pegaTotalDeContas(){
		return contas.size();
	}
}
