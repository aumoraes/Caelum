package br.com.aurelio.empresa;

import java.util.HashMap;
import java.util.Map;

public class Empresa {
	Map<String, Funcionario> empregado = new HashMap();
	//List<Funcionario> empregado = new ArrayList();
	//Set<Funcionario> empregado = new HashSet();
	String cnpj;
	String nome;


	public void adiciona(Funcionario f){
		this.empregado.put(f.getNome(), f);
		//this.empregado.add(f);
	}
	
	public int qtdFuncionarios(){
		//return	this.empregado.size();
		return 0;
	}
	public Funcionario getFuncionario (int index) {
		//return this.empregado.get(index);
		return  null;
	}
	
	public void mostraEmpregados(){
		
		for (Map.Entry<String, Funcionario> entry : empregado.entrySet())
		{
		    System.out.println( entry.getValue().toString() );
		}
//		for(Funcionario f : empregado){
//			System.out.println( f.toString() );
//		}
		
	}
	
	@Override
	public String toString() {
		return "Empresa [empregado=" + empregado + ", cnpj=" + cnpj + ", nome=" + nome + "]";
	}

	//public boolean contem(String nome){
	public boolean contem(Funcionario f){
		return empregado.containsKey( nome );
		//return empregado.contains(f);
	}
}
