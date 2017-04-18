package br.com.aurelio.banco.contas;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	//Funcionario[] empregado;
	List<Funcionario> empregado = new ArrayList<Funcionario>();
	String cnpj;
	String nome;
	//int ponteiro = 0;
	
//	public Empresa(int qntDeFuncionarios){
//		this.empregado = new Funcionario[qntDeFuncionarios];
//	}
	
	public void adiciona(Funcionario f){
//		this.empregado[ponteiro] = f;
//		ponteiro++;
		this.empregado.add(f);
	}
	
	public Funcionario getFuncionario (int posicao) {
		//return this.empregado[posicao];
		return this.empregado.get(posicao);
	}
	
	public void mostraEmpregados(){
		for (int i = 0; i < empregado.size(); i++) {
			System.out.println("Funcionário na posição: " + i);
			empregado.get(i).mostra();
		}
	}
	
	public boolean contem(Funcionario f){
		boolean encontrou = false;
		for (Funcionario empregado : this.empregado){
			if(empregado == f){
				encontrou = true;
				break;
			}
		}
		return encontrou;
	}
}
